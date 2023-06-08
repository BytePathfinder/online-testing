package com.mjtx.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * <pre>
 *  全局编码过滤器
 * </pre>
 *
 * @author XuBiao 1534089606@qq.com
 * @since 2023/6/8 10:51
 */
@WebFilter(filterName = "globalEncodingFilter", urlPatterns = "/*")
public class GlobalEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("GlobalEncodingFilter过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("GlobalEncodingFilter过滤器销毁");
    }
}
