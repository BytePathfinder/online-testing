<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">
<head>
    <meta charset="UTF-8">
    <title>题目删除</title>
</head>
<body>
<div align="center"><h2>题目删除</h2></div>
<hr>
<div align="center">
    <form action="/mjtx/questions/delete" method="get">
        题目ID：<input type="text" name="questionId"/><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>