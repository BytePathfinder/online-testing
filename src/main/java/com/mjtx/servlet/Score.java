package com.mjtx.servlet;

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
 * @version V1.0 2021/2/27 23:15
 */
public class Score extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Questions> list = (List) session.getAttribute("key");
        int score = 0;
        for (Questions q : list) {
            String answer = q.getAnswer();
            Integer id = q.getQuestionId();
            String testAnswer = req.getParameter("answer_" + id);
            if (answer.equals(testAnswer)) {
                score += 10;
            }
        }
        req.setAttribute("score", score);
        req.getRequestDispatcher("/score.jsp").forward(req,resp);
    }
}
