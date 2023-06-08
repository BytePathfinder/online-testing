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
 * @version V1.0 2021/2/25 1:20
 */
public class UserDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        User user = new User(Integer.parseInt(id), null, null, null, null);
        UserDao dao = new UserDao();
        int delete = dao.delete(user);

        if (delete == 1) {
            resp.getWriter().print("删除成功！");
        } else {
            resp.getWriter().print("删除失败！");
        }
    }
}
