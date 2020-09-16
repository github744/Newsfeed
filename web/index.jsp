<%@page import="com.beans.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.NewsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>

<html>
    <head>
         <link rel="icon" type="image/png" href="assets/img/icons.png">
        <title>NewsFeed | Home</title>
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
            

                <section id="sliderSection">
                    <div class="row">
                        <div class="col-lg-8 col-md-8 col-sm-8">
                            <div class="slick_slider">
                                <%
                           
                            NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                           
                                newsList = nd.getNewsByCatId(1,"Approved");
                           
                                
                         for(News news : newsList){%>
                         <div class="single_iteam"> <a href="detailnews.jsp?id=<%=news.getId()%>"> <img src="<%=news.getImage()%>" alt=""></a>
                                    <div class="slider_article">
                                        <h2><a class="slider_tittle" href="detailnews.jsp?id=<%=news.getId()%>"><%=news.getTitle()%></a></h2>
                                       
                                    </div>
                                </div>
                                <%}%>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-4">
                            <div class="latest_post">
                                <h2><span>Latest post</span></h2>
                                <div class="latest_post_container">
                                    <div id="prev-button"><i class="fa fa-chevron-up"></i></div>
                                    <ul class="latest_postnav">
                                  <%
                           
                           
                           
                                newsList = nd.getNewsByCatIdLimit(1,"Approved",5);
                           
                                
                         for(News news : newsList){%>
                                        <li>
                                            <div class="media"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="media-left"> <img src="<%=news.getImage()%>" alt=""> </a>
                                                <div class="media-body"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="catg_title"><b><%=news.getTitle()%></b> </a> </div>
                                            </div>
                                        </li>
                                        <%}%>
                                    </ul>
                                    <div id="next-button"><i class="fa  fa-chevron-down"></i></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <section id="contentSection">
                    <div class="row">
                        <div class="col-lg-8 col-md-8 col-sm-8">
                            <div class="left_content">
                                <div class="single_post_content">
                                    <h2><span>Business</span></h2>
                                    <div class="single_post_content_left">
                                        <ul class="business_catgnav  wow fadeInDown">
                                             <% newsList = nd.getNewsByCatIdLimit(4,"Approved",1);
                                                for(News news : newsList){%>
                                            <li>
                                                <figure class="bsbig_fig"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="featured_img"> <img alt="" src="<%=news.getImage()%>"> <span class="overlay"></span> </a>
                                                    <figcaption> <a href="detailnews.jsp?id=<%=news.getId()%>"><%=news.getTitle()%></a> </figcaption>
                                                   <% String desc = news.getDescription().trim();%>  <p><%= desc.length() > 100 ? desc.substring(0, 200) : desc%> ...</p>
                                                </figure>
                                            </li><%}%>
                                        </ul>
                                    </div>
                                    <div class="single_post_content_right">
                                        <ul class="spost_nav">
                                             <%
                           
                           
                           
                                newsList = nd.getNewsByCatId(4,"Approved");
                           
                                
                         for(News news : newsList){%>
                                            <li>
                                                <div class="media wow fadeInDown"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="media-left"><img src="<%=news.getImage()%>" alt=""> </a>
                                                    <div class="media-body"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="catg_title"><%=news.getTitle()%> </a> </div>
                                                </div>
                                            </li>
                                         <%}%>
                                        </ul>
                                    </div>
                                </div>
                                <div class="fashion_technology_area">
                                    <div class="fashion">
                                        <div class="single_post_content">
                                            <h2><span>Entertainment</span></h2>
                                            <ul class="business_catgnav wow fadeInDown">
                                                 <% newsList = nd.getNewsByCatIdLimit(10,"Approved",1);
                                                for(News news : newsList){%>
                                                <li>
                                                    <figure class="bsbig_fig"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="featured_img"> <img alt="" src="<%=news.getImage()%>"> <span class="overlay"></span> </a>
                                                        <figcaption> <a href="detailnews.jsp?id=<%=news.getId()%>"><%=news.getTitle()%></a> </figcaption>
                                                         <% String desc = news.getDescription().trim();%>      <p><%= desc.length() > 100 ? desc.substring(0, 150) : desc%> ......</p>
                                                    </figure>
                                                </li><%}%>
                                            </ul>
                                            <ul class="spost_nav">
                                                <%
                           
                           
                           
                                newsList = nd.getNewsByCatId(10,"Approved");
                           
                                
                         for(News news : newsList){%>
                                                <li>
                                                    <div class="media wow fadeInDown"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="media-left"> <img alt="" src="<%=news.getImage()%>"> </a>
                                                        <div class="media-body"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="catg_title"><%=news.getTitle()%></a> </div>
                                                    </div>
                                                </li>
                                                <%}%>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="technology">
                                        <div class="single_post_content">
                                            <h2><span>Technology</span></h2>
                                            <ul class="business_catgnav">
                                                 <% newsList = nd.getNewsByCatIdLimit(3,"Approved",1);
                                                for(News news : newsList){%>
                                                <li>
                                                    <figure class="bsbig_fig wow fadeInDown"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="featured_img"> <img alt="" src="<%=news.getImage()%>"> <span class="overlay"></span> </a>
                                                        <figcaption> <a href="detailnews.jsp?id=<%=news.getId()%>"><%=news.getTitle()%></a> </figcaption>
                                                     <% String desc = news.getDescription().trim();%>      <p><%= desc.length() > 100 ? desc.substring(0, 200) : desc%> ......</p>
                                                    </figure>
                                                </li><%}%>
                                            </ul>
                                            <ul class="spost_nav">
                                                <%
                           
                           
                           
                                newsList = nd.getNewsByCatId(3,"Approved");
                           
                                
                         for(News news : newsList){%>
                                                <li>
                                                    <div class="media wow fadeInDown"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="media-left"> <img alt="" src="<%=news.getImage()%>"> </a>
                                                        <div class="media-body"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="catg_title"> <%=news.getTitle()%></a> </div>
                                                    </div>
                                                </li>
                                               <%}%>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="single_post_content">
                                    <h2><span>Photography</span></h2>
                                    <ul class="photograph_nav  wow fadeInDown">
                                          <%
                           
                          
                               newsList = nd.getNewsByLimit("Approved",0, 6);
                           
                                
                         for(News news : newsList){%>
                                        <li>
                                            <div class="photo_grid">
                                                <figure class="effect-layla"> <a class="fancybox-buttons" data-fancybox-group="button" href="<%=news.getImage()%>" title="<%=news.getTitle()%>"> <img src="<%=news.getImage()%>" alt=""/></a> </figure>
                                            </div>
                                        </li><%}%>
                                        
                                    </ul>
                                </div>
                                <div class="single_post_content">
                                    <h2><span>Games</span></h2>
                                    <div class="single_post_content_left">
                                        <ul class="business_catgnav">
                                              <% newsList = nd.getNewsByCatIdLimit(11,"Approved",1);
                                                for(News news : newsList){%>
                                            <li>
                                                <figure class="bsbig_fig  wow fadeInDown"> <a class="featured_img" href="detailnews.jsp?id=<%=news.getId()%>"> <img src="<%=news.getImage()%>" alt=""> <span class="overlay"></span> </a>
                                                    <figcaption> <a href="detailnews.jsp?id=<%=news.getId()%>"><%=news.getTitle()%></a> </figcaption>
                                                 <% String desc = news.getDescription().trim();%>   <p><%= desc.length() > 100 ? desc.substring(0, 200) : desc%>...</p>
                                                </figure>
                                            </li><%}%>
                                        </ul>
                                    </div>
                                    <div class="single_post_content_right">
                                        <ul class="spost_nav">
                                            <%
                           
                           
                           
                                newsList = nd.getNewsByCatId(11,"Approved");
                           
                                
                         for(News news : newsList){%>
                                            <li>
                                                <div class="media wow fadeInDown"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="media-left"> <img alt="" src="<%=news.getImage()%>"> </a>
                                                    <div class="media-body"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="catg_title"> <%=news.getTitle()%></a> </div>
                                                </div>
                                            </li>
                                            <%}%>
                                        </ul>
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
                                                <input type="text"   class="form-control" placeholder="Name*" required="required" name="name">
                                            </div>
                                            <div class="form-group">
                                                <input type="email"  class="form-control" placeholder="Email*" required="required" name="email"> 
                                            </div>





                                            <center class="contact_form">  <input type="submit" value="Join Now" id="submit" name="submit"></center> 
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
                   
<%if(request.getParameter("submit")!=null){%>
<jsp:useBean id="subscriber" class="com.beans.Subscriber"></jsp:useBean>
<jsp:setProperty name="subscriber" property="*"></jsp:setProperty>

<%
Connection con = null;
PreparedStatement smt=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","5050");
    String sql = "Insert into subscribers (name,email) values(?,?)";
    smt = con.prepareStatement(sql);
    smt.setString(1, subscriber.getName());
    smt.setString(2, subscriber.getEmail());
    int n =smt.executeUpdate();
    con.close();
    smt.close();
    if(n>0)
        out.println("<script>alert('Thanks for subscription !');</script>");
}catch(Exception e){
    if(e.getMessage().contains("Duplicate"))
        out.println("<script>alert('You Have Already Subscribed this Channel !!!');</script>");
    System.out.println("Error : "+ e.getMessage()); 
}
}
%>
</html>