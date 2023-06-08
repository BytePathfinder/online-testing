<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">
<head>
    <meta charset="UTF-8">
    <title>试题添加</title>
</head>
<body>
<div align="center">
    <h2>试题添加</h2>
    <hr/>
    <form action="/mjtx/questions/add" method="get">
        <table border="1px" align="center">
            <tr>
                <td>试题正文</td>
                <td><input type="text" name="questionsContent"/></td>
            </tr>
            <tr>
                <td>选项A</td>
                <td><input type="text" name="optionA"/></td>
            </tr>
            <tr>
                <td>选项B</td>
                <td><input type="text" name="optionB"/></td>
            </tr>
            <tr>
                <td>选项C</td>
                <td><input type="text" name="optionC"/></td>
            </tr>
            <tr>
                <td>选项D</td>
                <td><input type="text" name="optionD"/></td>
            </tr>
            <tr>
                <td>答案</td>
                <td>
                    A<input type="radio" name="answer" value="A"/>
                    B<input type="radio" name="answer" value="B"/>
                    C<input type="radio" name="answer" value="C"/>
                    D<input type="radio" name="answer" value="D"/>
                </td>
            <tr>
                <td colspan="2">
                    <input type="submit" value="添加试题"/>
                    <input type="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>