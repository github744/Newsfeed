package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.daos.AdminDao;
import com.beans.Admin;

public final class AdminProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Profile</title>\n");
      out.write("  <link rel=\"icon\" type=\"image/ico\" href=\"../assest/images/icon.ico\" >\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("                .forget-pwd > a{\n");
      out.write("                    color: #dc3545;\n");
      out.write("                    font-weight: 500;\n");
      out.write("                }\n");
      out.write("                .forget-password .panel-default{\n");
      out.write("                    padding: 31%;\n");
      out.write("                    margin-top: -27%;\n");
      out.write("                }\n");
      out.write("                .forget-password .panel-body{\n");
      out.write("                    padding: 15%;\n");
      out.write("                    margin-bottom: -50%;\n");
      out.write("                    background: #fff;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    -webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("                }\n");
      out.write("                img{\n");
      out.write("                    width:40%;\n");
      out.write("                    margin-bottom:10%;\n");
      out.write("                }\n");
      out.write("                .btnForget{\n");
      out.write("                    background: #c0392b;\n");
      out.write("                    border:none;\n");
      out.write("                }\n");
      out.write("                .forget-password .dropdown{\n");
      out.write("                    width: 100%;\n");
      out.write("                    border: 1px solid #ced4da;\n");
      out.write("                    border-radius: .25rem;\n");
      out.write("                }\n");
      out.write("                .forget-password .dropdown button{\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("                .forget-password .dropdown ul{\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            </style>\n");
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
      out.write("          \n");
      out.write("\n");
      out.write("          <div class=\"container forget-password\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-md-offset-4\">\n");
      out.write("                    <div class=\"panel panel-default\" >\n");
      out.write("                        <div class=\"panel-body\" >\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <img src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"rounded-circle\" alt=\"car-key\" border=\"0\">\n");
      out.write("                                <h2 class=\"text-center\">Profile</h2>\n");
      out.write("                               \n");
      out.write("                                <form id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\"  >\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                         \n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope color-blue\"></i></span>\n");
      out.write("                                              <div class=\"row table-responsive\">\n");
      out.write("                                            <table>\n");
      out.write("                                            ");

                          AdminDao qd = new AdminDao();
                          ArrayList<Admin> adminList = qd.getAllRecords();
                          
                          for(Admin admin: adminList){
      out.write("\n");
      out.write("                  \n");
      out.write("                          <tr><td><b>Name:</b><td>");
      out.print(admin.getName());
      out.write("</td></tr>\n");
      out.write("                          <tr><td><b>Email:</b><td>");
      out.print(admin.getEmail());
      out.write("</td></tr>\n");
      out.write("                          <tr><td><b>Username:</b><td>");
      out.print(admin.getUserid());
      out.write("</td></tr>\n");
      out.write("                       \n");
      out.write("                     \n");
      out.write("                      \n");
      out.write("                       \n");
      out.write("                 \n");
      out.write("                          \n");
      out.write("                    ");
}
      out.write("</table></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                   \n");
      out.write("\n");
      out.write("\n");
      out.write("                                  \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
