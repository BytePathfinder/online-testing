<%--
  Created by IntelliJ IDEA.
  User: mojitianxia
  Date: 2021/2/27
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>得分</title>
</head>
<body>
        <div style="font-size:36px;color: brown "align="center">
            您本次得分为：<%=request.getAttribute("score")%>
        </div>
</body>
</html>
