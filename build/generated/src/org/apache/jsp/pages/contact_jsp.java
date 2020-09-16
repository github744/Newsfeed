package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>NewsFeed | Pages | Contact</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/font.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/li-scroller.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/slick.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/jquery.fancybox.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/theme.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/css/style.css\">\n");
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
      out.write("  <header id=\"header\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"header_top\">\n");
      out.write("          <div class=\"header_top_left\">\n");
      out.write("            <ul class=\"top_nav\">\n");
      out.write("              <li><a href=\"../index.html\">Home</a></li>\n");
      out.write("              <li><a href=\"#\">About</a></li>\n");
      out.write("              <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"header_top_right\">\n");
      out.write("            <p>Friday, December 05, 2045</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"header_bottom\">\n");
      out.write("          <div class=\"logo_area\"><a href=\"../index.html\" class=\"logo\"><img src=\"../images/logo.jpg\" alt=\"\"></a></div>\n");
      out.write("          <div class=\"add_banner\"><a href=\"#\"><img src=\"../images/addbanner_728x90_V1.jpg\" alt=\"\"></a></div>\n");
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
      out.write("          <li class=\"active\"><a href=\"../index.html\"><span class=\"fa fa-home desktop-home\"></span><span class=\"mobile-show\">Home</span></a></li>\n");
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
      out.write("          <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("          <li><a href=\"404.html\">404 Page</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  </section>\n");
      out.write("  <section id=\"newsSection\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12 col-md-12\">\n");
      out.write("        <div class=\"latest_newsarea\"> <span>Latest News</span>\n");
      out.write("          <ul id=\"ticker01\" class=\"news_sticker\">\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My First News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Second News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Third News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Four News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Five News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Six News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Seven News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail3.jpg\" alt=\"\">My Eight News Item</a></li>\n");
      out.write("            <li><a href=\"#\"><img src=\"../images/news_thumbnail2.jpg\" alt=\"\">My Nine News Item</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"social_area\">\n");
      out.write("            <ul class=\"social_nav\">\n");
      out.write("              <li class=\"facebook\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"twitter\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"flickr\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"pinterest\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"googleplus\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"vimeo\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"youtube\"><a href=\"#\"></a></li>\n");
      out.write("              <li class=\"mail\"><a href=\"#\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <section id=\"contentSection\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("        <div class=\"left_content\">\n");
      out.write("          <div class=\"contact_area\">\n");
      out.write("            <h2>Contact Us</h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dosectetur adipisicing elit, sed do.Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\n");
      out.write("            <form action=\"#\" class=\"contact_form\">\n");
      out.write("              <input class=\"form-control\" type=\"text\" placeholder=\"Name*\">\n");
      out.write("              <input class=\"form-control\" type=\"email\" placeholder=\"Email*\">\n");
      out.write("              <textarea class=\"form-control\" cols=\"30\" rows=\"10\" placeholder=\"Message*\"></textarea>\n");
      out.write("              <input type=\"submit\" value=\"Send Message\">\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("        <aside class=\"right_content\">\n");
      out.write("          <div class=\"single_sidebar\">\n");
      out.write("            <h2><span>Popular Post</span></h2>\n");
      out.write("            <ul class=\"spost_nav\">\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.html\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img1.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.html\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 1</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.html\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img2.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.html\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 2</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.html\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img1.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.html\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 3</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <div class=\"media wow fadeInDown\"> <a href=\"single_page.html\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img2.jpg\"> </a>\n");
      out.write("                  <div class=\"media-body\"> <a href=\"single_page.html\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 4</a> </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </aside>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <footer id=\"footer\">\n");
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
      out.write("      <p class=\"copyright\">Copyright &copy; 2045 <a href=\"../index.html\">NewsFeed</a></p>\n");
      out.write("      <p class=\"developer\">Developed By Wpfreeware</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("<script src=\"../assets/js/jquery.min.js\"></script> \n");
      out.write("<script src=\"../assets/js/wow.min.js\"></script> \n");
      out.write("<script src=\"../assets/js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"../assets/js/slick.min.js\"></script> \n");
      out.write("<script src=\"../assets/js/jquery.li-scroller.1.0.js\"></script> \n");
      out.write("<script src=\"../assets/js/jquery.newsTicker.min.js\"></script> \n");
      out.write("<script src=\"../assets/js/jquery.fancybox.pack.js\"></script> \n");
      out.write("<script src=\"../assets/js/custom.js\"></script>\n");
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
