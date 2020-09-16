<%@page import="com.beans.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.NewsDao"%>

<%@page import="com.beans.Category"%>


<%@page import="com.daos.CategoryDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>

<html>
    <head>
        <title>NewsFeed</title>
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
        <script src="assets/js/html5shiv.min.js"></script>
        <script src="assets/js/respond.min.js"></script>
        <![endif]-->
        <jsp:include page="base.jsp"></jsp:include>
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
                                <div class="single_post_content">
                                     <% int catid = request.getParameter("cat_id")!=null? Integer.parseInt(request.getParameter("cat_id")):-1;
                                                            CategoryDao cd = new CategoryDao();
                                                              
                           
                           
                           Category cat=null;
                      
                        cat = cd.getById(catid);
                                                           
                                                 %>
                                    <h2><span>   <%=cat.getName()%></span></h2>
                                   <div class="content-wrapper">
          <div class="container">
            <div class="col-sm-12">
              <div class="card" data-aos="fade-up">
                  
                <div class="card-body">
               
                    <%  
                            NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                            if(catid!=-1)
                                newsList = nd.getNewsByCatId(catid);
                            else
                                newsList= nd.getAllNewsByStatus("approved");%>
                                
                                
                                <%
                                                for(News news : newsList){%>
                  <div class="row">
                    <div class="col-lg-8">
                    <div class="row">
                         
                               <div class="col-sm-4 grid-margin">
                          <div class="rotate-img">
                            <img
                              src="<%=news.getImage()%>"
                              alt="banner"
                              class="img-fluid" style="max-width: 100%; max-height:100%;"
                            />
                          </div>
                        </div>
                        <div class="col-sm-8 grid-margin">
                          <h3 class="font-weight-600 mb-2">
                            No charges over 2017 battle bus cases
                          </h3>
                          <p class="fs-13 text-muted mb-0">
                            <span class="mr-2">Photo </span>10 Minutes ago
                          </p>
                          <p class="fs-15">
                            Lorem Ipsum has been the industry's standard dummy
                            text ever since the 1500s, when an unknown printer
                            took a galley of type and scrambled it to make a
                            type specimen book.
                          </p>
                        </div>
                      </div>
                      
                    </div>
                  
                  </div><br/><%}%>
                </div>
              </div>
            </div>
          </div>
        </div>
                                    
                                </div>
                               
                           
                               
                            </div>
                        </div>
                                            <jsp:include page="sidebar.jsp"></jsp:include>
                                <div class="single_sidebar wow fadeInDown">
                                    <h2><span>Subscription</span></h2><br/>
                                    <ul>

                                        <form  method="post">

                                            <div class="form-group">
                                                <input type="text"  id="inputEmail" value="" class="form-control" placeholder="Name*" required="required" name="userid">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" id="inputPassword"  value="" class="form-control" placeholder="Email*" required="required" name="password"> 
                                            </div>





                                            <center class="contact_form">  <input type="submit" value="Join Now" id="submit"></center> 
                                        </form> 

                                    </ul>
                                </div>
                            </aside>
                        </div>
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