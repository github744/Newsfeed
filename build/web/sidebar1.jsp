 <%@page import="com.beans.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.NewsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
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
                               

                                