package com.mjtx.servlet;

import com.mjtx.dao.UserDao;
import com.mjtx.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/22 19:41
 */
public class UserAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        User user = null;
        if (username == null || "".equals(username) || password == null || "".equals(password)) {
            response.sendRedirect("/mjtx/register.html");
            return;
        } else {
            user = new User(null, username, password, sex, email);
        }
        UserDao userDAO = new UserDao();
        int add = userDAO.add(user);

        String html;
        if ((add == 1)) {
            html = "注册成功";
        } else {
            html = "注册失败";
        }
        response.getWriter().print(html);
    }
}
