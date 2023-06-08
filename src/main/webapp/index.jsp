<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">
<head>
    <title>趣味测试</title>
</head>
<body>
<table border="0.1px" width="1500" height=720" align="center">
    <tr height="10%">
        <th colspan="2" style="color: rosybrown;font-size: 27px;">趣味测试</th>
    </tr>
    <tr height="85%">
        <td width="10%" valign="top">
            <ol style="list-style: none">
                <font style="font-size: 21px; color: brown">学生信息</font>
                <li><a href="/mjtx/register.jsp" target="content">学生注册</a></li>
                <li><a href="/mjtx/user/select" target="content">学生查询</a></li>
                <li><a href="/mjtx/update.jsp" target="content">学生更新</a></li>
                <li><a href="/mjtx/delete.jsp" target="content">学生删除</a></li>
            </ol>
            <ol style="list-style:none">
                <font style="font-size: 21px; color: brown">试题信息</font>
                <li><a href="/mjtx/questionsAdd.jsp" target="content">试题注册</a></li>
                <li><a href="/mjtx/questions/select" target="content">试题查询</a></li>
                <li><a href="/mjtx/questionsUpdate.jsp" target="content">试题更新</a></li>
                <li><a href="/mjtx/questionsDelete.jsp" target="content">试题删除</a></li>
            </ol>
            <ol style="list-style:none">
                <font style="font-size: 21px; color: brown">考试</font>
                <li><a href="/mjtx/test" target="content">参加考试</a></li>
            </ol>
        </td>
        <td bgcolor="beige">
            <iframe src="http://localhost:8080/mjtx/user/select?noCache=random" width="100%" height="100%"
                    name="content"></iframe>
        </td>
    </tr>
    <tr height="5%">
        <td colspan="2">版权信息:小鱼悠游出品</td>
    </tr>
</table>
</body>
</html>
