<%-- 
    Document   : j4
    Created on : Nov 7, 2023, 9:59:13 AM
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
        <V:out value="$(V)"></v:out>
        <V:choose>
            <V:when test="$(V>0)">
            <h4> Greater than 0 </h4>            
            </V:when>
            <V:when test="$(V>0)">
                <h4> Less than 0</h4>
            </V:When>
                <v:otherwise>
                  <V:redirect url"https://www.google.com">
                      
                </v:otherwise>
              
            
         </V:choose>
    </body>
</html>
