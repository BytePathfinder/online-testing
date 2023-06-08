<%--
  Created by IntelliJ IDEA.
  User: mojitianxia
  Date: 2021/2/22
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <h1 align="center">登录</h1>
  <hr />
  <div id="form" align="center">

    <form action="/mjtx/login" method="post">
      <table border="0" cellspacing="" cellpadding="">
        <tr>
          <td>姓名：</td>
          <td><input type="text" name="username" id="username" /></td>
        </tr>
        <tr>
          <td>密码</td>
          <td><input type="password" name="password" id="userpassword" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="提交" /></td>
          <td><input type="reset" value="重置" /></td>
        </tr>
      </table>
    </form>

  </div>
  </body>
</html>
