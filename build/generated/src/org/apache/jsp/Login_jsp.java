package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    function onlyAlphabets(e, t) \n");
      out.write("                    {\n");
      out.write("                        try \n");
      out.write("                        {\n");
      out.write("                            if (window.event) \n");
      out.write("                            {\n");
      out.write("                                var charCode = window.event.keyCode;\n");
      out.write("                            }\n");
      out.write("                            else if (e) \n");
      out.write("                            {\n");
      out.write("                                var charCode = e.which;\n");
      out.write("                            }\n");
      out.write("                            else \n");
      out.write("                            {\n");
      out.write("                                return true;\n");
      out.write("                            }\n");
      out.write("                            if ((charCode > 64 && charCode < 91) || (charCode > 96 && charCode < 123))\n");
      out.write("                                return true;\n");
      out.write("                            else\n");
      out.write("                                alert(\"only charcaters\");\n");
      out.write("                                return false;\n");
      out.write("                        }\n");
      out.write("                        catch (err) \n");
      out.write("                        {\n");
      out.write("                            alert(err.Description);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("       <script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function() {\n");
      out.write("\n");
      out.write("                if (localStorage.chkbx && localStorage.chkbx != '') {\n");
      out.write("                    $('#remember_me').attr('checked', 'checked');\n");
      out.write("                    $('#username').val(localStorage.usrname);\n");
      out.write("                    $('#pass').val(localStorage.pass);\n");
      out.write("                } else {\n");
      out.write("                    $('#remember_me').removeAttr('checked');\n");
      out.write("                    $('#username').val('');\n");
      out.write("                    $('#pass').val('');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $('#remember_me').click(function() {\n");
      out.write("\n");
      out.write("                    if ($('#remember_me').is(':checked')) {\n");
      out.write("                        // save username and password\n");
      out.write("                        localStorage.usrname = $('#username').val();\n");
      out.write("                        localStorage.pass = $('#pass').val();\n");
      out.write("                        localStorage.chkbx = $('#remember_me').val();\n");
      out.write("                    } else {\n");
      out.write("                        localStorage.usrname = '';\n");
      out.write("                        localStorage.pass = '';\n");
      out.write("                        localStorage.chkbx = '';\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write(" <!--script-->\n");
      out.write("</head>\n");
      out.write("<body background=\"images/backk.gif\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"col-md-3\" style=\"background-color: burlywood; height: 680px;\">\n");
      out.write("        <center> <h3 style=\"margin-top: 30px; color: saddlebrown;\">RaktPlus @ your service</h3><br/><br/>\n");
      out.write("                    <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"AboutHospital.jsp\"><input type=\"submit\" value=\"About Hospital\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"AboutDoctors.jsp\"><input type=\"submit\" value=\"About Doctors\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"BloodInfo.jsp\"><input type=\"submit\" value=\"Blood Info\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"DonorInstruction.jsp\"><input type=\"submit\" value=\"Donor Instruction\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"HealthTips.jsp\"><input type=\"submit\" value=\"Health Tips\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"HelpfulDonation.jsp\"><input type=\"submit\" value=\"Helpful Donation\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"NewsBlood.jsp\"><input type=\"submit\" value=\"Blood Bank\" style=\"width:200px; height:40px;font-size: larger;\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("        </center>\n");
      out.write("                </div>\n");
      out.write("<div class=\"team\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <center>\n");
      out.write("            <img src=\"images/login.JPG\" alt=\"\"/></center>\n");
      out.write("        <div class=\"team-info\">\n");
      out.write("            <form action=\"Lbean.jsp\">\n");
      out.write("            <center>\n");
      out.write("                <table style=\"margin-top:50px;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Username:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"uname\" class=\"input-block-level\" onkeypress=\"return onlyAlphabets(event,this);\" id=\"username\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter username\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Password:</h2></td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\" class=\"input-block-level\" id=\"pass\" style=\"font-size: large;font-family: monospace; font-weight: bold;\"placeholder=\"enter password\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                    <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\" value=\"remember-me\" id=\"remember_me\"> Remember me\n");
      out.write("                    </label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" value=\"Login\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">&emsp;\n");
      out.write("                <input type=\"reset\" value=\"Reset\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">&emsp;\n");
      out.write("            </center>\n");
      out.write("            </form>\n");
      out.write("            <center>\n");
      out.write("                <a href=\"ChangePassword.jsp\"><input type=\"submit\" value=\"Change Password\" style=\"color:black;margin-top: 20px; width:200px; height:40px; font-size: large;\"></a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
