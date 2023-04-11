package com.example.assignment_java4_thinhlhph19459.servlet;

import com.example.assignment_java4_thinhlhph19459.dao.FavoriteDAO;
import com.example.assignment_java4_thinhlhph19459.dao.VideoDAO;
import com.example.assignment_java4_thinhlhph19459.model.FavoriteEntity;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.example.assignment_java4_thinhlhph19459.model.VideoEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet({
        "/video"
})
public class Video_detailServlet extends HttpServlet {
    VideoDAO dao = new VideoDAO();
    FavoriteDAO fdao = new FavoriteDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        String action = request.getParameter("action");
        String id = request.getParameter("id");

//        doGetWatched(response,request);
        VideoEntity video = dao.getVideoById(id);

        request.setAttribute("video", video);

        if (action.equals("watch")) {
            addCookie(request, response);
            request.getRequestDispatcher("/views/layout/detail-page.jsp").forward(request, response);
        } else if (action.equals("like")) {
            addFavorite(request,response);
            request.getRequestDispatcher("/views/layout/detail-page.jsp").forward(request,response);
        }
    }

//    private void doGetWatched(HttpServletResponse response, HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//
//        List<String> watchedVideoIds = new ArrayList<>();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("watched_videos")) {
//                    String cookieValue = cookie.getValue();
//                    String[] videoIds = cookieValue.split(",");
//                    watchedVideoIds = Arrays.asList(videoIds);
//                }
//            }
//        }
//
//        List<VideoEntity> list = dao.getallVideoCookie(String.valueOf(watchedVideoIds));
//        System.out.println(list.size());
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void addCookie(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        if (id != null) {
            VideoEntity video = dao.getVideoById(id);
            if (video != null) {
                Cookie cookie = new Cookie("watched_videos", video.getVideoid());
                cookie.setMaxAge(24 * 60 * 60);
                response.addCookie(cookie);

                video.setViews(video.getViews() + 1);
                dao.update(video);
            }
        }
    }

    private void addFavorite(HttpServletRequest request, HttpServletResponse response) {
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        String uid = user.getUserid();
        String id = request.getParameter("id");
        try{

        VideoEntity video = new VideoEntity();
        FavoriteEntity favorite = new FavoriteEntity();
        video.setVideoid(id);
        favorite.setVideo(video);

        UserEntity entity = new UserEntity();
        entity.setUserid(uid);
        favorite.setUser(entity);

        favorite.setLikedate(new Date());

        fdao.insertFavorite(favorite);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
