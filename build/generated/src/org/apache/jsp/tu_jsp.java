package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.News;
import java.util.ArrayList;
import com.daos.NewsDao;
import com.beans.Category;
import com.daos.CategoryDao;
import java.sql.*;

public final class tu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NewsFeed</title>\n");
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
      out.write("               \n");
      out.write("                <section id=\"contentSection\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("                            <div class=\"left_content\">\n");
      out.write("                                <div class=\"single_post_content\">\n");
      out.write("                                    <h2><span>Category</span></h2>\n");
      out.write("                                   <div class=\"content-wrapper\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("              <div class=\"card\" data-aos=\"fade-up\">\n");
      out.write("                  \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                          ");
 int catid = request.getParameter("cat_id")!=null? Integer.parseInt(request.getParameter("cat_id")):-1;
                                                            CategoryDao cd = new CategoryDao();
                                                              
                           
                           
                           Category cat=null;
                      
                        cat = cd.getById(catid);
                                                           
                                                 
      out.write("\n");
      out.write("                      <h1 class=\"font-weight-600 mb-4\">\n");
      out.write("                       ");
      out.print(cat.getName());
      out.write("\n");
      out.write("                      </h1>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                    ");
  
                            NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                            if(catid!=-1)
                                newsList = nd.getNewsByCatId(catid);
                            else
                                newsList= nd.getAllNewsByStatus("approved");
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                ");

                                                for(News news : newsList){
      out.write("\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                         \n");
      out.write("                               <div class=\"col-sm-4 grid-margin\">\n");
      out.write("                          <div class=\"rotate-img\">\n");
      out.write("                            <img\n");
      out.write("                              src=\"");
      out.print(news.getImage());
      out.write("\"\n");
      out.write("                              alt=\"banner\"\n");
      out.write("                              class=\"img-fluid\" style=\"max-width: 100%; max-height:100%;\"\n");
      out.write("                            />\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8 grid-margin\">\n");
      out.write("                          <h3 class=\"font-weight-600 mb-2\">\n");
      out.write("                            No charges over 2017 battle bus cases\n");
      out.write("                          </h3>\n");
      out.write("                          <p class=\"fs-13 text-muted mb-0\">\n");
      out.write("                            <span class=\"mr-2\">Photo </span>10 Minutes ago\n");
      out.write("                          </p>\n");
      out.write("                          <p class=\"fs-15\">\n");
      out.write("                            Lorem Ipsum has been the industry's standard dummy\n");
      out.write("                            text ever since the 1500s, when an unknown printer\n");
      out.write("                            took a galley of type and scrambled it to make a\n");
      out.write("                            type specimen book.\n");
      out.write("                          </p>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                  </div><br/>");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                           \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                                <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("                                    <h2><span>Subscription</span></h2><br/>\n");
      out.write("                                    <ul>\n");
      out.write("\n");
      out.write("                                        <form  method=\"post\">\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\"  id=\"inputEmail\" value=\"\" class=\"form-control\" placeholder=\"Name*\" required=\"required\" name=\"userid\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"password\" id=\"inputPassword\"  value=\"\" class=\"form-control\" placeholder=\"Email*\" required=\"required\" name=\"password\"> \n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <center class=\"contact_form\">  <input type=\"submit\" value=\"Join Now\" id=\"submit\"></center> \n");
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
