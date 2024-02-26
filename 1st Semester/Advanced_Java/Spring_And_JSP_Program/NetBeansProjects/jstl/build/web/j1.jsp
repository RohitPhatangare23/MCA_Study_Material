<%-- 
    Document   : j1
    Created on : Nov 7, 2023, 8:56:42 AM
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
        <h1>JSTL Example</h1>
        <V:set var="i" value="30" scope="application"></V:set>
        <V:out value="$"(i)></V:out>
        <V:remove var="i"></V:remove>
        <V:remove var="$"(i)></V:remove>      
    </body>
</html>
