package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.EmailSender;
import com.beans.Admin;
import com.beans.Reporter;
import com.daos.AdminDao;
import com.daos.ReporterDao;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>NewsFeed | Login</title>\n");
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
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("  <section id=\"contentSection\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("        <div class=\"left_content\">\n");
      out.write("          <div class=\"contact_area\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("              ");

        Cookie cookies [] = request.getCookies();
        String userid="";
        String password="";
         String role="";
        
        for (Cookie c : cookies){
            if(c.getName().equals("userid"))
                userid= c.getValue();
            if (c.getName().equals("password"))
                password = c.getValue();
            if (c.getName().equals("role"))
                role = c.getValue();
        }
        
         
        
    String msg = request.getParameter("msg");
    if(msg!=null)
        out.println("<script>alert(\"" +msg+ "\")</script>");
     String msg1 = request.getParameter("msg1");
            if (msg1 != null) {
                out.print("<script>alert(\"" +msg1+ "\")</script>");
             
                
            }
    
      out.write("\n");
      out.write("         <form  method=\"post\">\n");
      out.write("            \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"text\"  id=\"inputEmail\" value=\"");
      out.print(userid);
      out.write("\" class=\"form-control\" placeholder=\"Username*\" required=\"required\" name=\"userid\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"password\" id=\"inputPassword\"  value=\"");
      out.print(password);
      out.write("\" class=\"form-control\" placeholder=\"Password*\" required=\"required\" name=\"password\"> \n");
      out.write("        </div>\n");
      out.write("        <b>Select a role:</b>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("           <input type=\"radio\" name=\"role\" value=\"Admin\"");
if(role.contains("Admin"))out.println("checked");
      out.write("/> Admin &nbsp;\n");
      out.write("           <input type=\"radio\" name=\"role\" value=\"Reporter\"");
if(role.contains("Reporter"))out.println("checked");
      out.write("/> Reporter\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"clearfix\">\n");
      out.write("            <label class=\"pull-left checkbox-inline\"><input type=\"checkbox\" name=\"remember\" value=\"remember\"> Remember me</label>\n");
      out.write("            <a type=\"button\"  href=\"Sendmail.jsp?userid=");
      out.print(userid);
      out.write("&role=");
      out.print(role);
      out.write("\" class=\"pull-right\">Forgot Password?</a>\n");
      out.write("        </div>  </br>\n");
      out.write("    \n");
      out.write(" <center class=\"contact_form\">  <input type=\"submit\" name=\"submit\" value=\"Sign In\" id=\"submit\"></center> \n");
      out.write("                    </form>                \n");
      out.write("            \n");
      out.write("              \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            ");
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
if(request.getParameter("submit")!=null){
           userid= request.getParameter("userid");
           password = request.getParameter("password");
            role = request.getParameter("role");
          String remember = request.getParameter("remember");
            if (remember!=null && remember.equalsIgnoreCase("remember")){
                Cookie c = new Cookie("userid", userid);
                Cookie c2 = new Cookie("password", password);
                Cookie c3 = new Cookie("role",role);
                c.setMaxAge(60*60*24);
                c2.setMaxAge(60*60*24);
                c3.setMaxAge(60*60*24);
                response.addCookie(c);
                response.addCookie(c2);
                response.addCookie(c3);
            }
            
           
        if(role==null){
            response.sendRedirect("login.jsp?msg=Please Select Any One Role");
            //return;
        }
        else if(role.equals("Admin")){
               AdminDao ad = new AdminDao();
               Admin admin = ad.getByLoginDetail(userid, password);
               System.out.println("Result : "+ admin);
               if(admin==null)
                   response.sendRedirect("login.jsp?msg=Invalid Username or Password");
               else {
                   session.setAttribute("admin", admin);
                   response.sendRedirect("examples/dashboard.jsp");
               }
           }
    else if (role.equals("Reporter")){
           ReporterDao rd = new ReporterDao();
           int id = rd.isValid(userid, password);
           if(id!=-1)
           {
               Reporter reporter = rd.getById(id);
               session.setAttribute("reporter", reporter);
               response.sendRedirect("reporter1/dashboard.jsp");
           }
           else 
               response.sendRedirect("login.jsp?msg=Invalid Username/Password or Not yet Approved"); 
           }
           
           }
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
