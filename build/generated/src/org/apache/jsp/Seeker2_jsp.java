package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class Seeker2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    function myfunction()\n");
      out.write("                    {\n");
      out.write("                        //alert(\"total cost\");\n");
      out.write("                        var f_exp = document.getElementById('cop1').value;\n");
      out.write("                        var pass_no =document.getElementById('qun1').value;\n");
      out.write("                        var mul = f_exp * pass_no;\n");
      out.write("                        var ttl = document.getElementById('tc');\n");
      out.write("                        ttl.value=innerHTML =mul;\n");
      out.write("                    }  \n");
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
      out.write("                                return false;\n");
      out.write("                        }\n");
      out.write("                        catch (err) \n");
      out.write("                        {\n");
      out.write("                            alert(err.Description);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    function onlyNos(e, t)\n");
      out.write("                    {\n");
      out.write("                        try\n");
      out.write("                        {\n");
      out.write("                            if (window.event)\n");
      out.write("                            {\n");
      out.write("                                var charCode = window.event.keyCode;\n");
      out.write("                            }\n");
      out.write("                            else if (e) \n");
      out.write("                            {\n");
      out.write("                                var charCode = e.which;\n");
      out.write("                            }\n");
      out.write("                            else 1\n");
      out.write("                            { \n");
      out.write("                                return true; \n");
      out.write("                            }\n");
      out.write("                            if (charCode > 31 && (charCode < 48 || charCode > 57))\n");
      out.write("                            {\n");
      out.write("                                return false;\n");
      out.write("                            }\n");
      out.write("                            return true;\n");
      out.write("                        }\n");
      out.write("                        catch (err)\n");
      out.write("                        {\n");
      out.write("                            alert(err.Description);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                </script>\n");
      out.write("<!--script-->\n");
      out.write("</head>\n");
      out.write("<body background=\"images/backk.gif\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"col-md-3\" style=\"background-color: burlywood; height: 1200px;\">\n");
      out.write("        <center><h3 style=\"margin-top: 30px; color: saddlebrown;\">RaktPlus @ your service</h3><br/><br/>\n");
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
      out.write("            <img src=\"images/seek11.jpg\" alt=\"\"/>\n");
      out.write("            <img src=\"images/seeker2.jpg\" alt=\"\"/>\n");
      out.write("        </center>\n");
      out.write("                </div>\n");
      out.write("    ");

        String bg=request.getParameter("bg");
        String loc=request.getParameter("loc");
        String cost=request.getParameter("cost");
        String qun=request.getParameter("qun");
    
      out.write("\n");
      out.write("    <div class=\"team\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <center>\n");
      out.write("            <img src=\"images/Seeker details.JPG\" alt=\"\"/></center>\n");
      out.write("        <form action=\"Skbean2.jsp\">\n");
      out.write("            <center>\n");
      out.write("            <table style=\"margin-top:50px;\">\n");
      out.write("                 <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Blood Group:</h2></td>\n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(bg);
      out.write("\" name=\"bg\" maxlength=\"0\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" required></td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Location:</h2></td>\n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(loc);
      out.write("\" name=\"loc\" maxlength=\"0\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" required></td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Cost Per Unit:</h2></td>\n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(cost);
      out.write("\" id=\"cop1\" name=\"cop\" maxlength=\"0\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" required></td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Quantity:</h2></td>\n");
      out.write("                    <td><input type=\"text\" id=\"qun1\" name=\"qun\" max=\"");
      out.print(qun);
      out.write("\" maxlength=\"1\" onblur=\"myfunction();\" onkeypress=\"return onlyNos(event,this);\" placeholder=\"enter quantity\" required></td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Total Cost:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"tc\" id=\"tc\" value=\"Total is :\" maxlength=\"0\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Patient's Name:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"pname\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter name\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Patient's Gender: </h2></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"gen\" value=\"Male\">Male<input type=\"radio\" name=\"gen\" value=\"Female\">Female</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Receiver's Name:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"rcnm\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter name\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Receiver's Contact No:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"rcno\" pattern=\"[0-9]{10}\" title=\"ten digit number\" maxlength=\"10\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter contact no.\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: Times New Roman;\">Receiver's Email:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter email\" required /></td>\n");
      out.write("                </tr> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("now");
      _jspx_th_c_set_0.setValue(new java.util.Date());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("                ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_1.setPageContext(_jspx_page_context);
      _jspx_th_c_set_1.setParent(null);
      _jspx_th_c_set_1.setVar("tomorrow");
      _jspx_th_c_set_1.setValue(new Date(new Date().getTime() + 60*60*24*1000*7));
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Required Date:</h2></td>\n");
      out.write("                    <td><select name=\"rdt\">\n");
      out.write("                        <option>");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Replacer's Name:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"rpnm\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter name\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Replacement's Date:</h2></td>\n");
      out.write("                    <td><select name=\"rpdt\">\n");
      out.write("                        <option>");
      if (_jspx_meth_fmt_formatDate_1(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" value=\"Next\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">\n");
      out.write("               &emsp;&emsp;&emsp; <input type=\"reset\" value=\"Reset\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">\n");
      out.write("            </center>                    \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent(null);
    _jspx_th_fmt_formatDate_1.setType("date");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tomorrow}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }
}
