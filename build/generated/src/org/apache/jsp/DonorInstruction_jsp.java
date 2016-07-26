package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DonorInstruction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <!--script-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"services-section\" style=\"background-color: violet;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Basic Instructions for Donating Blood</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("                <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/alg-blood-donation.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/alg-blood-donation.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/images (3).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/images (3).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/images (4).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/images (4).jpg\" alt=\"\"/></a></li>&emsp;\n");
      out.write("                       <h2>Before Your Donation</h2>\n");
      out.write("                        <p>Maintain a healthy iron level in your diet by eating iron rich foods, such as red meat, fish, poultry, beans, spinach, iron-fortified cereals and raisins.</br>\n");
      out.write("                           Get a good night's sleep.</br>\n");
      out.write("                           Drink an extra 16 oz. of water or non-alcoholic fluids before the donation.</br>\n");
      out.write("                           Eat a healthy meal before your donation. Avoid fatty foods, such as hamburgers, fries or ice cream before donating. (Fatty foods can affect the tests we do on your blood. If there is too much fat in your blood, your donation cannot be tested for infectious diseases and the blood will not be used for transfusion.)</br>\n");
      out.write("                           If you are a platelet donor, remember that your system must be free of aspirin for two days prior to donation.</br>\n");
      out.write("                           Remember to bring your donor card, driver's license or two other forms of ID.</p><br/>\n");
      out.write("                        <h2>During Your Donation</h2>\n");
      out.write("                        <p>Wear clothing with sleeves that can be raised above the elbow.</br>\n");
      out.write("                           Let the person taking your blood know if you have a preferred arm and show them any good veins that have been used successfully in the past to draw blood.</br>\n");
      out.write("                           Relax, listen to music, talk to other donors or read during the donation process.</br>\n");
      out.write("                           Take the time to enjoy a snack and a drink in the refreshments area immediately after donating. </p><br/> \n");
      out.write("                        <h2>After Your Donation</h2>\n");
      out.write("                        <p>Drink an extra four (8 ounce) glasses of liquids and avoid alcohol over the next 24 hours.</br>\n");
      out.write("                           Remove the wrap bandage (if you had one put on your arm) within the next hour.</br>\n");
      out.write("                           Keep the strip bandage on for the next several hours.</br>\n");
      out.write("                           To avoid a skin rash, clean the area around the strip bandage with soap and water.</br>\n");
      out.write("                           Do not do any heavy lifting or vigorous exercise for the rest of the day.</br>\n");
      out.write("                           If the needle site starts to bleed, apply pressure to it and raise your arm straight up for about 5-10 minutes or until bleeding stops.</br>\n");
      out.write("                           If you experience dizziness or light-headedness after donation, stop what you are doing and sit down or lie down until you feel better. Avoid performing any activity where fainting may lead to injury for at least 24 hours.</p><br/>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </ul>\n");
      out.write("                    </section>\n");
      out.write("                    <script type=\"text/javascript\" src=\"js/jquery.hoverdir.js\"></script>\t\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\t$(' #da-thumbs > li ').each( function() { $(this).hoverdir(); } );\n");
      out.write("\t\t\t});\n");
      out.write("                    </script>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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
