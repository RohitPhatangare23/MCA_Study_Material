<%-- 
    Document   : t1
    Created on : Nov 7, 2023, 8:12:29 AM
    Author     : Admin
--%>
<%@page errorPage="error.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int a=1/0;
            out.println("division is"+a);
            %>
    </body>
</html>
