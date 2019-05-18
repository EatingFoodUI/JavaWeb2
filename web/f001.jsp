<%--
  Created by IntelliJ IDEA.
  User: 46933
  Date: 2019/5/18
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<%
    out.println("Your IP address is" + request.getRemoteAddr());
%>
</body>
</html>
