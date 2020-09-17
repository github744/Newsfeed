package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.EmailSender;
import com.beans.Admin;
import com.beans.Reporter;
import com.daos.AdminDao;
import com.daos.ReporterDao;

public final class Sendmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <link rel=\"icon\" type=\"image/png\" href=\"assets/img/icons.png\">\n");
      out.write("<title>NewsFeed | Reset Password</title>\n");
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
      out.write("  <script type=\"text/javascript\">\n");
      out.write("                function comparepassword(x, y)\n");
      out.write("                {\n");
      out.write("                    //alert(x,y);\n");
      out.write("                    if (x === y)\n");
      out.write("                        return true;\n");
      out.write("\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        alert(\"Password And Confirm Password Are Not Same\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
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
      out.write("       <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("        <div class=\"left_content\">\n");
      out.write("          <div class=\"contact_area\"><br/>\n");
      out.write("                ");

                   
              String msg2 = request.getParameter("msg2");
    if(msg2!=null)
        out.println("<script>alert(\"" +msg2+ "\")</script>");
     String msg3 = request.getParameter("msg3");
            if (msg3 != null) 
                out.print("<script>alert(\"" +msg3+ "\")</script>");
                
            
            String userid = request.getParameter("userid");
            String role = request.getParameter("role");
            

        
      out.write("\n");
      out.write(" <div class=\"forget-password\" style=\"font-family:Georgia, serif;\">\n");
      out.write("            \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("     \n");
      out.write("                  <div  class=\"panel-body\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <img src=\"assets/img/car-key.png\" alt=\"car-key\" border=\"0\"><br/>\n");
      out.write("                                <h2><b style=\"font-family:Georgia, serif;\">Forgot Password?</b></h2>\n");
      out.write("                                <p style=\"font-size: 15px;font-weight: 800;\">Please Entered the Registered E-mail</p><br/>\n");
      out.write("                                <form id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\" onsubmit= \"return comparepassword(password.value, cpassword.value);\" >\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                       \n");
      out.write("                                         <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope color-blue\"></i></span>\n");
      out.write("                                             <input class=\"form-control\"  type=\"hidden\" name=\"userid\" value=\"");
      out.print(userid);
      out.write("\"/>\n");
      out.write("                                            <input class=\"form-control\"  type=\"hidden\" name=\"role\" value=\"");
      out.print(role);
      out.write("\"/>\n");
      out.write("                                            <input   id=\"forgetAnswer\" name=\"password\" id=\"password\"  pattern= \"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\" placeholder=\"Type New Password\" class=\"form-control\"  type=\"password\">\n");
      out.write("                                          </div> </div>   <div class=\"form-group\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope color-blue\"></i></span>\n");
      out.write("                                               <input  id=\"forgetAnswer\" name=\"cpassword\" id=\"cpassword\" placeholder=\"Type Confirm Password\" class=\"form-control\"  type=\"password\">\n");
      out.write("                                        </div></div>\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <center class=\"contact_form\">   <input  class=\"btn btn-primary  btn-block btnForget\" value=\"Reset Password\" type=\"submit\" name=\"submit\"></center>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                   \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                  </div></div></div>\n");
      out.write("                 \n");
      out.write("              \n");
      out.write("                 \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        </div></div></div>\n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar1.jsp", out, false);
      out.write("\n");
      out.write("  </div>\n");
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
      out.write("  ");
 if (request.getParameter("submit") != null) {
                userid = request.getParameter("userid");
                String password = request.getParameter("password");
                role = request.getParameter("role");
                if (role.equals("Admin")) {
                    AdminDao ad = new AdminDao();
                    Admin admin = ad.ChangePassword(password, userid);
                    response.sendRedirect("login.jsp?msg1= Admin Password Changed Successfully!!");
                } else {
                    ReporterDao rd = new ReporterDao();
                    Reporter reporter = rd.ChangePassword(password, userid);
                    response.sendRedirect("login.jsp?msg1=Reporter Password Changed Successfully!!");
                }
            }
      out.write("\n");
      out.write("\n");
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
