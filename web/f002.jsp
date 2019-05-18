<%--
  Created by IntelliJ IDEA.
  User: 46933
  Date: 2019/5/18
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! int fontSize; %>
<% for (fontSize = 1; fontSize <=3; fontSize++){
    %> <font color="green" size="<%= fontSize %>">
</font><br />
<%}%>
</body>
</html>
