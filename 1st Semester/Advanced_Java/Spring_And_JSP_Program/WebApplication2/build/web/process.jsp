<%-- 
    Document   : process
    Created on : Oct 31, 2023, 8:23:56 AM
    Author     : Admin
--%>

<er=r%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>you are registered</h2>
        <h3>your details are</h3>
        <%
          String sname=request.getParameter("sname");
          String email=request.getParameter("email");
          String dob=request.getParameter("db");
          String edu=request.getParameter("edu");
          String lang=request.getParameter("hindi");
          String gender=request.getParameter("gen");
          
          String[] lkg =request.getParameterValues("ik");
          List lst=Arrays.aslist(lkg);
          request.setAttribute("lkg",lst);
          List<String>lk=(List<String>)request.getAttributes("lkg");
          
out.println("<table border='1'>");
out.println("<tr>");
out.println("Student Name");
out.println("</td>");
out.println("<td");
 out.println(sname);
 out.println("</td>");
 out.println("/tr");
 
out.println("<tr>");
out.println("course");
out.println("</td>");
out.println("<td");
 out.println(Course);
 out.println("</td>");
 out.println("/tr");
 
out.println("<tr>");
out.println("Semester");
out.println("</td>");
out.println("<td");
 out.println(Semester);
 out.println("</td>");
 out.println("/tr");
 

          
          %>
    </body>
</html>
