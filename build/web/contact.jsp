<%@page import="com.daos.QueryDao"%>
<%@page import="com.beans.Query"%>
<!DOCTYPE html>
<html>
<head>
     <link rel="icon" type="image/png" href="assets/img/icons.png">
<title>NewsFeed | Contact</title>
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
            <h2>Contact Us</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labolore magna aliqua. Ut enim ad minim veniam. Lorem ipsum dosectetur adipisicing elit, sed do.Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
            <form action="#" class="contact_form">
              <input class="form-control" type="text" name="name" placeholder="Name*">
              <input class="form-control" type="email" name="email" placeholder="Email*">
               <input class="form-control" type="text" name="contact" placeholder="Contact*">
              <textarea class="form-control" name="message" cols="30" rows="10" placeholder="Message*"></textarea>
              <input type="submit" name="btnSubmit" value="Send Message">
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
</body>
 <jsp:useBean id="query" class="com.beans.Query" scope="page"></jsp:useBean>
        <jsp:setProperty name="query" property="*"></jsp:setProperty>
       
    <%
        if(request.getParameter("btnSubmit")!=null ){
           QueryDao qd = new QueryDao();
           if (qd.add(query)) {
                        
                        response.sendRedirect(request.getHeader("referer"));
                    }}
    %>
        
</html>