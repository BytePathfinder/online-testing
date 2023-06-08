package com.mjtx.servlet;

import com.mjtx.dao.QuestionsDao;
import com.mjtx.entity.Questions;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/27 20:59
 */
public class QuestionsUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String questionId = req.getParameter("questionId");
        String questionsContent = req.getParameter("questionsContent");
        String optionA = req.getParameter("optionA");
        String optionB = req.getParameter("optionB");
        String optionC = req.getParameter("optionC");
        String optionD = req.getParameter("optionD");
        String answer = req.getParameter("answer");
        Questions q = new Questions(Integer.valueOf(questionId),questionsContent,optionA,optionB,optionC,optionD,answer);
        QuestionsDao dao = new QuestionsDao();
        int update = dao.update(q);
        if(update==1){
            resp.getWriter().print("更新成功");
        }else{
            resp.getWriter().print("更新失败");
        }
    }
}
