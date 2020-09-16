package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.News;
import java.util.ArrayList;
import com.daos.NewsDao;
import com.daos.FeedbackDao;
import java.sql.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("                            <aside class=\"right_content\">\n");
      out.write("                                <div class=\"single_sidebar\">\n");
      out.write("                                    <h2><span>Popular Post</span></h2>\n");
      out.write("                                    <ul class=\"spost_nav\">\n");
      out.write("                                      ");

                           
                             NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                           
                                newsList = nd.getNewsByCatIdLimit(2,5);
                           
                                
                         for(News news : newsList){
      out.write("    \n");
      out.write("                                        <li>\n");
      out.write("                                            <div class=\"media wow fadeInDown\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"media-left\"> <img src=\"");
      out.print(news.getImage());
      out.write("\" alt=\"\"> </a>\n");
      out.write("                                                <div class=\"media-body\"> <a href=\"detailnews.jsp?id=");
      out.print(news.getId());
      out.write("\" class=\"catg_title\">");
      out.print(news.getTitle());
      out.write("</a> </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"single_sidebar\">\n");
      out.write("                                    <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("                                        <li role=\"presentation\" class=\"active\"><a href=\"#category\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">Category</a></li>\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#video\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">Video</a></li>\n");
      out.write("                                        <li role=\"presentation\"><a href=\"#comments\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Feedback</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div class=\"tab-content\">\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane active\" id=\"category\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=12\">Sports</a></li>\n");
      out.write("                                                <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=10\">Entertainment</a></li>\n");
      out.write("                                                <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=4\">Business</a></li>\n");
      out.write("                                                  <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=5\">Education</a></li>\n");
      out.write("                                                <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=3\">Technology</a></li>\n");
      out.write("                                                <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=11\">Games</a></li>\n");
      out.write("                                                <li class=\"cat-item\"><a href=\"Categorypage.jsp?cat_id=6\">Life &amp; Style</a></li>\n");
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane\" id=\"video\">\n");
      out.write("                                            <div class=\"vide_area\">\n");
      out.write("                                                <iframe width=\"100%\" height=\"250\"  src=\"https://www.youtube.com/embed/xsPKfSIiLV4\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane\" id=\"comments\">\n");
      out.write("                                           <form action=\"#\" class=\"contact_form\">\n");
      out.write("              <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Name*\">\n");
      out.write("             \n");
      out.write("              <textarea class=\"form-control\" name=\"message\" cols=\"30\" rows=\"10\" placeholder=\"Message*\"></textarea>\n");
      out.write("              <input type=\"submit\" name=\"submit\"  value=\"Send Message\">\n");
      out.write("            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("                                    <h2><span>Sponsor</span></h2>\n");
      out.write("                                    <a class=\"sideAdd\" href=\"#\"><img src=\"images/add_img.jpg\" alt=\"\"></a> </div>\n");
      out.write("\n");
      out.write("                                <div class=\"single_sidebar wow fadeInDown\">\n");
      out.write("                                    <h2><span>Links</span></h2>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"404.jsp\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i>&nbsp;Blog</a></li>\n");
      out.write("\n");
      out.write("                                        <li><a href=\"login.jsp\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>&nbsp;Login</a></li>\n");
      out.write("                                        <li><a href=\"Register.jsp\"><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i>&nbsp;Register</a></li><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("       \n");
      out.write("    ");

        
        if(request.getParameter("submit")!=null ){
      out.write("\n");
      out.write("             ");
      com.beans.Feedback feedback = null;
      synchronized (_jspx_page_context) {
        feedback = (com.beans.Feedback) _jspx_page_context.getAttribute("feedback", PageContext.PAGE_SCOPE);
        if (feedback == null){
          feedback = new com.beans.Feedback();
          _jspx_page_context.setAttribute("feedback", feedback, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("feedback"), request);
      out.write("\n");
      out.write("         ");
  FeedbackDao fd = new FeedbackDao();
           if (fd.add(feedback)) {
                        
                        response.sendRedirect(request.getHeader("referer"));
                    }}
    
      out.write("\n");
      out.write("     ");
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
