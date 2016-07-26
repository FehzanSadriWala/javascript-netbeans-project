package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body background=\"images/backk.gif\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    ");

            String s= (String)session.getAttribute("uname");
            if(s!=null && "admin".equals(s.intern()))
            {
      out.write("\n");
      out.write("    <div class=\"col-md-3\" style=\"background-color: burlywood; height: 650px;\">\n");
      out.write("        <center> <h3 style=\"margin-top: 30px; color: black;\">Welcome to Blood Bank</h3><br/><br/>\n");
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
      out.write("    <div class=\"services-section\" id=\"search\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h3>Welcome Admin !!!</h3>\n");
      out.write("        <div class=\"services-grids\">\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"ViewInventory.jsp\"><input type=\"submit\" value=\"View Inventory\" style=\"margin-top: 20px; width:250px; height:40px; font-size: large;\"></a>\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"AddBloodBank.jsp\"><input type=\"submit\" value=\"Add Blood Bank\" style=\"margin-top: 20px; width:170px; height:40px; font-size: large;\"></a><br/><br/>\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"ViewDonor.jsp\"><input type=\"submit\" value=\"View Donor Details\" style=\"margin-top: 20px; width:250px; height:40px; font-size: large;\"></a>\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"AddBloodUnit.jsp\"><input type=\"submit\" value=\"Add Blood Unit\" style=\"margin-top: 20px; width:170px; height:40px; font-size: large;\"></a><br/><br/>\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"ViewAccidental.jsp\"><input type=\"submit\" value=\"View Accidental Details\" style=\"margin-top: 20px; width:250px; height:40px; font-size: large;\"></a>\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"DeleteBloodUnit.jsp\"><input type=\"submit\" value=\"Delete Blood Unit\" style=\"margin-top: 20px; width:170px; height:40px; font-size: large;\"></a><br/><br/>\n");
      out.write("            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            <a href=\"ViewNonAccidental.jsp\"><input type=\"submit\" value=\"View Non Accidental Details\" style=\"margin-top: 20px; width:250px; height:40px; font-size: large;\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      ");
}
            else
            {
      out.write("\n");
      out.write("            <img src=\"images/PlzLogin.png\" alt=\"\"/>\n");
      out.write("            ");
}
        
      out.write("\n");
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
