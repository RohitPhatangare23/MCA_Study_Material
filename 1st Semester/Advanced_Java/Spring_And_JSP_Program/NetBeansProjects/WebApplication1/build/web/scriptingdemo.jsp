<%-- 
    Document   : scriptingdemo
    Created on : Oct 17, 2023, 1:05:07 PM
    Author     : Admin
    17/10/2023 Java Practical 6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Practical = 6</h1>
         <%-- This is Comment --%>
        <%-- Scripting Elements --%>
        <%-- Decalaration --%>
        <%!
            int a=10;
            int b=20;
        %>
        <%-- Exprestion --%>
        <%= 
            "Sum of a And b " + (a+b)
        %>
         <%-- Scriptlet --%>
         <%
             out.println("sum is "+(a+b));
             out.println("<br>");
             Date d=new Date();
             out.println(d);
             
          %>
        
    </body>
</html>
