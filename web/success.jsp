<%--
  Created by IntelliJ IDEA.
  User: 46933
  Date: 2019/5/18
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>成功页面</title>
</head>

<body>
    ${xiaoxi}<br>
    <a href="SearchUser">查看所有用户</a>
</body>
</html>
