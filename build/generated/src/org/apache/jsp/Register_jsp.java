package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>NewsFeed | Join us</title>\n");
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
      out.write("<script>\n");
      out.write("\n");
      out.write("                function readURL(input,preview) {\n");
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
      out.write("                        \n");
      out.write("        function checkUserid(userid, x){\n");
      out.write("               ajax = new XMLHttpRequest();\n");
      out.write("               ajax.open(\"GET\",\"ReporterController?op=checkuserid&userid=\"+userid, true);\n");
      out.write("               ajax.send();\n");
      out.write("               \n");
      out.write("               ajax.onreadystatechange = function(){\n");
      out.write("                   if (this.readyState==4 && this.status==200)\n");
      out.write("                       x.innerHTML = this.responseText;\n");
      out.write("               };\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("                </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      ");
      com.beans.Reporter reporter = null;
      synchronized (session) {
        reporter = (com.beans.Reporter) _jspx_page_context.getAttribute("reporter", PageContext.SESSION_SCOPE);
        if (reporter == null){
          reporter = new com.beans.Reporter();
          _jspx_page_context.setAttribute("reporter", reporter, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
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
      out.write("          <div class=\"contact_area\">\n");
      out.write("            <h2>Join NewsFeed</h2>\n");
      out.write("            ");
 if (request.getParameter("submit")!=null){
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("reporter"), request);
      out.write("\n");
      out.write("                <form action=\"ReporterController?op=add\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <img src=\"\" style=\"width:200px;height: 200px\" border=\"2\" id=\"preview\" class=\"form-control\"/><br/>\n");
      out.write("                    <input type=\"file\" class=\"btn btn-success form-control\" name=\"iamge\" onchange=\"readURL(this,preview);\"/>\n");
      out.write("                    <br/>\n");
      out.write("                    <input type=\"submit\" value=\"Add to Database\"/>\n");
      out.write("                </form>\n");
      out.write("                ");

               }
      out.write("\n");
      out.write("            <form action=\"addrepoimage.jsp\"   method=\"post\" class=\"form\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                          \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Enter Name </td>\n");
      out.write("                                <td><input type=\"text\" name=\"name\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                            </tr> \n");
      out.write("                             <tr>\n");
      out.write("                                <td>Enter DOB </td>\n");
      out.write("                                <td><input type=\"date\" name=\"dob\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                            </tr> \n");
      out.write("                             <tr>\n");
      out.write("                                <td>Select Gender  </td>\n");
      out.write("                                <td><input type=\"radio\" name=\"gender\" value=\"Male\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.gender eq \"Male\" ? \"checked\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/> Male \n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"Female\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.gender eq \"Female\" ? \"checked\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/> Female \n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Enter Contact </td>\n");
      out.write("                                <td><input type=\"text\" name=\"contact\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                            </tr> \n");
      out.write("                            \n");
      out.write("                             <tr>\n");
      out.write("                                <td>Enter Email </td>\n");
      out.write("                                <td><input type=\"email\" name=\"email\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                            </tr> \n");
      out.write("                            \n");
      out.write("                           <tr>\n");
      out.write("                                <td>Enter Username </td>\n");
      out.write("                                <td><input type=\"text\" name=\"userid\" class=\"form-control\" onblur=\"checkUserid(this.value,sp1)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                  <span id=\"sp1\"> </span> \n");
      out.write("                            </tr> \n");
      out.write("                            \n");
      out.write("                             <tr>\n");
      out.write("                                <td>Enter Password </td>\n");
      out.write("                                <td><input type=\"password\" name=\"password\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                            </tr> \n");
      out.write("                           \n");
      out.write("                            <input type=\"hidden\" name=\"status\" value=\"Disable\"/>\n");
      out.write("                        </table>\n");
      out.write(" <center class=\"contact_form\">  <input type=\"submit\" value=\"Register\" id=\"submit\" name=\"submit\" ></center> \n");
      out.write("                    </form>  \n");
      out.write("                             \n");
      out.write("               \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar1.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  ");
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
