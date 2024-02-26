<%-- 
    Document   : calculator
    Created on : Nov 2, 2023, 12:43:11 PM
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
        <h1>simple interest</h1>
        <%!
          public double calculate(double amount,double interest,int prd)
{
return(amount*interest*prd)/100;
}
%>
<%
    string uname=request.getparameter("name");
    double amount = Double.parseDouble(request.getParameter("amt"));
    double interest= Double.parseDouble(request.getParameter("rate"));
    int prd= Integer.parseInt(request.getParameter("period"));
    %>
    welcome<%=uname%>
    simple Int= <%=calculate(Amount,interest,prd)%>
    </body>
</html>
