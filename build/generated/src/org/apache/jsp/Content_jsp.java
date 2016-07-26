package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Content_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"content\">\n");
      out.write("    <div class=\"about-section\" id=\"home\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<h3>welcome to the Blood Bank !</h3>\n");
      out.write("            <div class=\"about-grids\">\n");
      out.write("\t\t<div class=\"col-md-4 about-grid\">\n");
      out.write("                    <img src=\"images/a.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                    <h4>An Essential Entity</h4>\n");
      out.write("                    <p>Blood is the living fluid that all life is based on..Blood is a bodily fluid in humans and other animals that delivers necessary substances such as nutrients and oxygen to the cells and transports metabolic waste products away from those same cells. </p>\n");
      out.write("                </div>\n");
      out.write("\t\t<div class=\"col-md-4 about-grid\">\n");
      out.write("                    <img src=\"images/b.jpg\"  class=\"img-responsive\" alt=\"\">\n");
      out.write("                    <h4>Blood Donation</h4>      \n");
      out.write("                    <p>A blood donation occurs when a person voluntarily has blood drawn and used for transfusions and/or made into biopharmaceutical medications by a process called fractionation.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 about-grid\">\n");
      out.write("                    <img src=\"images/index3.jpg\"  class=\"img-responsive\" alt=\"\">\n");
      out.write("                    <h4>Blood Testings</h4>\n");
      out.write("                    <p>The donor's blood type must be determined if the blood will be used for transfusions. The collecting agency usually identifies whether the blood is type A, B, AB, or O and the donor's Rh(D) type and will screen for antibodies to less common antigens.</p>\n");
      out.write("\t\t</div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("    <!--search-->\n");
      out.write("    <div class=\"services-section\" id=\"search\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Search</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("            <center>\n");
      out.write("                <form>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
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
      out.write("                        <tr>\n");
      out.write("                            <td><h2 style=\"font-family: monospace;\">Location: </h2></td>\n");
      out.write("                            <td><select name=\"loc\"\n");
      out.write("                                    <option>GBH American</option>\n");
      out.write("                                    <option>M.B.Hospital</option>\n");
      out.write("                                    <option>Maa Gayatri</option> \n");
      out.write("                                </select></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><h2 style=\"font-family: monospace;\">Quantity: </h2></td>\n");
      out.write("                            <td><input type=\"text\" name=\"qun\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter quqntity\" required /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <center><input type=\"submit\" value=\"Search\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\"></center>\n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--//search-->\n");
      out.write("    <!--gallery-->\n");
      out.write("\t<div class=\"gallery\" id=\"aboutus\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>About Us</h3>\n");
      out.write("                <div class=\"gallery-grids\">\n");
      out.write("                    <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/yewaliii.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                            <img src=\"images/yewaliii.jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/images (4).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                            <img src=\"images/images (4).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/5954-onkologicheskiy-dispanser-onkodispanser_l.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                            <img src=\"images/5954-onkologicheskiy-dispanser-onkodispanser_l.jpg\" alt=\"\"/></a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                            \n");
      out.write("                    </section>   \n");
      out.write("                            \n");
      out.write("                            <h2>Mission</h2>\n");
      out.write("                        <p>No one shall suffer from the want of BLOOD in India .We have acquired most sophisticated Blood Banking equipment worth over Rs. 2 crores. We have highly qualified staff to run the Blood Bank. Our main emphasis is on encouraging the medical fraternity to use blood components instead of whole blood.By use of components, optimum utilization of blood can be obtained and 3 to 4 lives can be helped with just one unit of blood.Ours is a commitment to serve society.</p><br/>\n");
      out.write("                        <h2>Vision</h2>\n");
      out.write("                        <p>BloodBank is a helpline which connects needy patients with blood donors in India. So if you need blood, its a good place to turn to. It's simple. It's effective. It's Free. You can also Sign up as a blood Donor and help build a Community that cares.Or if you need blood you can sign up as a Seeker and ask for blood. </p><br/> \n");
      out.write("                        <h2>Blood Bank Functioning</h2>\n");
      out.write("                        <p>The major functions of this blood bank includes collection of blood from donors as well as blood typed, separated into components, stored, and prepared for transfusion to recipients.This blood bank is a separate free-standing facility.</p> <br/>\n");
      out.write("                        <h2>Storage and Management</h2>\n");
      out.write("                        <p>Routine blood storage is 42 days or 6 weeks for stored packed red blood cells, by far the most commonly transfused blood product, and involves refrigeration but usually not freezing.It is also important to consider that there is large variability in storage results for different donors, which combined with limited available quality testing, poses challenges to clinicians and regulators seeking reliable indicators of quality for blood products and storage systems.Transfusions of platelets are comparatively far less numerous, but they present unique storage/management issues. Platelets may only be stored for 7 days,due largely to their greater potential for contamination, which is in turn due largely to a higher storage temperature.</p>\n");
      out.write("                        <div class=\"clearfix\"></div\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <script type=\"text/javascript\" src=\"js/jquery.hoverdir.js\"></script>\t\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\t$(' #da-thumbs > li ').each( function() { $(this).hoverdir(); } );\n");
      out.write("\t\t\t});\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--//gallery-->\n");
      out.write("<!--contact-->\n");
      out.write("\t<div class=\"contact-section\" id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"contact-header\">\n");
      out.write("                    <h3>Contact Page</h3>\n");
      out.write("                </div>\n");
      out.write("\t\t<div class=\"contact-grid\">\n");
      out.write("                    <div class=\"col-md-6 contactdetails-grid\">\n");
      out.write("                        <h4>Contact Form</h4>\n");
      out.write("                        <form action=\"Cbean.jsp\">\n");
      out.write("                                <h5>name <span>*</span></h5>\n");
      out.write("                                <input type=\"text\" name=\"name\">\n");
      out.write("               \t\t\t<h5>email address <span>*</span></h5>\n");
      out.write("                                <input type=\"email\" name=\"email\">\n");
      out.write("               \t\t\t<h5>subject <span>*</span></h5>\n");
      out.write("                                <input type=\"text\" name=\"sub\">\n");
      out.write("               \t\t\t<h5>message <span>*</span></h5>\n");
      out.write("                                <textarea name=\"msg\"></textarea>\n");
      out.write("             \t\t\t<input type=\"submit\" value=\"Send\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 contactdetails-grid1\">\n");
      out.write("                        <div class=\"address\">\n");
      out.write("                            <h4>Address</h4>\n");
      out.write("               \t\t\t<p>12/24 Karol Bagh,Prince Road,</p>\n");
      out.write("\t\t\t\t<p>jan Path square,Delhi</p>\n");
      out.write("\t\t\t\t<p>India</p>\n");
      out.write("\t\t\t\t<p>Phone:(00) 222 666 444</p>\n");
      out.write("\t\t\t\t<p>Fax: (000) 000 00 00 0</p>\n");
      out.write("\t\t\t\t<p>Email: <a href=\"mailto:example@mail.com\">info@mycompany.com</a></p>\n");
      out.write("\t\t\t\t<p>Follow on: <a href=\"#\">Facebook</a><a href=\"#\">Twitter</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("               \t</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--//contact-->");
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
