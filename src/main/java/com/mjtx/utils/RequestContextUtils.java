package com.mjtx.utils;

import jakarta.servlet.http.HttpServletRequest;

/**
 * <pre>
 *  负责抽取request中的对象
 * </pre>
 *
 * @author XuBiao 1534089606@qq.com
 * @since 2023/6/8 11:17
 */
public class RequestContextUtils {
    public static QuestionParameter getExtractQuestionParameter(HttpServletRequest req) {
        String id = req.getParameter("id");
        String question = req.getParameter("questionsContent");
        String optionA = req.getParameter("optionA");
        String optionB = req.getParameter("optionB");
        String optionC = req.getParameter("optionC");
        String optionD = req.getParameter("optionD");
        String answer = req.getParameter("answer");
        return new QuestionParameter(id, question, optionA, optionB, optionC, optionD, answer);
    }

    public record QuestionParameter(String id, String question, String optionA, String optionB, String optionC,
                                    String optionD, String answer) {
    }
}
