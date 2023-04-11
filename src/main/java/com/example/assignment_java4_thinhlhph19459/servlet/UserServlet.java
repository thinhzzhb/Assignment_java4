package com.example.assignment_java4_thinhlhph19459.servlet;

import com.example.assignment_java4_thinhlhph19459.dao.SendMailDAO;
import com.example.assignment_java4_thinhlhph19459.dao.UserDAO;
import com.example.assignment_java4_thinhlhph19459.model.FavoriteEntity;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@WebServlet({"/user/login", "/user/forgot", "/user/regis", "/user/logoff", "/user/changer", "/user/myfavorite", "/user/edit-profile"})
public class UserServlet extends HttpServlet {
    UserDAO dao;

    UserEntity entity;
    SendMailDAO sendMailDAO;

    public UserServlet() {
        dao = new UserDAO();
        entity = new UserEntity();
        sendMailDAO = new SendMailDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        if (uri.contains("login")) {
            request.getRequestDispatcher("/views/layout/login.jsp").forward(request, response);
        } else if (uri.contains("regis")) {
            request.getRequestDispatcher("/views/layout/registration.jsp").forward(request, response);
        } else if (uri.contains("changer")) {
            request.getRequestDispatcher("/views/layout/changepass.jsp").forward(request, response);
        } else if (uri.contains("edit-profile")) {
            request.getRequestDispatcher("/views/layout/editprofile.jsp").forward(request, response);
        } else if (uri.contains("myfavorite")) {
            getFavorite(session, response, request);
            request.getRequestDispatcher("/views/layout/favorite.jsp").forward(request, response);
        } else if (uri.contains("forgot")) {
            request.getRequestDispatcher("/views/layout/forgotpass.jsp").forward(request, response);
        } else if (uri.contains("logoff")) {
            logout(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        if (uri.contains("login")) {
            login(session, response, request);
        } else if (uri.contains("regis")) {
            regiter(session, request, response);
        } else if (uri.contains("changer")) {
            changePass(session, response, request);
        } else if (uri.contains("edit-profile")) {
            edit(request, response);
        } else if (uri.contains("forgot")) {
            forgotPass(request, response);
        } else if (uri.contains("myfavorite")) {
        }
    }

    private void login(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        String id = request.getParameter("username");
        String pw = request.getParameter("password");
        try {
            entity = dao.getEntityById(id);
            if (!entity.getPassword().equals(pw)) {
                request.setAttribute("message", "Sai mật khẩu!");
                response.sendRedirect("/Assignment_java4_thinhlhph19459/user/login");

            } else {
                session.setAttribute("user", entity);
                response.sendRedirect("/Assignment_java4_thinhlhph19459/video/index");
            }
        } catch (Exception e) {
            request.setAttribute("message", "Sai tên đăng nhập!");
        }
    }


    private void logout(HttpServletRequest request, HttpServletResponse response) {
        try {
            if (!response.isCommitted()) {
                HttpSession session = request.getSession(false);
                session.removeAttribute("user");
                response.sendRedirect("/Assignment_java4_thinhlhph19459/video/index");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void forgotPass(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String email = request.getParameter("email");

        UserEntity newUserPass = dao.forgotPass(email);

        if (newUserPass != null) {
            sendMailDAO.sendmail(getServletContext(), newUserPass, "forgot");
            response.setStatus(204);
        } else {
            response.setStatus(400);
        }
    }

    private void regiter(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        try {
            String fullname = request.getParameter("fullname");
            BeanUtils.populate(entity, request.getParameterMap());
            entity.setUserid(dao.nameId(fullname));
            entity.setAdmin(false);
            dao.create(entity);
            if (entity != null) {
                sendMailDAO.sendmail(getServletContext(), entity, "welcome");
                session.setAttribute("user", entity);
                response.sendRedirect("/Assignment_java4_thinhlhph19459/video/index");
            } else {
                response.sendRedirect("/Assignment_java4_thinhlhph19459/user/regis");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        try {
            BeanUtils.populate(user, request.getParameterMap());
            entity.setAdmin(false);
            dao.update(user);
            response.sendRedirect("/Assignment_java4_thinhlhph19459/video/index");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void changePass(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        try {

            UserEntity user = (UserEntity) session.getAttribute("user");
            String current = request.getParameter("currentpassword");
            String newP = request.getParameter("newpassword");
            String confirmP = request.getParameter("confirmpassword");

            if (!user.getPassword().equals(current)) {
                request.setAttribute("message", "Mật khẩu cũ không đúng!");
                response.sendRedirect("changer");
            }
            if (!newP.equals(confirmP)) {
                request.setAttribute("message", "Mật khẩu nhập lại không đúng!");
                response.sendRedirect("changer");
            }
            if (!response.isCommitted()) {
                user.setPassword(newP);
                dao.update(user);
                response.sendRedirect("/Assignment_java4_thinhlhph19459/video/index");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getFavorite(HttpSession session, HttpServletResponse response, HttpServletRequest request) {
        UserEntity user = (UserEntity) session.getAttribute("user");//lấy user từ session
        List<FavoriteEntity> favorites = user.getFavorites(); //
        if (favorites != null){
            request.setAttribute("listFavor", favorites);
        } else {
            request.setAttribute("message", "Không có video yêu thích");
        }
        System.out.println(favorites.size());
    }
}

