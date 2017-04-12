package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.Calendar;

public final class password_005freset_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.html");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!-- \n");
      out.write("    Name: John M Delia Jr\n");
      out.write("    SPC Student ID: 434299\n");
      out.write("    Course COP 2806 - Java Web Applications\n");
      out.write("-->\n");
      out.write("<!--\n");
      out.write("    Page Assignment for Assignment 2\n");
      out.write("    1. Create a header.html file\n");
      out.write("    2. include on all pages\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--Add Page Title-->\n");
      out.write("        <title>TOBA Titan Online Banking Application</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Password Reset Form</h1>\n");
      out.write("        <br>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form action=\"PasswordResetServlet\" method=\"post\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <label class=\"pad_top\">Current Temporary Password:</label>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"curTempPassword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ><br>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <label class=\"pad_top\">New Password:</label>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <input type=\"text\" id=\"pwdChang\" name=\"password\"><br>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <input type=\"submit\" value =\"Change Password\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            GregorianCalendar currentDate = new GregorianCalendar();
            String currentMonth = currentDate.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
            int currentDay = currentDate.get(Calendar.DATE);
            int currentYear = currentDate.get(Calendar.YEAR);

        
      out.write(" \n");
      out.write("        <p>&copy; Copyright ");
      out.print(currentMonth );
      out.write(' ');
      out.print(currentDay );
      out.write(',');
      out.write(' ');
      out.print(currentYear );
      out.write(" TOBA Titan &amp; Corporation</p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
