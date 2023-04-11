package com.example.assignment_java4_thinhlhph19459.servlet.admin;

import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/admin"})
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        String uri = request.getRequestURI();
        if (user != null && user.getAdmin() == true) {
            if (uri.contains("admin")) {
                request.getRequestDispatcher("/views/admin/home.jsp").forward(request, response);
            }
        } else {

            response.sendRedirect("/Assignment_java4_thinhlhph19459/video/index");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
