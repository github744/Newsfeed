
<%@page import="com.daos.EmailSender"%>
<%@page import="com.beans.Admin"%>
<%@page import="com.beans.Reporter"%>
<%@page import="com.daos.AdminDao"%>
<%@page import="com.daos.ReporterDao"%>
<!DOCTYPE html>
<html>
<head>
     <link rel="icon" type="image/png" href="assets/img/icons.png">
<title>NewsFeed | Reset Password</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/animate.css">
<link rel="stylesheet" type="text/css" href="assets/css/font.css">
<link rel="stylesheet" type="text/css" href="assets/css/li-scroller.css">
<link rel="stylesheet" type="text/css" href="assets/css/slick.css">
<link rel="stylesheet" type="text/css" href="assets/css/jquery.fancybox.css">
<link rel="stylesheet" type="text/css" href="assets/css/theme.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<jsp:include page="base.jsp"></jsp:include>
<!--[if lt IE 9]>
<script src="../assets/js/html5shiv.min.js"></script>
<script src="../assets/js/respond.min.js"></script>
<![endif]-->
  <script type="text/javascript">
                function comparepassword(x, y)
                {
                    //alert(x,y);
                    if (x === y)
                        return true;

                    else
                    {
                        alert("Password And Confirm Password Are Not Same");
                        return false;
                    }
                }
            </script>
</head>
<body>
<div id="preloader">
  <div id="status">&nbsp;</div>
</div>
<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
<div class="container">
 <jsp:include page="navbar.jsp"></jsp:include>
  <section id="contentSection">
       <div class="row">
      <div class="col-lg-8 col-md-8 col-sm-8">
        <div class="left_content">
          <div class="contact_area"><br/>
                <%
                   
            
                
            
            String userid = request.getParameter("userid");
            String role = request.getParameter("role");
            

        %>
 <div class="forget-password" style="font-family:Georgia, serif;">
            
                    <div class="panel panel-default">
     
                  <div  class="panel-body">
                            <div class="text-center">
                                <img src="assets/img/car-key.png" alt="car-key" border="0"><br/>
                                <h2><b style="font-family:Georgia, serif;">Forgot Password?</b></h2>
                                <p style="font-size: 15px;font-weight: 800;">Please Entered the Registered E-mail</p><br/>
                                <form id="register-form" role="form" autocomplete="off" class="form" method="post" onsubmit= "return comparepassword(password.value, cpassword.value);" >
                                    <div class="form-group">
                                       
                                         <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                             <input class="form-control"  type="hidden" name="userid" value="<%=userid%>"/>
                                            <input class="form-control"  type="hidden" name="role" value="<%=role%>"/>
                                            <input   name="email"   placeholder="Enter your email" class="form-control"  type="text">
                                          </div> </div>   
                                    

                                    <div class="form-group">
                                        <center class="contact_form">   <input  class="btn btn-primary  btn-block btnForget" value="Send Verification Link" type="submit" name="submit"></center>
                                    </div>
                    <div class="form-group">
                                         <%
            if (request.getParameter("submit") != null) {
                userid = request.getParameter("userid");
                role = request.getParameter("role");
                String email = request.getParameter("email");
                if (role.equalsIgnoreCase("admin")) {
                    AdminDao ad = new AdminDao();
                    if (ad.validateEmail(userid, email)) {

                    } else {
                        out.println("<script>alert('Please provide Registered email');</script>");
                        return;
                    }
                }  if (role.equalsIgnoreCase("reporter")) {
                     ReporterDao ad = new ReporterDao();
                    if (ad.validateEmail(userid, email)) {

                    } else {
                        out.println("<script>alert('Please provide Registered email');</script>");
                        return;
                    }

                }
                String host;
                String port;
                String user;
                String pass;
                //reads SMTP server setting from web.xml file 
                ServletContext context = config.getServletContext();
                host = context.getInitParameter("host");
                port = context.getInitParameter("port");
                user = context.getInitParameter("user");
                pass = context.getInitParameter("pass");

                String recipients[] = request.getParameter("email").split(",");
                String subject = "Click the link to reset the password";
                String message = "click on http://localhost:8080/Newsfeed/resetpassword.jsp?userid=" + userid + "&role=" + role;

                String resultMessage = "";

                try {
                    EmailSender.sendEmail(host, port, user, pass, recipients, subject, message);
                    resultMessage = "The e-mail was sent successfully";
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultMessage = "There were an error: " + ex.getMessage();
                } finally {
                    out.println("<b> " + resultMessage + "</b>");
                }

            }
        %>
                                    
                                    </div>

                                   
                                </form>
                            </div>
                  </div></div></div>
                 
              
                 
           
        
        </div></div></div>
           <jsp:include page="sidebar1.jsp"></jsp:include>
  </div>
  </section>
  <jsp:include page="footer.jsp"></jsp:include>
</div>
<script src="assets/js/jquery.min.js"></script> 
<script src="assets/js/wow.min.js"></script> 
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/slick.min.js"></script> 
<script src="assets/js/jquery.li-scroller.1.0.js"></script> 
<script src="assets/js/jquery.newsTicker.min.js"></script> 
<script src="assets/js/jquery.fancybox.pack.js"></script> 
<script src="assets/js/custom.js"></script>
  
</body>
</html>