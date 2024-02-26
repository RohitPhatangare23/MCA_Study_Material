package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentDB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>This is database Concector file</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String name=request.getParameter("sname");
        String cource=request.getParameter("course");
        String semester=request.getParameter("sem");
        String b1=request.getParameter("insert");
        String b2=request.getParameter("display");
        String b3=request.getParameter("delete");
        
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmaster?zeroDateTimeBehavior=convertToNull","root","");
            
            if(b1!=null){
                String query="insert into student(name,course,semester)values(?,?,?)";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,name);
                ps.setString(2,cource);
                ps.setString(3,semester);
                ps.executeUpdate();
                con.close();
                out.println("1 Row is  Inserted");
            }
            
         
        
        
      out.write("\n");
      out.write("       <a href=\"registration.jsp\">home</a>\n");
      out.write("       ");

           if(b2!=null){
               Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select * from student ");
               out.println("<html><body><table style='font-size:25px'><tr>");
               out.println("<td>Name</td><td>Course</td><td>Semester</td>");
               while(rs.next()){
                   String nm=rs.getString(1);
                   String crs=rs.getString(2);
                   String semd=rs.getString(3);
                   out.println("<tr>");
                   out.println("<td>"+nm+"</td><td>"+crs+"</td><td>"+semd+"</td>");
                   out.println("</td>");
               }
           }
           
           if(b3!=null){
                String sql="delete from student where name=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,name);
                ps.executeUpdate();
                out.println("1 Row is Deleted");
           }
         }
           
        catch(Exception e){
            e.printStackTrace();
        }
       
      out.write("\n");
      out.write("      \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
