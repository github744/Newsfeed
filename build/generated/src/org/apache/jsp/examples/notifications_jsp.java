package org.apache.jsp.examples;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notifications_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/icons.png\">\n");
      out.write("  <title>\n");
      out.write("    Admin | Notifications\n");
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"\">\n");
      out.write("     ");

            if (session.getAttribute("admin") == null) {
                response.sendRedirect("../login.jsp");
                return;
            }
        
      out.write("     \n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dashsidebar.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      ");
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
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h4 class=\"card-title\">Notifications Style</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"alert alert-info\">\n");
      out.write("                  <span>This is a plain notification</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-info\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span>This is a notification with close button.</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-info alert-with-icon\" data-notify=\"container\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span data-notify=\"icon\" class=\"tim-icons icon-bell-55\"></span>\n");
      out.write("                  <span data-notify=\"message\">This is a notification with close button and icon.</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-info alert-with-icon\" data-notify=\"container\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span data-notify=\"icon\" class=\"tim-icons icon-bell-55\"></span>\n");
      out.write("                  <span data-notify=\"message\">This is a notification with close button and icon and have many lines. You can see that the icon and the close button are always vertically aligned. This is a beautiful notification. So you don't have to worry about the style.</span>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h4 class=\"card-title\">Notification states</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"alert alert-primary\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span><b> Primary - </b> This is a regular notification made with \".alert-primary\"</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-info\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span><b> Info - </b> This is a regular notification made with \".alert-info\"</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-success\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span><b> Success - </b> This is a regular notification made with \".alert-success\"</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-warning\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span><b> Warning - </b> This is a regular notification made with \".alert-warning\"</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"alert alert-danger\">\n");
      out.write("                  <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                  </button>\n");
      out.write("                  <span><b> Danger - </b> This is a regular notification made with \".alert-danger\"</span>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"places-buttons\">\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 ml-auto mr-auto text-center\">\n");
      out.write("                      <h4 class=\"card-title\">\n");
      out.write("                        Notifications Places\n");
      out.write("                        <p class=\"category\">Click to view notifications</p>\n");
      out.write("                      </h4>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 ml-auto mr-auto\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" onclick=\"demo.showNotification('top','left')\">Top Left</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" onclick=\"demo.showNotification('top','center')\">Top Center</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" onclick=\"demo.showNotification('top','right')\">Top Right</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 ml-auto mr-auto\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" onclick=\"demo.showNotification('bottom','left')\">Bottom Left</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" onclick=\"demo.showNotification('bottom','center')\">Bottom Center</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" onclick=\"demo.showNotification('bottom','right')\">Bottom Right</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dashfooter.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  ");
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
