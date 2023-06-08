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
 * @version V1.0 2021/2/25 1:48
 */
public class UserUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String userid = request.getParameter("userid");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        User user = new User(Integer.parseInt(userid), username, password, sex, email);
        UserDao userDAO = new UserDao();
        int update = userDAO.update(user);
        if (update == 1) {
            response.getWriter().print("更新成功");
        } else {
            response.getWriter().print("更新失败");
        }


    }

}
