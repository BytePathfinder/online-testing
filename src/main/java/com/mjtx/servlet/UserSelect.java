package com.mjtx.servlet;

import com.mjtx.dao.UserDao;
import com.mjtx.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/25 0:24
 */
public class UserSelect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"utf-8\">\n" +
                "\t\t<title>select</title>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t<div align=\"center\">\n" +
                "\t\t\t<h1>查询</h1>\n" +
                "\t\t</div>\n" +
                "\t\t<hr />\n" +
                "\t\t<div align=\"center\">\n" +
                "\t\t\t<table border=\"1\">\n" +
                "\t\t\t\t<tr>\n" +
                "\t\t\t\t\t<th>userid</th>\n" +
                "\t\t\t\t\t<th>username</th>\n" +
                "\t\t\t\t\t<th>password</th>\n" +
                "\t\t\t\t\t<th>sex</th>\n" +
                "\t\t\t\t\t<th>email</th>\n" +
                "\t\t\t\t</tr>");
        UserDao userDAO = new UserDao();
        for (User user : userDAO.select()) {

            writer.print("<tr>");
            writer.print("<td>" + user.getId() + "</td>");
            writer.print("<td>" + user.getUsername() + "</td>");
            writer.print("<td>" + user.getPassword() + "</td>");
            writer.print("<td>" + user.getGender() + "</td>");
            writer.print("<td>" + user.getEmail() + "</td>");
            writer.print("</tr>");
        }
        writer.print("</table>\n" +
                "\t\t</div>\n" +
                "\t</body>\n" +
                "</html>");
    }
}
