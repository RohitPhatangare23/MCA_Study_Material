<%-- 
    Document   : additionoftwonumber
    Created on : Oct 18, 2023, 11:32:18 AM
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
        <h1>Addition</h1>
        <form action="add.jsp">
            <table>
                <tr>
                    <td>First number</td>
                    <td><input type="text"name="fn"></td>
                </tr>
                <tr>
                    <td>second Number:</td>
                    <td> <input type="text"name="sn"></td>
                </tr>
                <tr>
                    <td>input type="submit" value="submit"</td>
                    <td>input type="reset" value="reset"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
