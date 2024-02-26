<%-- 
    Document   : source
    Created on : Oct 18, 2023, 11:45:08 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Addition</h3>
        <%
            int a=integer.parseint(request.getParameter("fn"));
            int b=integer.parseint(request.getParameter("sn"));
            int sum=a+b;
            out.printIn("Addition is""+"+sum);
            %>
    </body>
</html>
