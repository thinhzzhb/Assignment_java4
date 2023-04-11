package com.example.assignment_java4_thinhlhph19459.servlet.admin;

import com.example.assignment_java4_thinhlhph19459.dao.UserDAO;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import com.example.assignment_java4_thinhlhph19459.model.VideoEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.util.List;

@WebServlet({"/admin/user"})
public class UserServlet extends HttpServlet {
    UserDAO dao = new UserDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (user != null && user.getAdmin() == true){
        String action = request.getParameter("action");
        switch (action){
            case "show":
                getListUser(request,response);
                request.getRequestDispatcher("/views/admin/userList.jsp").forward(request,response);
                break;
            case "delete":
                deleteVideo(request,response);
                break;
            case "add":
                request.setAttribute("isEdit", false);
                request.getRequestDispatcher("/views/admin/userCreate.jsp").forward(request,response);
                break;
            case "edit":
                request.setAttribute("isEdit", true);
                String id = request.getParameter("id");
                UserEntity userEntity = dao.getEntityById(id);
                request.setAttribute("entity", userEntity);
                request.getRequestDispatcher("/views/admin/userCreate.jsp").forward(request,response);
                break;
        }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (user != null && user.getAdmin() == true){
        String action = request.getParameter("action");
        switch (action){
            case "add":
                addVideo(request, response);
                break;
            case "edit":
                editVideo(request, response);
                break;
        }
        }
    }
    private void getListUser(HttpServletRequest request, HttpServletResponse response){
        List<UserEntity> list = dao.getAllUser();
        request.setAttribute("user", list);
    }
    private void addVideo(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
        UserEntity user = new UserEntity();
        try {
            BeanUtils.populate(user, request.getParameterMap());
            user.setUserid(dao.nameId(user.getFullname()));
            UserEntity userEntity = dao.create(user);
            if (userEntity != null){
                response.setStatus(204);
            } else{
                response.setStatus(400);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private void editVideo(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
        String uidOrigin = request.getParameter("uidOrigin");
        UserEntity user = dao.getEntityById(uidOrigin);
        try {
            BeanUtils.populate(user, request.getParameterMap());
            UserEntity userEntity = dao.update(user);
            if (userEntity != null){
                response.setStatus(204);
            } else{
                response.setStatus(400);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void deleteVideo(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
        String id = request.getParameter("id");
        UserEntity entity = dao.delete(id);
        if (entity != null){
            response.setStatus(204);
        } else{
            response.setStatus(400);
        }
    }
}
