<%-- 
    Document   : studentDB
    Created on : Oct 30, 2023, 10:51:06 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is database Concector file</title>
    </head>
    <body>
        <% String name=request.getParameter("sname");
        String cource=request.getParameter("course");
        String semester=request.getParameter("sem");
        String b1=request.getParameter("insert");
        String b2=request.getParameter("display");
        String b3=request.getParameter("delete");
        
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmaster?zeroDateTimeBehavior=convertToNull","root","");
            
            if(b1!=null){
                String query="insert into student(name,course,semester)values(?,?,?)";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,name);
                ps.setString(2,cource);
                ps.setString(3,semester);
                ps.executeUpdate();
                con.close();
                out.println("1 Row is  Inserted");
            }
            
         
        
        %>
       <a href="registration.jsp">home</a>
       <%
           if(b2!=null){
               Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select * from student ");
               out.println("<html><body><table style='font-size:25px'><tr>");
               out.println("<td>Name</td><td>Course</td><td>Semester</td>");
               while(rs.next()){
                   String nm=rs.getString(1);
                   String crs=rs.getString(2);
                   String semd=rs.getString(3);
                   out.println("<tr>");
                   out.println("<td>"+nm+"</td><td>"+crs+"</td><td>"+semd+"</td>");
                   out.println("</td>");
               }
           }
           
           if(b3!=null){
                String sql="delete from student where name=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,name);
                ps.executeUpdate();
                out.println("1 Row is Deleted");
           }
         }
           
        catch(Exception e){
            e.printStackTrace();
        }
       %>
      
       
        
    </body>
</html>
