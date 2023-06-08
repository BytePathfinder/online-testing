<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">
<head>
    <meta charset="utf-8">
    <title>update</title>
</head>
<body>
<div align="center"><h2>考生信息更新</h2></div>
<hr>
<div align="center">
    <form action="http://localhost:8080/mjtx/user/update" method="get">
        <table>
            <tr>
                <td>用户ID</td>
                <td><input type="text" name="userid"/></td>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <input type="radio" name="sex" value="男" checked/>男
                    <input type="radio" name="sex" value="女"/>女
                </td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="email" name="email"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="注册"/></td>
                <td><input type="reset" name="重置"/></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
