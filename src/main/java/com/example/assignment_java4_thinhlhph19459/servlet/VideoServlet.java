package com.example.assignment_java4_thinhlhph19459.servlet;

import com.example.assignment_java4_thinhlhph19459.dao.VideoDAO;
import com.example.assignment_java4_thinhlhph19459.model.VideoEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/video/index")
public class VideoServlet extends HttpServlet {

    VideoDAO dao;

    public VideoServlet() {
        dao = new VideoDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        List<VideoEntity> listAllVideo = dao.getallVideo();
        request.setAttribute("videos", listAllVideo);

        request.getRequestDispatcher("/views/layout/index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
