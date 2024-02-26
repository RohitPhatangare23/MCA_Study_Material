package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Student Registration Page</h1>\n");
      out.write("    </center>\n");
      out.write("    <form method=\"post\" action=\"studentDB.jsp\">\n");
      out.write("        <table border=\"1\" align=\"center\" cellpadding=\"10px\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Student Name : </td>\n");
      out.write("                <td><input type=\"text\"name=\"sname\" value=\"\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Course Name : </td>\n");
      out.write("                <td><input type=\"text\"name=\"course\" value=\"\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Semester : </td>\n");
      out.write("                <td><input type=\"text\"name=\"sem\" value=\"\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr columspam=\"0\">\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("                 \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" value=\"Insert\" name=\"insert\"/></td>\n");
      out.write("                 <td><input type=\"Submit\" value=\"Display\" name=\"display\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" value=\"Delete\"/></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Reset\"/></td>\n");
      out.write("                 \n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("    </form>\n");
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
