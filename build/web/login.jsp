
<%@page import="com.daos.EmailSender"%>
<%@page import="com.beans.Admin"%>
<%@page import="com.beans.Reporter"%>
<%@page import="com.daos.AdminDao"%>
<%@page import="com.daos.ReporterDao"%>
<!DOCTYPE html>
<html>
<head>
     <link rel="icon" type="image/png" href="assets/img/icons.png">
<title>NewsFeed | Login</title>
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
          <div class="contact_area">
            <h2>Login</h2>
              <%
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
    %>
         <form  method="post">
            
        <div class="form-group">
            <input type="text"  id="inputEmail" value="<%=userid%>" class="form-control" placeholder="Username*" required="required" name="userid">
        </div>
        <div class="form-group">
            <input type="password" id="inputPassword"  value="<%=password%>" class="form-control" placeholder="Password*" required="required" name="password"> 
        </div>
        <b>Select a role:</b>
          <div class="form-group">
           <input type="radio" name="role" value="Admin"<%if(role.contains("Admin"))out.println("checked");%>/> Admin &nbsp;
           <input type="radio" name="role" value="Reporter"<%if(role.contains("Reporter"))out.println("checked");%>/> Reporter
        </div>
        
       
        <div class="clearfix">
            <label class="pull-left checkbox-inline"><input type="checkbox" name="remember" value="remember"> Remember me</label>
            <a type="button"  href="Sendmail.jsp?userid=<%=userid%>&role=<%=role%>" class="pull-right">Forgot Password?</a>
        </div>  </br>
    
 <center class="contact_form">  <input type="submit" name="submit" value="Sign In" id="submit"></center> 
                    </form>                
            
              
            
          </div>
        </div>
      </div>
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
<%if(request.getParameter("submit")!=null){
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
           
           }%>
</body>
</html>