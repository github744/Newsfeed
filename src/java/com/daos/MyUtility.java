/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author HP
 */
public class MyUtility extends HttpServlet {

    public String UploadFile(ServletContext context, String filePath, HttpServletRequest request) {
        String imagePath = "";
        try {
            System.out.println("Multipart data found.......");
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List items = null;
            items = upload.parseRequest(request);

            Iterator itr = items.iterator();
            while (itr.hasNext()) {
                System.out.println("ok - 1 ");
                FileItem item = (FileItem) itr.next();
                if (!item.isFormField()) {
                    String image = item.getName();
                    System.out.println("Image Name  : " + image);
                      if(image !="" && image != null && ! image.isEmpty()){
                    imagePath = filePath + "/" + image;
                    System.out.println("Image path : " + imagePath);
                    File savedFile = new File(context.getRealPath("/") + imagePath);
                    item.write(savedFile);}
                }

            }
        } catch (Exception e) {
            imagePath="";
            System.out.println("File Upload Error :" + e.getMessage());
        }
        return imagePath;
    }

   
    }


