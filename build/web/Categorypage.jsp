<%@page import="com.beans.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.NewsDao"%>

<%@page import="com.beans.Category"%>


<%@page import="com.daos.CategoryDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>

<html>
    <head>
         <link rel="icon" type="image/png" href="assets/img/icons.png">
        <title>NewsFeed | Category</title>
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
                        <div class="col-lg-8">
                            <div class="left_content">
                                <div class="single_post_content">
                                     <% int catid = request.getParameter("cat_id")!=null? Integer.parseInt(request.getParameter("cat_id")):-1;
                                                            CategoryDao cd = new CategoryDao();
                                                              
                           
                           
                           Category cat=null;
                      
                        cat = cd.getById(catid);
                                                           
                                                 %>
                                    <h2><span>   <%=cat.getName()%></span></h2>
                                  <left>  <div class="content-wrapper">
                                       <div class="container">
            <div class="col-sm-12">
              <div class="card" data-aos="fade-up">
                  
                <div class="card-body">
               
                    <%  
                            NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                            if(catid!=-1)
                                newsList = nd.getNewsByCatId(catid,"Approved");
                            else
                                newsList= nd.getAllNewsByStatus("approved");%>
                                
                                
                                <%
                                                for(News news : newsList){%>
                  <div class="row">
                    <div class="col-lg-8">
                       
                         
                        <ul>
                           <li><div class="col-sm-4 grid-margin">
                          <div class="rotate-img">
                          <a href="detailnews.jsp?id=<%=news.getId()%>">  <img
                              src="<%=news.getImage()%>"
                              alt="banner"
                              class="img-fluid" style="max-height:109%; max-width:109%;"
                              /></a>
                          </div>
                                    </div>
                        
                        <div class="col-sm-7 grid-margin">
                          <a href="detailnews.jsp?id=<%=news.getId()%>"><h4 style="font-size:20px;font-family:Georgia, serif; font-weight:600;" >
                          <%=news.getTitle()%>
                              </h4></a>
                          <% String desc = news.getDescription().trim();%> 
                           <p class="fs-15">
                           <%= desc.length() > 100 ? desc.substring(0, 150) : desc%> <a href="detailnews.jsp?id=<%=news.getId()%>" >...See more
                              </p></a>
                        </div> </li> </ul> </div> </div>
                    
                         
                   
                   
                          <br/><%}%>
                     
                         
                              
                </div>
              </div>
            </div>
          </div>
                                      </div></left>
                                    
                                </div>
                               
                           
                               
                            </div>
                        </div>
                                            <jsp:include page="sidebar.jsp"></jsp:include>
                               
                            </aside>
                        </div>
            </section> <jsp:include page="footer.jsp"></jsp:include>
                    </div>
             
           
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