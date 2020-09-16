<%@page import="com.beans.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.NewsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%> 
<header id="header">
    
    <div class="row">
      <div class="col-lg-12 col-md-12 col-sm-12">
        <div class="header_top">
          <div class="header_top_left">
            <ul class="top_nav">
              <li><a href="index.jsp">Home</a></li>
              <li><a href="About.jsp">About</a></li>
              <li><a href="contact.jsp">Contact</a></li>
              
         
            </ul>
          </div>
          <div class="header_top_right">
            <p><%= new java.util.Date()%></p>
          </div>
        </div>
      </div>
      <div class="col-lg-12 col-md-12 col-sm-12">
        <div class="header_bottom">
          <div class="logo_area"><a href="index.jsp" class="logo"><img src="images/logo.jpg" alt=""></a></div>
          <div class="add_banner"><a href="#"><img src="images/1022.png" alt=""></a></div>
        </div>
      </div>
    </div>
  </header>
  <section id="navArea">
    <nav class="navbar navbar-inverse" role="navigation">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav main_nav">
          <li class="active"><a href="index.jsp"><span class="fa fa-home desktop-home fa-2x"></span></a></li>
          <li><a href="Categorypage.jsp?cat_id=3">Technology</a></li>
          <li><a href="Categorypage.jsp?cat_id=4">Business</a></li>
          <li><a href="Categorypage.jsp?cat_id=5">Education</a></li>
          <li><a href="Categorypage.jsp?cat_id=6">Life & Style</a></li>
          <li><a href="Categorypage.jsp?cat_id=10">Entertainment</a></li>
          <li><a href="Categorypage.jsp?cat_id=11">Games</a></li>
           <li><a href="Categorypage.jsp?cat_id=12">Sports</a></li>
        </ul
      </div>
    </nav>
  </section>
  <section id="newsSection">
    <div class="row">
      <div class="col-lg-12 col-md-12">
        <div class="latest_newsarea"> <span>Latest News</span>
          <ul id="ticker01" class="news_sticker">
                  <%
                           
                            NewsDao nd = new NewsDao();
                            ArrayList<News> newsList=null;
                           
                                newsList = nd.getAllNews();
                           
                                
                         for(News news : newsList){%>
            <li><a href="detailnews.jsp?id=<%=news.getId()%>"><img src="<%=news.getImage()%>" alt=""> <% String desc = news.getTitle().trim();%><%= desc.length() > 10 ? desc.substring(0, 10) : desc%></a></li>
           
           <%}%>
          </ul>
        
        </div>
      </div>
    </div>
  </section>