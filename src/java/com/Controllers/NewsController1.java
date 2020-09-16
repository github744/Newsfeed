/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controllers;

import com.beans.JsonNews;
import com.beans.News;
import com.daos.MyUtility;
import com.daos.NewsDao;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 *
 * @author HP
 */
public class NewsController1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op = request.getParameter("op");
        if (op != null && op.equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            NewsDao pd = new NewsDao();
            if (pd.removeById(id)) {
                response.sendRedirect(request.getHeader("referer"));
            }
        }
        
              if(op!=null && op.equalsIgnoreCase("search")){
                  String keyword = request.getParameter("keyword");
                  NewsDao nd = new NewsDao();
                  ArrayList<News> articles = nd.getNewsByKeyword(keyword);
                  JsonNews jsonNews = new JsonNews();
                  if(articles.size()>0)
                  {
                      jsonNews.setStatus("success");
                      jsonNews.setMessage("total News found :"+articles.size());
                      jsonNews.setArticles(articles);
                  }
                  else {
                      jsonNews.setStatus("error");
                      jsonNews.setMessage("No News found ");
                      jsonNews.setArticles(articles);   
                  }
                  ObjectMapper mapper = new ObjectMapper();
                  String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNews);
                  out.println(json);
                  
               // out.println("Searching News......");
            }
        


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        String op = request.getParameter("op");
        if(op!=null && op.equalsIgnoreCase("add")){
            HttpSession session = request.getSession();
            News news = (News)session.getAttribute("news");
            String catids[] = (String[]) session.getAttribute("catids");
            NewsDao nd = new NewsDao();
            String imagePath ="";
           imagePath = new MyUtility().UploadFile(getServletContext(), "media/news", request);
            news.setImage(imagePath);
            if(nd.add(news, catids)) {
                session.removeAttribute("news");
                session.removeAttribute("catids");
                out.println("News added Successfully !!");
               response.sendRedirect("reporter1/addnews.jsp");
            }
        }
         if(op!=null && op.equalsIgnoreCase("update")){
            HttpSession session = request.getSession();
            News news = (News)session.getAttribute("news");
            String catids[] = (String[]) session.getAttribute("catids");
            NewsDao nd = new NewsDao();
            String imagePath ="";
           
           imagePath = new MyUtility().UploadFile(getServletContext(), "media/news", request);
             System.out.println("Image path after utility :"+imagePath);
             System.out.println("Current Image of Record :" + news.getImage());
              if(imagePath.trim().length()>0)
                    news.setImage(imagePath);
            if(nd.update(news, catids)) {
                session.removeAttribute("news");
                session.removeAttribute("catids");
                out.println("News Updated Successfully !!");
                response.sendRedirect(request.getHeader("referer"));
            }
        }
         
    
    }

}
