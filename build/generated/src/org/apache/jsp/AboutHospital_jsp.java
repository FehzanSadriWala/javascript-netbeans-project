package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutHospital_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body background=\"images/blueb.jpg\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"services-section\" style=\"background-color: violet;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>About Our Hospitals</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("                <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/Health_Care_Professionals1.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/Health_Care_Professionals1.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/park102.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/park102.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/maa-Gayatri-Hospital.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/maa-Gayatri-Hospital.jpg\" alt=\"\"/></a></li>&emsp;\n");
      out.write("                       <h2>GBH American Hospital</h2>\n");
      out.write("                        <p>GBH American Hospital is NABH Accredited and ISO 9001:2008 certified STATE OF THE ART MULTI SUPER SPECIALTY HOSPITAL ,extending its services to the people of Rajasthan. GBH-AH is committed to quality care. It not only addresses the illness but also concentrates on the overall well being of the patients.</p><br/>\n");
      out.write("                        <h2>MB Hospital</h2>\n");
      out.write("                        <p>MB Hospital provides super specialty services to patients from Udaipur district and also nearby districts of MP and Gujarat in field of Cardiology, CTVS, Neurology, Neuro Surgery, Nephrology, GI Medicine, Plastic Surgery, Pediatric Surgery and Radiation Oncology.\n");
      out.write("                           The hospital has a well-equipped central lab providing pathology,microbiology and biochemistry diagnostic services. It also has a well developed Radiology Department having facilities of Digital X-ray, Ultra Sonography and CT scan. MRI center is working in PPP mode. </p><br/> \n");
      out.write("                        <h2>Maa Gayatri Hospital</h2>\n");
      out.write("                        <p>Maa Gayatri Hospital is a 300-beded ISO 9001:2008 certified multispecialty tertiary care hospital which will further strengthen the healthcare infrastructure in the state, emerging as benchmark in quality standards in healthcare delivery.\n");
      out.write("                           As a multispeciality tertiary care hospital, the services offered are comprehensive covering investigations and diagnosis to therapy, surgery and post operative care. At Maa Gayatri Hospital, you get access to comprehensive list of in-patient services in the major disciplines of medicine and surgery.\n");
      out.write("                           Backed up by the latest hospital technology and a trained medical staff of qualified specialists, dedicated paramedical and nursing staff, Maa Gayatri Hospital, Udaipur provides you the highest level of care and best-in-class inpatient services to make your stay as comfortable as possible.\n");
      out.write("                           The accident and emergency department has dedicated beds for trauma care and special operation theatres for minor as well as major surgeries.</p> <br/>\n");
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
