<%-- 
    Document   : newjsp2
    Created on : Oct 18, 2023, 11:01:23 AM
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
        <h3>Login details</h3>
        <%
            String username=request.getParameter("sname");
            if(username.equals("hiray"))
            {
            out.PrintIn("Welcome"+""+Username);
            }
            else
            {
            out.printIn("incorrect user name");
            }
            %>
    </body>
</html>
