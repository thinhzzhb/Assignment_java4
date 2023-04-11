package com.example.assignment_java4_thinhlhph19459.filter;

import com.example.assignment_java4_thinhlhph19459.common.SessionUtils;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


//@WebFilter({"/favorite", "/likeVideo", "/unlikeVideo", "/shareVideo", "/admin", "/report", "/changer", "/edit-profile", "/video/*", "/user/*"})
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) response;
        if (!SessionUtils.isLogin((HttpServletRequest) request)) {
            resp.sendRedirect("/Assignment_java4_thinhlhph19459/user/login");
            return;
        }
        request.setAttribute("isLogin", SessionUtils.isLogin((HttpServletRequest) request));
        chain.doFilter(request, response);
    }
}

