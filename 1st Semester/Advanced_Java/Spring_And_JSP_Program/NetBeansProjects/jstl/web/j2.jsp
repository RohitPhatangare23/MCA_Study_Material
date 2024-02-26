<%-- 
    Document   : j2
    Created on : Nov 7, 2023, 8:56:56 AM
    Author     : Admin
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="V"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Printing value of i from previous page</h3>
        <V:out value="$"(i)></V:out>
    </body>
</html>
