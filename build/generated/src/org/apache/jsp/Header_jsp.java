package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("<div class=\"header\" id=\"home\">\n");
      out.write("    <p id=\"demo\"></p>\n");
      out.write("    <script>\n");
      out.write("        document.getElementById(\"demo\").innerHTML = Date();\n");
      out.write("    </script>\n");
      out.write("\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t   <div class=\"logo\">\n");
      out.write("\t\t\t\t  <a href=\"Index.jsp\">Blood<span>Bank</span></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\n");
      out.write("\t\t\t\t\t<span class=\"menu\"><img src=\"images/nav.png\" alt=\"\"/></span>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#home\" class=\"active scroll\">home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#aboutus\" class=\"scroll\">about us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#search\" class=\"scroll\">Search</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#gallery\" class=\"scroll\">gallery</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#registration\" class=\"scroll\">Registration</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#login\" class=\"scroll\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#contact\" class=\"scroll\">contact</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t <!--script-nav-->\n");
      out.write("\t\t\t\t\t\t <script>\n");
      out.write("\t\t\t\t\t\t $(\"span.menu\").click(function(){\n");
      out.write("\t\t\t\t\t\t $(\".top-menu ul\").slideToggle(\"slow\" , function(){\n");
      out.write("\t\t\t\t\t\t });\n");
      out.write("\t\t\t\t\t\t });\n");
      out.write("\t\t\t\t\t\t </script>\n");
      out.write("\t\t \n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
