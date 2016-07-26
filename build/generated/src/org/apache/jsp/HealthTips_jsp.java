package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HealthTips_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <h3>Health Tips for Improving Haemoglobin Count</h3>\n");
      out.write("            <div class=\"services-grids\">\n");
      out.write("                <section>\n");
      out.write("                    <ul id=\"da-thumbs\" class=\"da-thumbs\">\n");
      out.write("                        <li><a href=\"images/download (2).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/download (2).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/download (4).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/download (4).jpg\" alt=\"\"/></a></li>\n");
      out.write("\t\t\t<li><a href=\"images/download (3).jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\n");
      out.write("                                <img src=\"images/download (3).jpg\" alt=\"\"/></a></li>&emsp;\n");
      out.write("                       <h2>Low Haemoglobin Levels due to Iron Deficiency</h2>\n");
      out.write("                        <p> Iron deficiency anaemia can be easily corrected by including iron rich sources in the diet.</br>\n");
      out.write("                            Leafy vegetables like spinach (palak) and fenugreek leaves (methi), beans and lentils like masoor daal, chole, moong daal, toor daal, urad daal, rajma are also good sources of iron to resort to. Here are some health benefits of methi, you need to know.</br> \n");
      out.write("                            Asparagus (shatwar) and sesame seeds (til) are other good sources of iron.</br>\n");
      out.write("                            Grains like barley (jav), rice (chawal), semolina (sooji), millet (bajra) and maize (makai) can also be included. You could use combination of any of these sources to cook delicious iron rich recipes.</br>\n");
      out.write("                            If not, munch on dried fruits such as almonds (badaam), dried peaches or raisins (manuka). If you?re a non-vegetarian, meat and fish are the best sources of iron for you.</br>\n");
      out.write("                            In case your haemoglobin levels are low despite consumption of these iron-rich foods, your body might not be able to absorb the available iron properly. So, here are some diet tips to increase iron absorption:\n");
      out.write("                            Add dried herbs to your diet, especially, coriander (dhania), spearmint (pudina), basil (tulsi), chervil (chevil), dried parsley (sukhe ajamoda), bay leaf (tejpatta).</br>\n");
      out.write("                            Another way to increase iron absorption is to minimise the intake of calcium rich foods like milk and cheese because they block the absorption of iron. Don?t drink too much of coffee, tea and alcohol.</br>\n");
      out.write("                            Avoid eating foods containing gluten like pastas and wheat products, which are also linked to anaemia. Read more about Beat anemia with beetroots.\n");
      out.write("                            Sometimes, foods such as parsley (ajwain) that are rich in oxalic acid may also interfere with absorption of iron. Have them in limited quantities.</p><br/>\n");
      out.write("                        <h2>Low Haemoglobin Levels due to Vitamin C Deficiency</h2>\n");
      out.write("                        <p> Vitamin C helps the body to absorb iron from foods. So without adequate vitamin C,  iron from food sources will not get absorbed efficiently.</br>\n");
      out.write("                            Low haemoglobin levels due to deficiency of Vitamin C can be corrected by eating fruits like guava (peru/amrud), kiwi, papaya, oranges, strawberries and grapefruit. Add all fruits together to make a delicious fruit salad or make your mixed fruit juice. Read more about 15 reasons to include vitamin C in your diet.</br>\n");
      out.write("                            You can also obtain vitamin C from vegetables including capsicum (Shimla mirch), broccoli (hara phool gobi), cabbage (Gobi), tomatoes and spinach (palak). </p><br/> \n");
      out.write("                        <h2>Low Haemoglobin Levels due to Folic Acid Deficiency</h2>\n");
      out.write("                        <p>If your haemoglobin count is low because your body is not producing sufficient red blood cells, then you could be deficient in folic acid, a B complex vitamin that is required to make red blood cells.</br>\n");
      out.write("                           Sources of folic acid include lentils, dried beans, peas, Brussels sprouts (chota band gobi), banana, corn (makai), beets, pineapple and peanuts. (Note: If you are having more of Vitamin C sources then you?ll have to increase the intake of folic acid as well because vitamin C causes excretion of folic acid from the body.</br>\n");
      out.write("                           Breakfast cereals like rice are also fair sources of folic acid. Here?s are 5 natural sources of folic acid you need in your diet.</p> <br/>\n");
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
