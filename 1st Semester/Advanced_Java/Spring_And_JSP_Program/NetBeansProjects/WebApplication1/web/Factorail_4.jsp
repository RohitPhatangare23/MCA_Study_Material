<%-- 
    Document   : Factorail_4
    Created on : Oct 17, 2023, 1:41:39 PM
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
        <h1>This is Factorail Program 4</h1>  
        <% for(int i=0;i<=10;i++)
        {%>
        Factoral of <%=i%>is: <%= coumputFactorail(i) %>
        <br/>
        <%}%>
            
        <%! private long coumputFactorail(int n){
        if(n==0)
            return 1;
        else
            return n * coumputFactorail(n-1);
        }
        %>
        
        
        
    </body>
</html>
