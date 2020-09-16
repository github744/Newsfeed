/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controllers;

import com.beans.Admin;
import com.daos.AdminDao;
import com.daos.MyUtility;
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
public class AdminController extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        String op =request.getParameter("op");
        if (op!=null && op.equalsIgnoreCase("update")){
            HttpSession session = request.getSession();
            Admin admin = (Admin)session.getAttribute("admin");
            AdminDao rd = new AdminDao();
            // System.out.println("Admin is "+ admin.getName());
            String imagePath = "";
             imagePath = new MyUtility().UploadFile(getServletContext(), "media/admin", request);
              if(imagePath.trim().length()>0)
                 admin.setImage(imagePath);
            
            if(rd.update(admin)){
                //session.removeAttribute("admin1");
                //System.out.println("Admin updated Successfully !");
                session.setAttribute("admin", admin);
               response.sendRedirect("examples/dashboard.jsp");
                               
            }
        }

       
    }

    
    

}
