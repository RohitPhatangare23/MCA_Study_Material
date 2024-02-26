<%-- 
    Document   : newjsp22
    Created on : Nov 21, 2023, 8:59:29 AM
    Author     : Admin
--%>
<%@page import="java.util.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String unm = request.getParameter("sname");
            String tlp = request.getParameter("tlp");
            
            Connection conn;
            PreparedStatement ps;
            Statement st;
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1?zeroDateTimeBehavior=convertToNull","root","");
            try{
        st = conn.createStatement();
        rs = st.executeQuery("select * from student_info");
        while(rs.next())
        {
            rs.getString(1);
            rs.getString(2);
           
        }
        String sql = "insert into student_info(stud_name,stud_mobile) values(?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1,unm);
        ps.setString(2,tlp);
        ps.executeUpdate();
        conn.close();
            }
            catch(SQLException e)
                    {
                    e.printStackTrace();
                    }
               
        %>
    </body>
</html>
