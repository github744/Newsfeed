/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.Category;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CategoryDao {
     

     public boolean  add(Category category){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Insert into news_cat(name) values(?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, category.getName());
           
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   
   
   public boolean  remove(int id){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Delete from news_cat where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   public Category  getById(int id){
      Category category=null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from news_cat where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                category =new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                 
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return category;
   }
   
   public ArrayList<Category>  getAllRecords(){
    
       ArrayList<Category> categorys =new ArrayList<Category>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from news_cat";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                categorys.add(category);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return categorys;
   }
    public ArrayList<Category>  getAllCheckedCat(int id){
    
       ArrayList<Category> categorys =new ArrayList<Category>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select id,name from news_cat where id in (select cat_id from ncr where news_id=?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                categorys.add(category);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return categorys;
   }
   
   
   
   
   public ArrayList<Category>  getRecordByLimit(int start, int end){
    
       ArrayList<Category> categorys =new ArrayList<Category>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from news_cat limit ?,?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, start);
            smt.setInt(2, end);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                
                categorys.add(category);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return categorys;
   }
   
  
   public int  getRecordsCount(){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select count(*) from news_cat";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                total = rs.getInt(1);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return total;
   }
   
   public boolean  update(Category category){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update news_cat set name=? where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, category.getName());
            smt.setInt(2, category.getId());
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   public boolean  isCategoryExist(String catname){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from news_cat where catname=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, catname);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
       return status;
   }
   
    
}

