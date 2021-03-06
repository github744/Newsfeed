package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"assets/img/icons.png\">\n");
      out.write("<title>NewsFeed | 404</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/li-scroller.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/jquery.fancybox.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/theme.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"../assets/js/html5shiv.min.js\"></script>\n");
      out.write("<script src=\"../assets/js/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"preloader\">\n");
      out.write("  <div id=\"status\">&nbsp;</div>\n");
      out.write("</div>\n");
      out.write("<a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("<div class=\"container\">\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("  <section id=\"contentSection\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("        <div class=\"left_content\">\n");
      out.write("          <div class=\"error_page\">\n");
      out.write("            <h3>We Are Sorry</h3>\n");
      out.write("            <h1>404</h1>\n");
      out.write("            <p>Unfortunately, the page you were looking for could not be found. It may be temporarily unavailable, moved or no longer exists</p>\n");
      out.write("            <span></span> <a href=\"index.jsp\" class=\"wow fadeInLeftBig\">Go to home page</a> </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("        <aside class=\"right_content\">\n");
      out.write("          <div class=\"single_sidebar\">\n");
      out.write("            <h2><span>Popular Post</span></h2>\n");
      out.write("            <ul class=\"spost_nav\">\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img1.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 1</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img2.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 2</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img1.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 3</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img2.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 4</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </aside>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      out.write("<script src=\"assets/js/jquery.min.js\"></script> \n");
      out.write("<script src=\"assets/js/wow.min.js\"></script> \n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"assets/js/slick.min.js\"></script> \n");
      out.write("<script src=\"assets/js/jquery.li-scroller.1.0.js\"></script> \n");
      out.write("<script src=\"assets/js/jquery.newsTicker.min.js\"></script> \n");
      out.write("<script src=\"assets/js/jquery.fancybox.pack.js\"></script> \n");
      out.write("<script src=\"assets/js/custom.js\"></script>\n");
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
}
