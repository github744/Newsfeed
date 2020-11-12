package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.News;
import java.util.ArrayList;
import com.daos.NewsDao;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"icon\" type=\"image/png\" href=\"assets/img/icons.png\">\n");
      out.write("        <title>NewsFeed | Home</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/li-scroller.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/jquery.fancybox.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"assets/js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div id=\"preloader\">\n");
      out.write("                <div id=\"status\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("            <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("                <section id=\"sliderSection\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("                            <div class=\"slick_slider\">\n");
      out.write("                                ");

                           
                            NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                           
                                newsList = nd.getNewsByCatId(1,"Approved");
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                         <div class=\"single_iteam\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\"> <img src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"></a>\n");
      out.write("                                    <div class=\"slider_article\">\n");
      out.write("                                        <h2><a class=\"slider_tittle\" href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write('"');
      out.write('>');
      out.print(news.getTitle());
      out.write("</a></h2>\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("                            <div class=\"latest_post\">\n");
      out.write("                                <h2><span>Latest post</span></h2>\n");
      out.write("                                <div class=\"latest_post_container\">\n");
      out.write("                                    <div id=\"prev-button\"><i class=\"fa fa-chevron-up\"></i></div>\n");
      out.write("                                    <ul class=\"latest_postnav\">\n");
      out.write("                                  ");

                           
                           
                           
                                newsList = nd.getNewsByCatIdLimit(1,"Approved",5);
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <div class=\"media\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"media-left\"> <img src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"> </a>\n");
      out.write("                                                <div class=\"media-body\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"catg_title\"><b>");
      out.print(news.getTitle());
      out.write("</b> </a> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div id=\"next-button\"><i class=\"fa  fa-chevron-down\"></i></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <section id=\"contentSection\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("                            <div class=\"left_content\">\n");
      out.write("                                <div class=\"single_post_content\">\n");
      out.write("                                    <h2><span>Business</span></h2>\n");
      out.write("                                    <div class=\"single_post_content_left\">\n");
      out.write("                                        <ul class=\"business_catgnav  wow fadeInDown\">\n");
      out.write("                                             ");
 newsList = nd.getNewsByCatIdLimit(4,"Approved",1);
                                                for(News news : newsList){
      out.write("\n");
      out.write("                                            <li>\n");
      out.write("                                                <figure class=\"bsbig_fig\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"featured_img\"> <img alt=\"\" src=\"");
      out.print(news.getImage());
      out.write("\"> <span class=\"overlay\"></span> </a>\n");
      out.write("                                                    <figcaption> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write('"');
      out.write('>');
      out.print(news.getTitle());
      out.write("</a> </figcaption>\n");
      out.write("                                                   ");
 String desc = news.getDescription().trim();
      out.write("  <p>");
      out.print( desc.length() > 100 ? desc.substring(0, 200) : desc);
      out.write(" ...</p>\n");
      out.write("                                                </figure>\n");
      out.write("                                            </li>");
}
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"single_post_content_right\">\n");
      out.write("                                        <ul class=\"spost_nav\">\n");
      out.write("                                             ");

                           
                           
                           
                                newsList = nd.getNewsByCatId(4,"Approved");
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"media wow fadeInDown\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"media-left\"><img src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"> </a>\n");
      out.write("                                                    <div class=\"media-body\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"catg_title\">");
      out.print(news.getTitle());
      out.write(" </a> </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                         ");
}
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"fashion_technology_area\">\n");
      out.write("                                    <div class=\"fashion\">\n");
      out.write("                                        <div class=\"single_post_content\">\n");
      out.write("                                            <h2><span>Entertainment</span></h2>\n");
      out.write("                                            <ul class=\"business_catgnav wow fadeInDown\">\n");
      out.write("                                                 ");
 newsList = nd.getNewsByCatIdLimit(10,"Approved",1);
                                                for(News news : newsList){
      out.write("\n");
      out.write("                                                <li>\n");
      out.write("                                                    <figure class=\"bsbig_fig\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"featured_img\"> <img alt=\"\" src=\"");
      out.print(news.getImage());
      out.write("\"> <span class=\"overlay\"></span> </a>\n");
      out.write("                                                        <figcaption> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write('"');
      out.write('>');
      out.print(news.getTitle());
      out.write("</a> </figcaption>\n");
      out.write("                                                         ");
 String desc = news.getDescription().trim();
      out.write("      <p>");
      out.print( desc.length() > 100 ? desc.substring(0, 150) : desc);
      out.write(" ......</p>\n");
      out.write("                                                    </figure>\n");
      out.write("                                                </li>");
}
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                            <ul class=\"spost_nav\">\n");
      out.write("                                                ");

                           
                           
                           
                                newsList = nd.getNewsByCatId(10,"Approved");
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                                                <li>\n");
      out.write("                                                    <div class=\"media wow fadeInDown\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"media-left\"> <img alt=\"\" src=\"");
      out.print(news.getImage());
      out.write("\"> </a>\n");
      out.write("                                                        <div class=\"media-body\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"catg_title\">");
      out.print(news.getTitle());
      out.write("</a> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"technology\">\n");
      out.write("                                        <div class=\"single_post_content\">\n");
      out.write("                                            <h2><span>Technology</span></h2>\n");
      out.write("                                            <ul class=\"business_catgnav\">\n");
      out.write("                                                 ");
 newsList = nd.getNewsByCatIdLimit(3,"Approved",1);
                                                for(News news : newsList){
      out.write("\n");
      out.write("                                                <li>\n");
      out.write("                                                    <figure class=\"bsbig_fig wow fadeInDown\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"featured_img\"> <img alt=\"\" src=\"");
      out.print(news.getImage());
      out.write("\"> <span class=\"overlay\"></span> </a>\n");
      out.write("                                                        <figcaption> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write('"');
      out.write('>');
      out.print(news.getTitle());
      out.write("</a> </figcaption>\n");
      out.write("                                                     ");
 String desc = news.getDescription().trim();
      out.write("      <p>");
      out.print( desc.length() > 100 ? desc.substring(0, 200) : desc);
      out.write(" ......</p>\n");
      out.write("                                                    </figure>\n");
      out.write("                                                </li>");
}
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                            <ul class=\"spost_nav\">\n");
      out.write("                                                ");

                           
                           
                           
                                newsList = nd.getNewsByCatId(3,"Approved");
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                                                <li>\n");
      out.write("                                                    <div class=\"media wow fadeInDown\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"media-left\"> <img alt=\"\" src=\"");
      out.print(news.getImage());
      out.write("\"> </a>\n");
      out.write("                                                        <div class=\"media-body\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"catg_title\"> ");
      out.print(news.getTitle());
      out.write("</a> </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>\n");
      out.write("                                               ");
}
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"single_post_content\">\n");
      out.write("                                    <h2><span>Photography</span></h2>\n");
      out.write("                                    <ul class=\"photograph_nav  wow fadeInDown\">\n");
      out.write("                                          ");

                           
                          
                               newsList = nd.getNewsByLimit("Approved",0, 6);
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <div class=\"photo_grid\">\n");
      out.write("                                                <figure class=\"effect-layla\"> <a class=\"fancybox-buttons\" data-fancybox-group=\"button\" href=\"");
      out.print(news.getImage());
      out.write("\" title=\"");
      out.print(news.getTitle());
      out.write("\"> <img src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"/></a> </figure>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"single_post_content\">\n");
      out.write("                                    <h2><span>Games</span></h2>\n");
      out.write("                                    <div class=\"single_post_content_left\">\n");
      out.write("                                        <ul class=\"business_catgnav\">\n");
      out.write("                                              ");
 newsList = nd.getNewsByCatIdLimit(11,"Approved",1);
                                                for(News news : newsList){
      out.write("\n");
      out.write("                                            <li>\n");
      out.write("                                                <figure class=\"bsbig_fig  wow fadeInDown\"> <a class=\"featured_img\" href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\"> <img src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"> <span class=\"overlay\"></span> </a>\n");
      out.write("                                                    <figcaption> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write('"');
      out.write('>');
      out.print(news.getTitle());
      out.write("</a> </figcaption>\n");
      out.write("                                                 ");
 String desc = news.getDescription().trim();
      out.write("   <p>");
      out.print( desc.length() > 100 ? desc.substring(0, 200) : desc);
      out.write("...</p>\n");
      out.write("                                                </figure>\n");
      out.write("                                            </li>");
}
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"single_post_content_right\">\n");
      out.write("                                        <ul class=\"spost_nav\">\n");
      out.write("                                            ");

                           
                           
                           
                                newsList = nd.getNewsByCatId(11,"Approved");
                           
                                
                         for(News news : newsList){
      out.write("\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"media wow fadeInDown\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"media-left\"> <img alt=\"\" src=\"");
      out.print(news.getImage());
      out.write("\"> </a>\n");
      out.write("                                                    <div class=\"media-body\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"catg_title\"> ");
      out.print(news.getTitle());
      out.write("</a> </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                                <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("                                    <h2><span>Subscription</span></h2><br/>\n");
      out.write("                                    <ul>\n");
      out.write("\n");
      out.write("                                        <form  action=\"AdminController?op=addsubscriber\" method=\"post\">\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\"   class=\"form-control\" placeholder=\"Name*\" required=\"required\" name=\"name\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"email\"  class=\"form-control\" placeholder=\"Email*\" required=\"required\" name=\"email\"> \n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <center class=\"contact_form\">  <input type=\"submit\" value=\"Join Now\" id=\"submit\" name=\"submit\"></center> \n");
      out.write("                                        </form> \n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </aside>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script> \n");
      out.write("        <script src=\"assets/js/wow.min.js\"></script> \n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"assets/js/slick.min.js\"></script> \n");
      out.write("        <script src=\"assets/js/jquery.li-scroller.1.0.js\"></script> \n");
      out.write("        <script src=\"assets/js/jquery.newsTicker.min.js\"></script> \n");
      out.write("        <script src=\"assets/js/jquery.fancybox.pack.js\"></script> \n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("                   \n");
      out.write("\n");
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
