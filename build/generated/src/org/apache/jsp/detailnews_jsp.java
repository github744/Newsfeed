package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailnews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>NewsFeed | Pages | Single Page</title>\n");
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
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"../assets/js/html5shiv.min.js\"></script>\n");
      out.write("<script src=\"../assets/js/respond.min.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"preloader\">\n");
      out.write("  <div id=\"status\">&nbsp;</div>\n");
      out.write("</div>\n");
      out.write("<a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("<div class=\"container\">\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("  <section id=\"contentSection\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("        <div class=\"left_content\">\n");
      out.write("          <div class=\"single_page\">\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("              <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("              <li><a href=\"#\">Technology</a></li>\n");
      out.write("              <li class=\"active\">Mobile</li>\n");
      out.write("            </ol>\n");
      out.write("            <h1>Morbi dapibus, enim quis luctus interdum</h1>\n");
      out.write("            <div class=\"post_commentbox\"> <a href=\"#\"><i class=\"fa fa-user\"></i>Wpfreeware</a> <span><i class=\"fa fa-calendar\"></i>6:49 AM</span> <a href=\"#\"><i class=\"fa fa-tags\"></i>Technology</a> </div>\n");
      out.write("            <div class=\"single_page_content\"> <img class=\"img-center\" src=\"images/single_post_img.jpg\" alt=\"\">\n");
      out.write("              <p>Nunc tincidunt, elit non cursus euismod, lacus augue ornare metus, egestas imperdiet nulla nisl quis mauris. Suspendisse a pharetra urna. Morbi dui lectus, pharetra nec elementum eget, vulputate ut nisi. Aliquam accumsan, nulla sed feugiat vehicula, lacus justo semper libero, quis porttitor turpis odio sit amet ligula. Duis dapibus fermentum orci, nec malesuada libero vehicula ut. Integer sodales, urna eget interdum eleifend, nulla nibh laoreet nisl, quis dignissim mauris dolor eget mi. Donec at mauris enim. Duis nisi tellus, adipiscing a convallis quis, tristique vitae risus. Nullam molestie gravida lobortis. Proin ut nibh quis felis auctor ornare. Cras ultricies, nibh at mollis faucibus, justo eros porttitor mi, quis auctor lectus arcu sit amet nunc. Vivamus gravida vehicula arcu, vitae vulputate augue lacinia faucibus.</p>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <nav class=\"nav-slit\"> <a class=\"prev\" href=\"#\"> <span class=\"icon-wrap\"><i class=\"fa fa-angle-left\"></i></span>\n");
      out.write("        <div>\n");
      out.write("          <h3>City Lights</h3>\n");
      out.write("          <img src=\"../images/post_img1.jpg\" alt=\"\"/> </div>\n");
      out.write("        </a> <a class=\"next\" href=\"#\"> <span class=\"icon-wrap\"><i class=\"fa fa-angle-right\"></i></span>\n");
      out.write("        <div>\n");
      out.write("          <h3>Street Hills</h3>\n");
      out.write("          <img src=\"../images/post_img1.jpg\" alt=\"\"/> </div>\n");
      out.write("        </a> </nav>\n");
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
      out.write("          <div class=\"single_sidebar\">\n");
      out.write("            <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("              <li role=\"presentation\" class=\"active\"><a href=\"#category\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">Category</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"#video\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">Video</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"#comments\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Comments</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("              <div role=\"tabpanel\" class=\"tab-pane active\" id=\"category\">\n");
      out.write("                <ul>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Sports</a></li>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Fashion</a></li>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Business</a></li>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Technology</a></li>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Games</a></li>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Life &amp; Style</a></li>\n");
      out.write("                  <li class=\"cat-item\"><a href=\"#\">Photography</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div role=\"tabpanel\" class=\"tab-pane\" id=\"video\">\n");
      out.write("                <div class=\"vide_area\">\n");
      out.write("                  <iframe width=\"100%\" height=\"250\" src=\"http://www.youtube.com/embed/h5QWbURNEpA?feature=player_detailpage\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div role=\"tabpanel\" class=\"tab-pane\" id=\"comments\">\n");
      out.write("                <ul class=\"spost_nav\">\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img1.jpg\"> </a>\n");
      out.write("                      <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 1</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img2.jpg\"> </a>\n");
      out.write("                      <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 2</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media wow fadeInDown\"> <a href=\"single_page.html\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img1.jpg\"> </a>\n");
      out.write("                      <div class=\"media-body\"> <a href=\"single_page.html\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 3</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media wow fadeInDown\"> <a href=\"single_page.jsp\" class=\"media-left\"> <img alt=\"\" src=\"../images/post_img2.jpg\"> </a>\n");
      out.write("                      <div class=\"media-body\"> <a href=\"single_page.jsp\" class=\"catg_title\"> Aliquam malesuada diam eget turpis varius 4</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("            <h2><span>Sponsor</span></h2>\n");
      out.write("            <a class=\"sideAdd\" href=\"#\"><img src=\"../images/add_img.jpg\" alt=\"\"></a> </div>\n");
      out.write("          <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("            <h2><span>Category Archive</span></h2>\n");
      out.write("            <select class=\"catgArchive\">\n");
      out.write("              <option>Select Category</option>\n");
      out.write("              <option>Life styles</option>\n");
      out.write("              <option>Sports</option>\n");
      out.write("              <option>Technology</option>\n");
      out.write("              <option>Treads</option>\n");
      out.write("            </select>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("            <h2><span>Links</span></h2>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\">Blog</a></li>\n");
      out.write("              <li><a href=\"#\">Rss Feed</a></li>\n");
      out.write("              <li><a href=\"#\">Login</a></li>\n");
      out.write("              <li><a href=\"#\">Life &amp; Style</a></li>\n");
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
