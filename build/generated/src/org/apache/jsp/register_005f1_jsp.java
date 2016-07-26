package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Blood Bank</title>\n");
      out.write("                <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n");
      out.write("                <link href=\"css/signup.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                <link href=\"css/signupp.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                <link href=\"css/newCascadeStyleSheet2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                <link href=\"css/newCascadeStyleSheet2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                <link href=\"css/chocolat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                <script src=\"js/easing.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/jquery-1.8.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/jquery.chocolat.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/jquery.hoverdir.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/modernizr.custom.97074.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/move-top.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/demo.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/sky-forms.css\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Sciencelab Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web \n");
      out.write("template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function \n");
      out.write("hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<script src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script src=\"js/modernizr.custom.97074.js\"></script>\n");
      out.write("<!---- start-smoth-scrolling---->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!---End-smoth-scrolling---->\n");
      out.write("<!--script-->\n");
      out.write("<script src=\"js/jquery.chocolat.js\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\n");
      out.write("\t\t<!--light-box-files -->\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$('.gallery a').Chocolat();\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                \n");
      out.write("                <!--[if lt IE 9]>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/sky-forms-ie8.css\">\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t\n");
      out.write("\t\t<!--[if lt IE 10]>\n");
      out.write("\t\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.placeholder.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\t\t\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/sky-forms-ie8.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"bg-cyan\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\t\t<div class=\"body body-s\">\n");
      out.write("\t\t\t<form action=\"Rbean.jsp\" class=\"sky-form\">\n");
      out.write("\t\t\t\t<header>Registration form</header>\n");
      out.write("\t\t\t\t<fieldset>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t\t<b class=\"tooltip tooltip-bottom-right\">Only numbers</b>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Email address\">\n");
      out.write("\t\t\t\t\t\t\t<b class=\"tooltip tooltip-bottom-right\">Needed to verify your account</b>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t<b class=\"tooltip tooltip-bottom-right\">Only latin characters and numbers</b>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<section>\n");
      out.write("                                            <a href=\"AfterLogin.jsp\"></a>\n");
      out.write("\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Confirm password\">\n");
      out.write("\t\t\t\t\t\t\t<b class=\"tooltip tooltip-bottom-right\">Only latin characters and numbers</b>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("                                    \n");
      out.write("                                    <section>\n");
      out.write("\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("                                                    <input type=\"number\" placeholder=\"Phone No.\">\n");
      out.write("\t\t\t\t\t\t\t<b class=\"tooltip tooltip-bottom-right\">Only numbers</b>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<section class=\"col col-6\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"First name\">\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t<section class=\"col col-6\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"input\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Last name\">\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t<label class=\"select\">\n");
      out.write("\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"0\" selected disabled>Gender</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">Male</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">Female</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"3\">Other</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t<i></i>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"button\">Submit</button>\n");
      out.write("                                        <button type=\"reset\" class=\"button\">Reset</button>\n");
      out.write("\t\t\t\t</footer>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\t</body>\n");
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
