package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class _11_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                alert(\"only characters\");\n");
      out.write("                                return false;\n");
      out.write("                        }\n");
      out.write("                        catch (err) \n");
      out.write("                        {\n");
      out.write("                            alert(err.Description);\n");
      out.write("                        }\n");
      out.write("                    }                       \n");
      out.write("                function onlyNos(e, t)\n");
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
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <center> <h3 style=\"margin-top: 30px; color: black;\">Welcome to Blood Bank</h3><br/><br/>\n");
      out.write("                    <table>\n");
      out.write("                        <tr> <td>\n");
      out.write("                    <img src=\"images/slidercollage1.jpg\" alt=\"\" align=\"right\"/>\n");
      out.write("                            </td></tr>\n");
      out.write("                    </table>\n");
      out.write("        </center>\n");
      out.write("                </div>\n");
      out.write("    <div class=\"team\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <h3> Donor Details </h3>\n");
      out.write("        <form action=\"Dbean.jsp\">\n");
      out.write("            <center>\n");
      out.write("                <table style=\"margin-top:50px;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Name:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" onkeypress=\"return onlyAlphabets(event,this);\" id=\"nm\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter  name\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Email:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter email\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Age:</h2></td>\n");
      out.write("                    <td><input type=\"number\" name=\"age\" min=\"18\" max=\"60\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Weight:</h2></td>\n");
      out.write("                    <td><input type=\"number\" name=\"wt\" min=\"45\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Address:</h2></td>\n");
      out.write("                    <td><input type=\"text\" name=\"add\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter address\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Contact No:</h2></td>\n");
      out.write("                    <td><input type=\"text\" pattern=\"[0-9]{10}\" title=\"ten digit number\" maxlength=\"10\" name=\"cno\" style=\"font-size: large;font-family: monospace; font-weight: bold;\" placeholder=\"enter contact no.\" required /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Gender: </h2></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"gen\" value=\"Male\">Male<input type=\"radio\" name=\"gen\" value=\"Female\">Female</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Blood Group: </h2></td>\n");
      out.write("                    <td><select name=\"bg\">\n");
      out.write("                        <option>A positive</option>\n");
      out.write("                        <option>A negative</option>\n");
      out.write("                        <option>B positive</option>\n");
      out.write("                        <option>B negative</option>\n");
      out.write("                        <option>AB positive</option>\n");
      out.write("                        <option>AB negative</option>\n");
      out.write("                        <option>O positive</option>\n");
      out.write("                        <option>O negative</option></select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Quantity: </h2></td>\n");
      out.write("                    <td><input type=\"text\" id=\"qun1\" name=\"qun\"  maxlength=\"1\" onkeypress=\"return onlyNos(event,this);\" placeholder=\"enter quantity\" required></td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Donation Location:</h2></td>\n");
      out.write("                    <td><select name=\"loc\">\n");
      out.write("                        <option>GBH American</option>\n");
      out.write("                        <option>M.B.Hospital</option></select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>                \n");
      out.write("               \n");
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
      _jspx_th_c_set_1.setValue(new Date(new Date().getTime() + 60*60*24*1000));
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      out.write("\n");
      out.write("                ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_2.setPageContext(_jspx_page_context);
      _jspx_th_c_set_2.setParent(null);
      _jspx_th_c_set_2.setVar("exp");
      _jspx_th_c_set_2.setValue(new Date(new Date().getTime() + 60*60*24*1000*7));
      int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
      if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Donation Date:</h2></td>\n");
      out.write("                    <td><select name=\"ddt\">\n");
      out.write("                        <option>");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h2 style=\"font-family: monospace;\">Expiry Date:</h2></td>\n");
      out.write("                    <td><select name=\"edt\">\n");
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
      out.write("                <input type=\"reset\" value=\"Reset\" style=\"color:black;margin-top: 20px; width:100px; height:40px; font-size: large;\">\n");
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
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exp}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }
}
