<%@page import="com.beans.News"%>
<%@page import="com.daos.NewsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"import="java.sql.*"%>

<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
<head>
     <link rel="icon" type="image/png" href="assets/img/icons.png">
<title>NewsFeed | Single Page</title>
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
<!--[if lt IE 9]>
<script src="../assets/js/html5shiv.min.js"></script>
<script src="../assets/js/respond.min.js"></script>
<jsp:include page="base.jsp"></jsp:include>
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
          <div>
           
               <%
                                    int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
                                    NewsDao nd = new NewsDao();
                                    News news = nd.getById(id);
                                %>
            <h1 style="font-size:35px;font-family: Georgia, serif;font-weight:500;"><%=news.getTitle()%></h1>
            <div class="post_commentbox"> <a href="#"><i class="fa fa-user"></i>Wpfreeware</a> <span><i class="fa fa-calendar"></i><%= new java.util.Date()%></span>  </div>
            
            <div class="single_page_content"> <img class="img-center" src="<%=news.getImage()%>" alt="">
              <p><%=news.getDescription()%></p>
            
             
              
            </div>
            
          
          </div>
        </div>
      </div>
      
              <jsp:include page="sidebar.jsp"></jsp:include></div>
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