<%-- 
    Document   : registration
    Created on : Oct 30, 2023, 10:48:03 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
    <center>
        <h1>Student Registration Page</h1>
    </center>
    <form method="post" action="studentDB.jsp">
        <table border="1" align="center" cellpadding="10px">
            <tr>
                <td>Student Name : </td>
                <td><input type="text"name="sname" value=""/></td>
            </tr>
            <tr>
                <td>Course Name : </td>
                <td><input type="text"name="course" value=""/></td>
            </tr>
            <tr>
                <td>Semester : </td>
                <td><input type="text"name="sem" value=""/></td>
            </tr>
            <tr columspam="0">
                
                <td><input type="submit" value="submit"/></td>
                 
            </tr>
            <tr>
                
                <td><input type="submit" value="Insert" name="insert"/></td>
                 <td><input type="Submit" value="Display" name="display"/></td>
            </tr>
            
            <tr>
                
                <td><input type="submit" value="Delete"/></td>
                <td><input type="submit" value="Reset"/></td>
                 
            </tr>
           
        </table>
    </form>
        
    </body>
</html>
