/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controllers;

import com.beans.Reporter;
import com.daos.MyUtility;
import com.daos.QueryDao;

import com.daos.ReporterDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class ReporterController extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String op = request.getParameter("op");
         if (op != null && op.equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ReporterDao rd = new ReporterDao();
            if (rd.remove(id)) {
                  response.sendRedirect(request.getHeader("referer"));
            }
        }
          if (op != null && op.equalsIgnoreCase("delete1")) {
            int id = Integer.parseInt(request.getParameter("id"));
            QueryDao qd = new QueryDao();
            if (qd.removeById(id)) {
                  response.sendRedirect(request.getHeader("referer"));
            }
        }
       /*  if(op!=null && op.equalsIgnoreCase("checkuserid")){
            String userid= request.getParameter("userid");
            ReporterDao rd = new ReporterDao();
            if(userid==null || userid.equals("")){
                out.println("please provide user id");
            }
            if(rd.isUseridExist(userid))
            {
                out.println("user-id Exist");
                       
            }
            else
            {
                
            out.println("user-id Not exist");
        }
    }*/
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        String op =request.getParameter("op");
        
        if (op!=null && op.equalsIgnoreCase("add")){
            HttpSession session = request.getSession();
            Reporter reporter = (Reporter)session.getAttribute("reporter");
            ReporterDao rd = new ReporterDao();
            
            String imagePath = "";
             imagePath = new MyUtility().UploadFile(getServletContext(), "media/reporter", request);
            reporter.setIamge(imagePath);
            
            if(rd.add(reporter)){
                session.removeAttribute("reporter");
                response.sendRedirect("welcomerepo.jsp");
              //  out.println("Reproter Added Successfully !");
            }
        }
         if (op!=null && op.equalsIgnoreCase("update")){
            HttpSession session = request.getSession();
            Reporter reporter = (Reporter)session.getAttribute("reporter1");
            ReporterDao rd = new ReporterDao();
            // System.out.println("Reporter is "+ reporter.getName());
            String imagePath = "";
             imagePath = new MyUtility().UploadFile(getServletContext(), "media/reporter", request);
              if(imagePath.trim().length()>0)
                 reporter.setIamge(imagePath);
            
            if(rd.update(reporter)){
                session.removeAttribute("reporter1");
                System.out.println("Reporter updated Successfully !");
                session.setAttribute("reporter", reporter);
               response.sendRedirect("reporter1/dashboard.jsp");
                               
            }
        }

       
    }

}
