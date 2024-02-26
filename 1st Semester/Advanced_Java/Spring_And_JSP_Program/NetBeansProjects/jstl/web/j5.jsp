<%-- 
    Document   : j5
    Created on : Nov 7, 2023, 10:17:53 AM
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
        <h1>JSTL URL example</h1>
    <f:url var="hiray" value="http://www.google.com/search">
        <f:parameter name="q" value="jsp tutorial"></f:parameter>
    </f:url>
    <h2>
        <f:out value="$(hiray)"></f:out>
        <f:redirect url="$(hiray)"></f:redirect>
    </h2>
    </body>
</html>
