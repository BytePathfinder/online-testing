<%@ page import="com.mjtx.entity.Questions" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mojitianxia
  Date: 2021/2/27
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>资料库</title>
</head>
<body>
<div align="center">
    <h2>资料库</h2>
    <hr/>

    <table border="1px" align="center">
        <tr>
            <td>试题编号</td>
            <td>试题正文</td>
            <td>选项A</td>
            <td>选项B</td>
            <td>选项C</td>
            <td>选项D</td>
            <td>答案</td>
        </tr>

        <%List<Questions> list = (List) request.getAttribute("key");%>
        <%
            for (Questions q : list) {
        %>
        <tr>
            <td><%=q.questionId%></td>
            <td><%=q.questionContent%></td>
            <td><%=q.optionA%></td>
            <td><%=q.optionB%></td>
            <td><%=q.optionC%></td>
            <td><%=q.optionD%></td>
            <td><%=q.answer%></td>
        </tr>
        <%
           }
        %>
    </table>
</div>
</body>
</html>
