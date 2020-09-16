package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <footer id=\"footer\">\n");
      out.write("    <div class=\"footer_top\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("          <div class=\"footer_widget wow fadeInLeftBig\">\n");
      out.write("            <h2>Flickr Images</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("          <div class=\"footer_widget wow fadeInDown\">\n");
      out.write("            <h2>Tag</h2>\n");
      out.write("            <ul class=\"tag_nav\">\n");
      out.write("              <li><a href=\"#\">Games</a></li>\n");
      out.write("              <li><a href=\"#\">Sports</a></li>\n");
      out.write("              <li><a href=\"#\">Fashion</a></li>\n");
      out.write("              <li><a href=\"#\">Business</a></li>\n");
      out.write("              <li><a href=\"#\">Life &amp; Style</a></li>\n");
      out.write("              <li><a href=\"#\">Technology</a></li>\n");
      out.write("              <li><a href=\"#\">Photo</a></li>\n");
      out.write("              <li><a href=\"#\">Slider</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("          <div class=\"footer_widget wow fadeInRightBig\">\n");
      out.write("            <h2>Contact</h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\n");
      out.write("            <address>\n");
      out.write("            Perfect News,1238 S . 123 St.Suite 25 Town City 3333,USA Phone: 123-326-789 Fax: 123-546-567\n");
      out.write("            </address>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer_bottom\">\n");
      out.write("      <p class=\"copyright\">Copyright &copy; 2045 <a href=\"index.html\">NewsFeed</a></p>\n");
      out.write("      <p class=\"developer\">Developed By Wpfreeware</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>");
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
