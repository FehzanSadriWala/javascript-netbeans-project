package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"services-section\" id=\"search\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>About Hospital</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("                <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/yewaliii.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                            <img src=\"images/yewaliii.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/images (4).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                            <img src=\"images/images (4).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/5954-onkologicheskiy-dispanser-onkodispanser_l.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/5954-onkologicheskiy-dispanser-onkodispanser_l.jpg\" alt=\"\"/></a></li>\n");
      out.write("                       <h2>Mission</h2>\n");
      out.write("                        <p>No one shall suffer from the want of BLOOD in India .We have acquired most sophisticated Blood Banking equipment worth over Rs. 2 crores. We have highly qualified staff to run the Blood Bank. Our main emphasis is on encouraging the medical fraternity to use blood components instead of whole blood.By use of components, optimum utilization of blood can be obtained and 3 to 4 lives can be helped with just one unit of blood.Ours is a commitment to serve society.</p><br/>\n");
      out.write("                        <h2>Vision</h2>\n");
      out.write("                        <p>BloodBank is a helpline which connects needy patients with blood donors in India. So if you need blood, its a good place to turn to. It's simple. It's effective. It's Free. You can also Sign up as a blood Donor and help build a Community that cares.Or if you need blood you can sign up as a Seeker and ask for blood. </p><br/> \n");
      out.write("                        <h2>Blood Bank Functioning</h2>\n");
      out.write("                        <p>The major functions of this blood bank includes collection of blood from donors as well as blood typed, separated into components, stored, and prepared for transfusion to recipients.This blood bank is a separate free-standing facility.</p> <br/>\n");
      out.write("                        <h2>Storage and Management</h2>\n");
      out.write("                        <p>Routine blood storage is 42 days or 6 weeks for stored packed red blood cells, by far the most commonly transfused blood product, and involves refrigeration but usually not freezing.It is also important to consider that there is large variability in storage results for different donors, which combined with limited available quality testing, poses challenges to clinicians and regulators seeking reliable indicators of quality for blood products and storage systems.Transfusions of platelets are comparatively far less numerous, but they present unique storage/management issues. Platelets may only be stored for 7 days,due largely to their greater potential for contamination, which is in turn due largely to a higher storage temperature.</p>\n");
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
