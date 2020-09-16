package org.apache.jsp.examples;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.AdminDao;
import com.beans.Admin;

public final class Changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\n");
      out.write("=========================================================\n");
      out.write("* * Black Dashboard - v1.0.1\n");
      out.write("=========================================================\n");
      out.write("\n");
      out.write("* Product Page: https://www.creative-tim.com/product/black-dashboard\n");
      out.write("* Copyright 2019 Creative Tim (https://www.creative-tim.com)\n");
      out.write("\n");
      out.write("\n");
      out.write("* Coded by Creative Tim\n");
      out.write("\n");
      out.write("=========================================================\n");
      out.write("\n");
      out.write("* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.png\">\n");
      out.write("  <title>\n");
      out.write("    Black Dashboard by Creative Tim\n");
      out.write("  </title>\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Nucleo Icons -->\n");
      out.write("  <link href=\"../assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"../assets/css/black-dashboard.css?v=1.0.0\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"../assets/demo/demo.css\" rel=\"stylesheet\" />");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("             function comparepassword(x,y)\n");
      out.write("             {\n");
      out.write("                 //alert(x,y);\n");
      out.write("                 if(x===y)\n");
      out.write("                   return true;\n");
      out.write("                  \n");
      out.write("                 else\n");
      out.write("                 {\n");
      out.write("                     alert(\"password and confirm password are not same\");\n");
      out.write("                     return false;\n");
      out.write("                 }\n");
      out.write("             }</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"\">\n");
      out.write("    ");

        if (session.getAttribute("admin")==null){
            response.sendRedirect("../login.jsp");
            return;
        }
        
      out.write("\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dashsidebar.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dashnav.jsp", out, false);
      out.write("\n");
      out.write("      <div class=\"modal modal-search fade\" id=\"searchModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"searchModal\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inlineFormInputGroup\" placeholder=\"SEARCH\">\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h5 class=\"title\" style=\"font-size:20px;\">Edit Profile</h5>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                    ");
      com.beans.Admin admin = null;
      synchronized (session) {
        admin = (com.beans.Admin) _jspx_page_context.getAttribute("admin", PageContext.SESSION_SCOPE);
        if (admin == null){
          admin = new com.beans.Admin();
          _jspx_page_context.setAttribute("admin", admin, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("               \n");
      out.write("                 \n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-10 pr-md-1\">\n");
      out.write("                       <form    method=\"post\" class=\"form\">\n");
      out.write("                                            <table class=\"table\"  >\n");
      out.write("                                               \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>Old Password</td>\n");
      out.write("                                                    <td> <input type=\"text\" placeholder=\"Enter Old password\" name=\"password\" class=\"form-control\"> </td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                 <tr>\n");
      out.write("                                                    <td>New Password</td>\n");
      out.write("                                                    <td> <input type=\"password\" name=\"password1\" id=\"password1\" placeholder=\"Enter New Password\" pattern= \"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\" class=\"form-control\"/></td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                 <tr>\n");
      out.write("                                                    <td>Confirm Password</td>\n");
      out.write("                                                    <td><input type=\"password\" name=\"cpassword\" id=\"cpassword\" placeholder=\"Enter Confirm Password\" class=\"form-control\"/></td>\n");
      out.write("                                                </tr> \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                 \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </table>\n");
      out.write("                                                <center> <input type=\"submit\" value=\"Next\" name=\"submit\" id =\"submit\" class=\" btn btn-primary\"/></center>\n");
      out.write("                                        </form>\n");
      out.write("                           ");
if(request.getParameter("submit")!=null) {
     int id = Integer.parseInt(request.getParameter("id"));
    
     String password1= request.getParameter("password1");
     AdminDao rd = new AdminDao();
     admin = rd.ChangePassword(password1,id);
     out.println("<font color='green'><h2>Password Changed Successfully!!</h2></font>");
     
     
     
     
 }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                 \n");
      out.write("                                          \n");
      out.write("               \n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <div class=\"card card-user\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <p class=\"card-text\">\n");
      out.write("                  <div class=\"author\">\n");
      out.write("                    <div class=\"block block-one\"></div>\n");
      out.write("                    <div class=\"block block-two\"></div>\n");
      out.write("                    <div class=\"block block-three\"></div>\n");
      out.write("                    <div class=\"block block-four\"></div>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                      <img class=\"avatar\" src=\"../assets/img/emilyz.jpg\" alt=\"...\">\n");
      out.write("                      <h5 class=\"title\">Mike Andrew</h5>\n");
      out.write("                    </a>\n");
      out.write("                    <p class=\"description\">\n");
      out.write("                      Ceo/Co-Founder\n");
      out.write("                    </p>\n");
      out.write("                  </div>\n");
      out.write("                </p>\n");
      out.write("                <div class=\"card-description\">\n");
      out.write("                  Do not be scared of the truth because we need to restart the human foundation in truth And I love you like Kanye loves Kanye I love Rick Owens’ bed design but the back is...\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <div class=\"button-container\">\n");
      out.write("                  <button href=\"javascript:void(0)\" class=\"btn btn-icon btn-round btn-facebook\">\n");
      out.write("                    <i class=\"fab fa-facebook\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <button href=\"javascript:void(0)\" class=\"btn btn-icon btn-round btn-twitter\">\n");
      out.write("                    <i class=\"fab fa-twitter\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <button href=\"javascript:void(0)\" class=\"btn btn-icon btn-round btn-google\">\n");
      out.write("                    <i class=\"fab fa-google-plus\"></i>\n");
      out.write("                  </button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dashfooter.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Mode.jsp", out, false);
      out.write("\n");
      out.write("  <!--   Core JS Files   -->\n");
      out.write("  <script src=\"../assets/js/core/jquery.min.js\"></script>\n");
      out.write("  <script src=\"../assets/js/core/popper.min.js\"></script>\n");
      out.write("  <script src=\"../assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"../assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <!--  Google Maps Plugin    -->\n");
      out.write("  <!-- Place this tag in your head or just before your close body tag. -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("  <!-- Chart JS -->\n");
      out.write("  <script src=\"../assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("  <!--  Notifications Plugin    -->\n");
      out.write("  <script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("  <!-- Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("  <script src=\"../assets/js/black-dashboard.min.js?v=1.0.0\"></script><!-- Black Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("  <script src=\"../assets/demo/demo.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $().ready(function() {\n");
      out.write("        $sidebar = $('.sidebar');\n");
      out.write("        $navbar = $('.navbar');\n");
      out.write("        $main_panel = $('.main-panel');\n");
      out.write("\n");
      out.write("        $full_page = $('.full-page');\n");
      out.write("\n");
      out.write("        $sidebar_responsive = $('body > .navbar-collapse');\n");
      out.write("        sidebar_mini_active = true;\n");
      out.write("        white_color = false;\n");
      out.write("\n");
      out.write("        window_width = $(window).width();\n");
      out.write("\n");
      out.write("        fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        $('.fixed-plugin a').click(function(event) {\n");
      out.write("          if ($(this).hasClass('switch-trigger')) {\n");
      out.write("            if (event.stopPropagation) {\n");
      out.write("              event.stopPropagation();\n");
      out.write("            } else if (window.event) {\n");
      out.write("              window.event.cancelBubble = true;\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.fixed-plugin .background-color span').click(function() {\n");
      out.write("          $(this).siblings().removeClass('active');\n");
      out.write("          $(this).addClass('active');\n");
      out.write("\n");
      out.write("          var new_color = $(this).data('color');\n");
      out.write("\n");
      out.write("          if ($sidebar.length != 0) {\n");
      out.write("            $sidebar.attr('data', new_color);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($main_panel.length != 0) {\n");
      out.write("            $main_panel.attr('data', new_color);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($full_page.length != 0) {\n");
      out.write("            $full_page.attr('filter-color', new_color);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($sidebar_responsive.length != 0) {\n");
      out.write("            $sidebar_responsive.attr('data', new_color);\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.switch-sidebar-mini input').on(\"switchChange.bootstrapSwitch\", function() {\n");
      out.write("          var $btn = $(this);\n");
      out.write("\n");
      out.write("          if (sidebar_mini_active == true) {\n");
      out.write("            $('body').removeClass('sidebar-mini');\n");
      out.write("            sidebar_mini_active = false;\n");
      out.write("            blackDashboard.showSidebarMessage('Sidebar mini deactivated...');\n");
      out.write("          } else {\n");
      out.write("            $('body').addClass('sidebar-mini');\n");
      out.write("            sidebar_mini_active = true;\n");
      out.write("            blackDashboard.showSidebarMessage('Sidebar mini activated...');\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          // we simulate the window Resize so the charts will get updated in realtime.\n");
      out.write("          var simulateWindowResize = setInterval(function() {\n");
      out.write("            window.dispatchEvent(new Event('resize'));\n");
      out.write("          }, 180);\n");
      out.write("\n");
      out.write("          // we stop the simulation of Window Resize after the animations are completed\n");
      out.write("          setTimeout(function() {\n");
      out.write("            clearInterval(simulateWindowResize);\n");
      out.write("          }, 1000);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.switch-change-color input').on(\"switchChange.bootstrapSwitch\", function() {\n");
      out.write("          var $btn = $(this);\n");
      out.write("\n");
      out.write("          if (white_color == true) {\n");
      out.write("\n");
      out.write("            $('body').addClass('change-background');\n");
      out.write("            setTimeout(function() {\n");
      out.write("              $('body').removeClass('change-background');\n");
      out.write("              $('body').removeClass('white-content');\n");
      out.write("            }, 900);\n");
      out.write("            white_color = false;\n");
      out.write("          } else {\n");
      out.write("\n");
      out.write("            $('body').addClass('change-background');\n");
      out.write("            setTimeout(function() {\n");
      out.write("              $('body').removeClass('change-background');\n");
      out.write("              $('body').addClass('white-content');\n");
      out.write("            }, 900);\n");
      out.write("\n");
      out.write("            white_color = true;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.light-badge').click(function() {\n");
      out.write("          $('body').addClass('white-content');\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.dark-badge').click(function() {\n");
      out.write("          $('body').removeClass('white-content');\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("  <script src=\"https://cdn.trackjs.com/agent/v3/latest/t.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    window.TrackJS &&\n");
      out.write("      TrackJS.install({\n");
      out.write("        token: \"ee6fab19c5a04ac1a32a645abde4613a\",\n");
      out.write("        application: \"black-dashboard-free\"\n");
      out.write("      });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
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
