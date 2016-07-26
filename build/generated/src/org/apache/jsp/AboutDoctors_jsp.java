package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutDoctors_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>RaktPlus</title>\n");
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
      out.write("<body background=\"images/blueb.jpg\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"services-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Our Doctors</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("                <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/images.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/images.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/doctor-banner.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/doctor-banner.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/download.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/download.jpg\" alt=\"\"/></a></li>&emsp;\n");
      out.write("                       <h2>Cancer Surgery</h2>\n");
      out.write("                        <p><b>Dr. Garima Mehta</b><br/>\n");
      out.write("                           MS, PhD, MNAMS, FAIS,<br/>\n");
      out.write("                           Sr. Consultant Surgeon & Breast Cancer Specialist</p><br/>\n");
      out.write("                        <h2>Cardiology</h2>\n");
      out.write("                        <p><b>Dr. S. K. Kaushik</b><br/>\n");
      out.write("                           MD (Medicine), DM (Cardiology)<br/>\n");
      out.write("                           F.I.A.E., F.I.S.C., F.C.S.I., F.A.C.C. (USA)<br/>\n");
      out.write("                           Ex Principal RNT Medical College<br/>\n");
      out.write("                           Director & Chief Consultant Cardiology</p><br/> \n");
      out.write("                        <p><b> Dr. Amit Khandelwal</b><br/>\n");
      out.write("                            MBBS, MD (Medicine), DM - Cardiology<br/>\n");
      out.write("                            Consultant Interventional Cardiologist</p><br/>\n");
      out.write("                        <h2>Endocrinology</h2>\n");
      out.write("                        <p><b>Dr. Jay Chordia</b><br/>\n");
      out.write("                           MD(Gen. Medicine), DM(Endocrinology)<br/>\n");
      out.write("                           Consultant Endocrinologist<br/>\n");
      out.write("                           Diabetes, Thyroid & Hormone Specialist<br/>\n");
      out.write("                           Gold Medalist of SAARC Quiz 2009</p> <br/>\n");
      out.write("                        <h2>General Physician</h2>\n");
      out.write("                        <p><b>Dr. Sandeep Bhatnagar</b><br/>\n");
      out.write("                           MD, DFID<br/>\n");
      out.write("                           Fellowships: Diabetes Mellitus, C.M.C., Vellore<br/>\n");
      out.write("                           Senior Consultant Physician</p><br/>\n");
      out.write("                        <h2>General Surgery<h2/>\n");
      out.write("                        <p><b>Dr. A.S. Gupta</b><br/>\n");
      out.write("                           MS, FACS, FAMS, FICS, FIAP(U.S.A.)<br/>\n");
      out.write("                           Consultant Surgeon<br/>\n");
      out.write("                           Gen. Surgery, Gastroentrology, Endoscopy & Cryosurgery(Piles)</p><br/>\n");
      out.write("                        <p><b>Dr. Vallabh Parikh</b><br/>\n");
      out.write("                           CEO & Medical Director<br/>\n");
      out.write("                           MS, FAIS, FMAS<br/>\n");
      out.write("                           Consultant General, Endoscopic & Laproscopic Surgeon</p><br/>\n");
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
