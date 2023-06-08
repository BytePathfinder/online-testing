package com.mjtx.servlet;

import com.mjtx.dao.QuestionsDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/27 21:49
 */
public class QuestionsDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String questionId = req.getParameter("questionId");
        QuestionsDao dao = new QuestionsDao();
        int delete = dao.delete(Integer.parseInt(questionId));
        if (delete==1){
            resp.getWriter().print("删除成功");
        }else{
            resp.getWriter().print("删除失败");
        }
    }
}
