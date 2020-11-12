 <%@page import="com.beans.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.NewsDao"%>
<%@page import="com.daos.FeedbackDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<jsp:include page="base.jsp"></jsp:include>
<div class="col-lg-4 col-md-4 col-sm-4">
                            <aside class="right_content">
                                <div class="single_sidebar">
                                    <h2><span>Popular Post</span></h2>
                                    <ul class="spost_nav">
                                      <%
                           
                             NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                           
                                newsList = nd.getNewsByCatIdLimit(2,"Approved",5);
                           
                                
                         for(News news : newsList){%>    
                                        <li>
                                            <div class="media wow fadeInDown"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="media-left"> <img src="<%=news.getImage()%>" alt=""> </a>
                                                <div class="media-body"> <a href="detailnews.jsp?id=<%=news.getId()%>" class="catg_title"><%=news.getTitle()%></a> </div>
                                            </div>
                                        </li>
                                        <%}%>
                                    </ul>
                                </div>
                                <div class="single_sidebar">
                                    <ul class="nav nav-tabs" role="tablist">
                                        <li role="presentation" class="active"><a href="#category" aria-controls="home" role="tab" data-toggle="tab">Category</a></li>
                                        <li role="presentation"><a href="#video" aria-controls="profile" role="tab" data-toggle="tab">Video</a></li>
                                        <li role="presentation"><a href="#comments" aria-controls="messages" role="tab" data-toggle="tab">Feedback</a></li>
                                    </ul>
                                    <div class="tab-content">
                                        <div role="tabpanel" class="tab-pane active" id="category">
                                            <ul>
                                                <li class="cat-item"><a href="Categorypage.jsp?cat_id=9">Sports</a></li>
                                                <li class="cat-item"><a href="Categorypage.jsp?cat_id=7">Entertainment</a></li>
                                                <li class="cat-item"><a href="Categorypage.jsp?cat_id=4">Business</a></li>
                                                  <li class="cat-item"><a href="Categorypage.jsp?cat_id=5">Education</a></li>
                                                <li class="cat-item"><a href="Categorypage.jsp?cat_id=3">Technology</a></li>
                                                
                                                <li class="cat-item"><a href="Categorypage.jsp?cat_id=6">Life &amp; Style</a></li>

                                            </ul>
                                        </div>
                                        <div role="tabpanel" class="tab-pane" id="video">
                                            <div class="vide_area">
                                                <iframe width="100%" height="250"  src="https://www.youtube.com/embed/xsPKfSIiLV4" frameborder="0" allowfullscreen></iframe>
                                            </div>
                                        </div>
                                        <div role="tabpanel" class="tab-pane" id="comments">
                                           <form  method="post" class="contact_form">
              <input class="form-control" type="text" name="name" placeholder="Name*">
          <textarea class="form-control" name="message" cols="30" rows="10" placeholder="Message*"></textarea>
   <input type="submit" name="submit1" id="submit1"  value="Send Feedback">
            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="single_sidebar wow fadeInDown">
                                    <h2><span>Sponsor</span></h2>
                                    <a class="sideAdd" href="#"><img src="images/add_img.jpg" alt=""></a> </div>

                                <div class="single_sidebar wow fadeInDown">
                                    <h2><span>Links</span></h2>
                                    <ul>
                                        <li><a href="404.jsp"><i class="fa fa-globe" aria-hidden="true"></i>&nbsp;Blog</a></li>

                                        <li><a href="login.jsp"><i class="fa fa-sign-in" aria-hidden="true"></i>&nbsp;Login</a></li>
                                        <li><a href="Register.jsp"><i class="fa fa-user-circle-o" aria-hidden="true"></i>&nbsp;Register</a></li><br/>


                                    </ul>
                                    
                                </div>
                              
       
    <%
        
        if(request.getParameter("submit1")!=null ){%>
             <jsp:useBean id="feedback" class="com.beans.Feedback" scope="page"></jsp:useBean>
        <jsp:setProperty name="feedback" property="*"></jsp:setProperty>
         <%  FeedbackDao fd = new FeedbackDao();
           if (fd.add(feedback)) {
                        
                        response.sendRedirect("index.jsp");
                  
                    }}
    %>
     