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
 * @version V1.0 2021/2/27 17:27
 */
public class QuestionAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String question = req.getParameter("questionsContent");
        String optionA = req.getParameter("optionA");
        String optionB = req.getParameter("optionB");
        String optionC = req.getParameter("optionC");
        String optionD = req.getParameter("optionD");
        String answer = req.getParameter("answer");
        Questions questions = new Questions(null,question,optionA,optionB,optionC,optionD,answer);
        QuestionsDao dao= new QuestionsDao();
        int add = dao.add(questions);
        if(add==1){
            resp.getWriter().print("添加成功");
        }else{
            resp.getWriter().print("添加失败");
        }

    }
}
