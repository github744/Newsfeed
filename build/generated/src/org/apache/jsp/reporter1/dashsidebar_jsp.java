package org.apache.jsp.reporter1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashsidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"sidebar\">\n");
      out.write("      <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"blue | green | orange | red\"\n");
      out.write("    -->\n");
      out.write("      <div class=\"sidebar-wrapper\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"simple-text logo-mini\">\n");
      out.write("            CT\n");
      out.write("          </a>\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"simple-text logo-normal\">\n");
      out.write("            Creative Tim\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"active \">\n");
      out.write("            <a href=\"./dashboard.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-chart-pie-36\"></i>\n");
      out.write("              <p>Dashboard</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          <li>\n");
      out.write("            <a href=\"./map.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-pin\"></i>\n");
      out.write("              <p>Maps</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./addnews.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-notes\"></i>\n");
      out.write("              <p>Add News</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./updatenews.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-align-center\"></i>\n");
      out.write("              <p>Update News</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./editprofile.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-single-02\"></i>\n");
      out.write("              <p>User Profile</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./Approved.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-bullet-list-67\"></i>\n");
      out.write("              <p>Approved List</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"./pending.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-coins\"></i>\n");
      out.write("              <p>Pending List</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("           <li>\n");
      out.write("            <a href=\"./rejected.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-chart-bar-32\"></i>\n");
      out.write("              <p>Rejected List</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("          <li class=\"active-pro\">\n");
      out.write("            <a href=\"./upgrade.jsp\">\n");
      out.write("              <i class=\"tim-icons icon-spaceship\"></i>\n");
      out.write("              <p>Upgrade to PRO</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>");
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
