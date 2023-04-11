package com.example.assignment_java4_thinhlhph19459.servlet.admin;

import com.example.assignment_java4_thinhlhph19459.dao.VideoDAO;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import com.example.assignment_java4_thinhlhph19459.model.VideoEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@WebServlet({"/admin/video"})
public class VideoServlet extends HttpServlet {
    private VideoDAO dao = new VideoDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (user != null && user.getAdmin() == true){
            String action = request.getParameter("action");
            switch (action){
                case "view":
                    getListVideo(request,response);
                    request.getRequestDispatcher("/views/admin/viewList.jsp").forward(request,response);
                    break;
                case "delete":
                    deleteVideo(request,response);
                    break;
                case "add":
                    request.setAttribute("isEdit", false);
                    request.getRequestDispatcher("/views/admin/videocreate.jsp").forward(request,response);
                    break;
                case "edit":
                    request.setAttribute("isEdit", true);
                    String id = request.getParameter("id");
                    VideoEntity video = dao.getVideoById(id);
                    request.setAttribute("video", video);
                    request.getRequestDispatcher("/views/admin/videocreate.jsp").forward(request,response);
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

    private void getListVideo(HttpServletRequest request, HttpServletResponse response){
        List<VideoEntity> list = dao.getallVideo();
        request.setAttribute("video", list);
    }
    private void addVideo(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("application/json");
        VideoEntity video = new VideoEntity();
        try {
            BeanUtils.populate(video, request.getParameterMap());
            video.setActive(true);
            video.setViews(0);
            VideoEntity videoEntity = dao.update(video);
            if (videoEntity != null){
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
        String vidOrigin = request.getParameter("vidOrigin");
        VideoEntity video = dao.getVideoById(vidOrigin);
        try {
            BeanUtils.populate(video, request.getParameterMap());
            VideoEntity videoEntity = dao.update(video);
            if (videoEntity != null){
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
        VideoEntity video = dao.delete(id);
        if (video != null){
            response.setStatus(204);
        } else{
            response.setStatus(400);
        }
    }
}
