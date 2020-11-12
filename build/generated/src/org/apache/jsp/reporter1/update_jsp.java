package org.apache.jsp.reporter1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.News;
import com.beans.Reporter;
import com.beans.Category;
import java.util.ArrayList;
import com.daos.NewsDao;
import com.daos.ReporterDao;
import com.daos.CategoryDao;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit News</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/ico\" href=\"../assest/images/icon.ico\" >\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                function readURL(input, preview) {\n");
      out.write("                    if (input.files && input.files[0]) {\n");
      out.write("                        var reader = new FileReader();\n");
      out.write("\n");
      out.write("                        reader.onload = function (e) {\n");
      out.write("                            preview.src = e.target.result;\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        reader.readAsDataURL(input.files[0]);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                .bd-placeholder-img {\n");
      out.write("                    font-size: 1.125rem;\n");
      out.write("                    text-anchor: middle;\n");
      out.write("                    -webkit-user-select: none;\n");
      out.write("                    -moz-user-select: none;\n");
      out.write("                    -ms-user-select: none;\n");
      out.write("                    user-select: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                @media (min-width: 768px) {\n");
      out.write("                    .bd-placeholder-img-lg {\n");
      out.write("                        font-size: 3.5rem;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body background=\"../assest/images/account.jpg\" >\n");
      out.write("        ");
      com.beans.Reporter reporter = null;
      synchronized (session) {
        reporter = (com.beans.Reporter) _jspx_page_context.getAttribute("reporter", PageContext.SESSION_SCOPE);
        if (reporter == null){
          reporter = new com.beans.Reporter();
          _jspx_page_context.setAttribute("reporter", reporter, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

            if (session.getAttribute("reporter") == null) {
                response.sendRedirect("../login.jsp");
                return;
            }
        
      out.write("     \n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                ");

                    int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
                    ReporterDao rd = new ReporterDao();
                     reporter = rd.getById(id);
                      session.setAttribute("reporter1", reporter);

                
      out.write("\n");
      out.write("\n");
      out.write("                <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-4\">\n");
      out.write("                    <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col col-md-3\" style=\"position: fixed;right: 0px;\">\n");
      out.write("                                        ");
 if (request.getParameter("submit") != null) {
      out.write("\n");
      out.write("                                         ");
      com.beans.Reporter reporter1 = null;
      synchronized (session) {
        reporter1 = (com.beans.Reporter) _jspx_page_context.getAttribute("reporter1", PageContext.SESSION_SCOPE);
        if (reporter1 == null){
          reporter1 = new com.beans.Reporter();
          _jspx_page_context.setAttribute("reporter1", reporter1, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("reporter1"), request);
      out.write("\n");
      out.write("                                            <form action=\"../ReporterController?op=update\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                                <img src=\"../");
      out.print(reporter1.getIamge());
      out.write("\" style=\"width:200px;height: 200px\" border=\"2\" id=\"preview\" class=\"form-control\"/><br/>\n");
      out.write("                                            <input type=\"file\" class=\"btn btn-success form-control\" name=\"iamge\" onchange=\"readURL(this, preview);\"/>\n");
      out.write("                                            <br/><br/>\n");
      out.write("                                            <input type=\"submit\" value=\"Add to Database\" name=\"submit\" class=\"btn btn-primary\"/>\n");
      out.write("                                        </form>\n");
      out.write("                                        ");
}  
      out.write("\n");
      out.write("                                                \n");
      out.write("                                             \n");
      out.write("\n");
      out.write("                                      \n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col col-md-9\">\n");
      out.write("                                        <form method=\"post\" class=\"form\" >\n");
      out.write("                                            <table class=\"table\">\n");
      out.write("                                                <tr><th colspan=\"2\"><center><h2>Edit Profile </h2></center></th></tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Enter Reporter Name </td>\n");
      out.write("                                                    <td><input type=\"text\" name=\"name\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Enter Reporter DOB </td>\n");
      out.write("                                                    <td><input type=\"date\" name=\"dob\" class=\"form-control\" value=\"");
      out.print(reporter.getDob());
      out.write("\"/></td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Select Gender  </td>\n");
      out.write("                                                               <td><input type=\"radio\" name=\"gender\" value=\"Male\" ");
 if (reporter.getGender().equalsIgnoreCase("Male")) {
                                                            out.println("checked");
                                                        } 
      out.write("/> Male \n");
      out.write("                                                               <input type=\"radio\" name=\"gender\" value=\"Female\"");
 if (reporter.getGender().equalsIgnoreCase("Female")) {
                                                                out.println("checked");
                                                            }
      out.write("/> Female \n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Enter Reporter's Contact </td>\n");
      out.write("                                                    <td><input type=\"text\" name=\"contact\" class=\"form-control\" value=\"");
      out.print(reporter.getContact());
      out.write("\"/></td>\n");
      out.write("                                                </tr> \n");
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Enter Reporter's Email </td>\n");
      out.write("                                                    <td><input type=\"email\" name=\"email\" class=\"form-control\" value=\"");
      out.print(reporter.getEmail());
      out.write("\"/></td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                 \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </table>\n");
      out.write("                                            <input type=\"submit\" value=\"save and Next\" name=\"submit\" id =\"submit\" class=\"form-control btn btn-primary\"/>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
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
