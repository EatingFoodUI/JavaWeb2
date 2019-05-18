<%--
  Created by IntelliJ IDEA.
  User: 46933
  Date: 2019/5/18
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form action="SignServlet" method="post" style="padding-top: -700px;">
        输入用户名:<input name="name" type="text"><br><br>
        输入密码:<input name="pwd" type="password"><br><br>
        选择性别:<input type="radio" name="sex" value="男" checked>男
                 <input type="radio" name="sex" value="女" checked>女
        选择家乡:
        <select name="home">
            <option value="上海">上海</option>
            <option value="重庆">重庆</option>
        </select><br>
        填写个人信息:<br>
        <textarea name="info" rows="5" cols="30"></textarea><br>
        <input type="reset" value="重置"><input type="submit" value="注册">
    </form>
</body>
</html>
