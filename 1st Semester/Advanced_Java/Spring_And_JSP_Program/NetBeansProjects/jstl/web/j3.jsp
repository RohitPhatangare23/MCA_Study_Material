<%-- 
    Document   : j3
    Created on : Nov 7, 2023, 9:29:46 AM
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
        <h2>JSTL IF Tag</h1>
        <V:set var="i" value"30" scope="application"></V:set>
        <V:out value="$(j)"></V:out>
        <V:if test="${j==30}">
          <h4> True Condition</h4>
        </V:if> test="$(j>30>">
           <h4> Greater than 30</h4>
        </a:if>        
    </body>
</html>
