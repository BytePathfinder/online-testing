package com.mjtx.servlet;

import com.mjtx.dao.AdminDao;
import com.mjtx.entity.Admin;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/24 22:09
 */
public class UserLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Admin admin = new Admin(username, password);
        AdminDao adminDAO = new AdminDao();
        boolean login = adminDAO.login(admin);
        resp.setContentType("text/html;charset=utf-8");
        if (login) {
            HttpSession session = req.getSession();
            resp.sendRedirect("/mjtx/index.jsp");
        } else {
            resp.sendRedirect("/mjtx/login.jsp");
        }

    }
}
