package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class receipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Blood Bank</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("<!--script-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("<center> <h3> Receipt </h3> </center>\n");
      out.write("    <form action >\n");
      out.write("     <center>\n");
      out.write("                <table style=\"margin-top:50px;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Patient Name:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter patient name\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Patient's Contact Number:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"number\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter contact number\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                            <td><h2 style=\"font-family: monospace;\">Blood type: </h2></td>\n");
      out.write("                            <td><select name=\"bt\">\n");
      out.write("                                    <option>A+</option>\n");
      out.write("                                    <option>A-</option>\n");
      out.write("                                    <option>B+</option>\n");
      out.write("                                    <option>B-</option>\n");
      out.write("                                    <option>AB+</option>\n");
      out.write("                                    <option>AB-</option>\n");
      out.write("                                    <option>O+</opOtion>\n");
      out.write("                                    <option>O-</option>\n");
      out.write("                                </select></td>\n");
      out.write("                        </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Quantity:</h2></td>\n");
      out.write("                    <td><input type=\"number\" name=\"quantity\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter quantity\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Cost:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"cost\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter cost\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Required Date:</h2></td>\n");
      out.write("                    <td><input type=\"date\" name=\"ddt\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Receiver Name:</h2></td>\n");
      out.write("                    <td><input type=\"number\" name=\"rname\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter receiver name\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Receiver Contact:</h2></td>\n");
      out.write("                    <td><input type=\"number\" name=\"rno\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter receiver contact no.\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Type:</h2></td>\n");
      out.write("                    <td><input type=\"number\" name=\"type\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"accidental type\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("         \n");
      out.write("        <h4 style=\"margin-left: 15%\">Note* :</h4> <p style=\"margin-left: 15%\">The produced receipt can be taken to the listed blood banks on this website, for blood reception. Thank you!</p>\n");
      out.write("    \n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" value=\"Back\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">\n");
      out.write("                <input type=\"reset\" value=\"Print\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">\n");
      out.write("            </center>                    \n");
      out.write("        </form>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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
