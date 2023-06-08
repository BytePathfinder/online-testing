<%@ page import="com.mjtx.entity.Questions" %>
<%@ page import="java.util.List" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<div align="center">
    <h2>测试</h2>
    <hr/>

    <table border="1px" align="center">
        <form action="/mjtx/score" method="get">
            <tr>
                <td>试题编号</td>
                <td>试题正文</td>
                <td>选项A</td>
                <td>选项B</td>
                <td>选项C</td>
                <td>选项D</td>
                <td>答案</td>
            </tr>

                <%
                HttpSession session1 = request.getSession();
                List<Questions> list = (List) session1.getAttribute("key");%>
                <%
            for (Questions q : list) {
        %>
            <tr>
                <td aria-readonly="true"><%=q.questionId%>
                </td>
                <td><%=q.questionContent%>
                </td>
                <td><%=q.optionA%>
                </td>
                <td><%=q.optionB%>
                </td>
                <td><%=q.optionC%>
                </td>
                <td><%=q.optionD%>
                </td>
                <td>
                    A<input type="radio" name="answer_<%=q.questionId%>" value="A"/>
                    B<input type="radio" name="answer_<%=q.questionId%>" value="B"/>
                    C<input type="radio" name="answer_<%=q.questionId%>" value="C"/>
                    D<input type="radio" name="answer_<%=q.questionId%>" value="D"/>
                </td>
            </tr>
                <%
            }
        %>
            <tr>
                <td colspan="7" align="center"><input type="submit" value="交卷"/></td>
            </tr>
    </table>
    </form>
</div>
</body>
</html>

