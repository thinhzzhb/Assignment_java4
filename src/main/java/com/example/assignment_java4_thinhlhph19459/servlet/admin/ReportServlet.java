package com.example.assignment_java4_thinhlhph19459.servlet.admin;

import com.example.assignment_java4_thinhlhph19459.common.JpaUtil;
import com.example.assignment_java4_thinhlhph19459.dao.ReportDao;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/report")
public class ReportServlet extends HttpServlet {
    ReportDao dao = new ReportDao();
    EntityManager em = JpaUtil.getConnection();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (user != null && user.getAdmin() == true){
        String action = request.getParameter("action");
        switch (action){
            case "showFavorite":
                request.setAttribute("items", dao.getInfor());
                request.getRequestDispatcher("/views/admin/reportFavorite.jsp").forward(request, response);
                break;
            case "showUserlike":
                request.setAttribute("items", dao.getInfor());
                request.getRequestDispatcher("/views/admin/reportUserlike.jsp").forward(request, response);
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
            case "showUserlike":
                getUser(request,response);
                request.getRequestDispatcher("/views/admin/reportUserlike.jsp").forward(request, response);
                break;
        }
        }
    }
    private void getUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("application/x-www-form-urlencoded");
        String title = request.getParameter("selectedGroup");
        List<UserEntity> listU = dao.getUserLikeVideos(title);
        System.out.println(listU.size());
        request.setAttribute("user", listU);
    }
}
