package com.mjtx.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/26 21:37
 */
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if ("".equals(request.getRequestURI()) || "/mjtx/login.jsp".equals(request.getRequestURI()) || "/mjtx/login".equals(request.getRequestURI()) || "/mjtx/".equals(request.getRequestURI()) || "/mjtx/error.jsp".equals(request.getRequestURI())) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        HttpSession session = request.getSession(false);
        if (session == null) {
            request.getRequestDispatcher("/error.jsp").forward(servletRequest, servletResponse);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

}
