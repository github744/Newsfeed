package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <header id=\"header\">\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"header_top\">\n");
      out.write("          <div class=\"header_top_left\">\n");
      out.write("            <ul class=\"top_nav\">\n");
      out.write("              <li><a href=\"index.html\">Home</a></li>\n");
      out.write("              <li><a href=\"#\">About</a></li>\n");
      out.write("              <li><a href=\"pages/contact.jsp\">Contact</a></li>\n");
      out.write("         \n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"header_top_right\">\n");
      out.write("            <p>Friday, December 05, 2045</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"header_bottom\">\n");
      out.write("          <div class=\"logo_area\"><a href=\"index.html\" class=\"logo\"><img src=\"images/logo.jpg\" alt=\"\"></a></div>\n");
      out.write("          <div class=\"add_banner\"><a href=\"#\"><img src=\"images/addbanner_728x90_V1.jpg\" alt=\"\"></a></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <section id=\"navArea\">\n");
      out.write("    <nav class=\"navbar navbar-inverse\" role=\"navigation\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("        <ul class=\"nav navbar-nav main_nav\">\n");
      out.write("          <li class=\"active\"><a href=\"index.html\"><span class=\"fa fa-home desktop-home\"></span><span class=\"mobile-show\">Home</span></a></li>\n");
      out.write("          <li><a href=\"#\">Technology</a></li>\n");
      out.write("          <li class=\"dropdown\"> <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Mobile</a>\n");
      out.write("            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("              <li><a href=\"#\">Android</a></li>\n");
      out.write("              <li><a href=\"#\">Samsung</a></li>\n");
      out.write("              <li><a href=\"#\">Nokia</a></li>\n");
      out.write("              <li><a href=\"#\">Walton Mobile</a></li>\n");
      out.write("              <li><a href=\"#\">Sympony</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a href=\"#\">Laptops</a></li>\n");
      out.write("          <li><a href=\"#\">Tablets</a></li>\n");
      out.write("          <li><a href=\"pages/contact.html\">Contact Us</a></li>\n");
      out.write("          <li><a href=\"pages/404.html\">404 Page</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  </section>\n");
      out.write("  <section id=\"newsSection\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12 col-md-12\">\n");
      out.write("        <div class=\"latest_newsarea\"> <span>Latest News</span>\n");
      out.write("          <ul id=\"ticker01\" class=\"news_sticker\">\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My First News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Second News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Third News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Four News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Five News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Six News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Seven News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail3.jpg\" alt=\"\">My Eight News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"images/news_thumbnail2.jpg\" alt=\"\">My Nine News Item</a></li>\n");
      out.write("          </ul>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>");
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
