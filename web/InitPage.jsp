<%--
  Created by IntelliJ IDEA.
  User: 46933
  Date: 2019/5/7
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Init Test</title>
</head>
<body BGCOLOR="#FDF5E6">
<h2>Init Paraments:</h2>
<ul>
    <li>First name: <%= firstName %></li>
    <li>Email address: <%= emailAddress %></li>
</ul>
</body>
</html>
<%!
    private String firstName = "First name is  missing.";
    private String emailAddress = "Email address is missing.";

    public void jspInit()
    {
        ServletConfig config = getServletConfig();
        if(config.getInitParameter("firstname")!=null)
        {
            firstName =  config.getInitParameter("firstName");
        }
        if(config.getInitParameter("emailAddress")!=null)
        {
            emailAddress = config.getInitParameter("emailAddress");
        }
    }
%>
