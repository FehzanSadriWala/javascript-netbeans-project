package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HelpfulDonation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <h3>How Helpful Blood Donation Is?</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("                <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/images (5).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/images (5).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/images (6).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/images (6).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/images (9).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/images (9).jpg\" alt=\"\"/></a></li>&emsp;\n");
      out.write("                       <h2>Preserves Cardiovascular Health</h2>\n");
      out.write("                        <p>Blood viscosity is known to be a unifying factor for the risk of cardiovascular disease, says the Harvard Medical School Family Health Guide. How thick and sticky your blood is and how much friction your blood creates through the blood vessels can determine how much damage is done to the cells lining your arteries. You can reduce your blood viscosity by donating blood on a regular basis, which eliminates the iron that may possibly oxidize in your blood. An increase in oxidative stress can be damaging to your cardiovascular system.\n");
      out.write("                           Blood donation reduces the risk of heart attacks and strokes, too. In a study published in the Journal of the American Medical Association (JAMA), researchers found that participants ages 43 to 61 had fewer heart attacks and strokes when they donated blood every six months. In a study published by the American Journal of Epidemiology, researchers found in a sample size of 2,682 men in Finland, those who donated blood a minimum of once a year had an 88 percent lower risk of heart attacks than those who did not donate.\n");
      out.write("                           The removal of oxidative iron from the body through blood donations means less iron oxidation and reduced cardiovascular diseases.</p><br/>\n");
      out.write("                        <h2>Reduces the Risk of Cancer</h2>\n");
      out.write("                        <p>The reduction of iron stores and iron in the body while giving blood can reduce the risk of cancer. Iron has been thought of to increase free-radical damage in the body and has been linked to an increased risk of cancer and aging, says a study published in the Journal of the National Cancer Institute. Researchers followed 1,200 people split into groups of two over the course of 4 ½ years. One group reduced their iron stores by blood donations twice a year, whereas the other group did not make any changes. The results of the study showed that the group of blood donors had lower iron levels, and a lower risk of cancer and mortality.\n");
      out.write("                           The Miller-Keystone Blood Center says that the consistency of blood donations is associated with lower risks of cancers including liver, lung, colon, and throat cancers due to the reduction in oxidative stress when iron is released from the bloodstream. </p><br/> \n");
      out.write("                        <h2>Burns Calories</h2>\n");
      out.write("                        <p>People burn approximately 650 calories per donation of one pint of blood, according to the University of California, San Diego. A donor who regularly donates blood can lose a significant amount of weight, but it should not be thought of as a weight loss plan by any means. To donate blood the American Red Cross requires donors to weigh at least 110 pounds and maintain healthy iron levels in the body.</p> <br/>\n");
      out.write("                        <h2>Provides a Free Blood Analysis</h2>\n");
      out.write("                        <p>Upon donation, donors are tested for syphilis, HIV, hepatitis, and other diseases. Testing indicates whether or not you are eligible to donate based on what is found in your bloodstream, says the American Red Cross. The organization also notes that a sample of your blood may be used now or in the future for additional tests and other medical research with your consent.</p>\n");
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
