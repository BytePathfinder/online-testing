package com.mjtx.servlet;

import com.mjtx.dao.QuestionsDao;
import com.mjtx.entity.Questions;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/27 22:06
 */
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestionsDao dao = new QuestionsDao();
        List<Questions> list = dao.selectRand();
        HttpSession session = req.getSession(false);
        session.setAttribute("key", list);
        req.getRequestDispatcher("/test.jsp").forward(req, resp);
    }
}
