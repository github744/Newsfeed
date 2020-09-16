package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Admin;
import com.daos.AdminDao;

public final class AdminChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>admin</title>\n");
      out.write("  <link rel=\"icon\" type=\"image/ico\" href=\"../assest/images/icon.ico\" >\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    ");

        if (session.getAttribute("admin")==null){
            response.sendRedirect("../login.jsp");
            return;
        }
        
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("    <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Topbar -->\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("         \n");
      out.write("         <div class=\"modal-dialog\"style=\"width:700px;\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("      \n");
      out.write("        <!-- Modal Header -->\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h4 class=\"modal-title\">Fill the Details</h4>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("          ");
      com.beans.Admin admin = null;
      synchronized (session) {
        admin = (com.beans.Admin) _jspx_page_context.getAttribute("admin", PageContext.SESSION_SCOPE);
        if (admin == null){
          admin = new com.beans.Admin();
          _jspx_page_context.setAttribute("admin", admin, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <!-- Modal body -->\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("           <form method=\"post\" class=\"form bg-light\" onsubmit= \"return comparepassword(password1.value,cpassword.value); \">\n");
      out.write("                       \n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Old password\" name=\"password\" class=\"form-control\"> <br/>\n");
      out.write("                        <input type=\"password\" name=\"password1\" id=\"password1\" placeholder=\"Enter New Password\" pattern= \"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\" class=\"form-control\"/> <br/>\n");
      out.write("                         <input type=\"password\" name=\"cpassword\" id=\"cpassword\" placeholder=\"Enter Confirm Password\" class=\"form-control\"/> <br/>\n");
      out.write("                        <input type=\"submit\" value=\"Change Password\" class=\"btn btn-dark form-control\" name=\"submit\"/>\n");
      out.write("         </form>\n");
      out.write("            ");
if(request.getParameter("submit")!=null) {
     int id = Integer.parseInt(request.getParameter("id"));
    
     String password1= request.getParameter("password1");
     AdminDao rd = new AdminDao();
     admin = rd.ChangePassword(password1,id);
     out.println("<font color='green'><h2>Password Changed Successfully!!</h2></font>");
     
     
     
     
 }
      out.write("\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        \n");
      out.write("      </div>           \n");
      out.write("    </div>        \n");
      out.write("           \n");
      out.write("         \n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \n");
      out.write("      </div>\n");
      out.write("      <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("   \n");
      out.write("      <!-- End of Footer -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <!-- Endof Page Wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button-->\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Logout Modal-->\n");
      out.write("  <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("          <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">×</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("          <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("  <!-- Bootstrap core JavaScript-->\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("\n");
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
