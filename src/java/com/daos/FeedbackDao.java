/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.Feedback;
import com.beans.Query;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FeedbackDao {
     public boolean add(Feedback feedback)
    {
        boolean status =false;
       try
        {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if(con!=null){
           String sql ="insert into feedback(name,message)values(?,?)";
          PreparedStatement smt = con.prepareStatement(sql);
           smt.setString(1, feedback.getName());
          
           smt.setString(2, feedback.getMessage());
          ;
         
            int n = smt.executeUpdate();
            if(n>0)
            {
                status=true;
                    System.out.println("record inserted");}
             cp.putConnection(con);
             smt.close();
            
        }
      }catch(Exception e)
       {
        System.out.println("error" + e.getMessage());
       }
       return status;
    }
   public boolean removeById(int id){
        boolean status = false;
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "Delete from feedback where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id );
                
                int n = smt.executeUpdate();
                if (n>0){
                   status=true;
                   System.out.println("Record Removed !!");
                }
                   
                cp.putConnection(con);
                smt.close();
                
            }
            
            
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        
        
        return status;
    }
    public Feedback getById(int id){
        Feedback feedback=null;
        
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from feedback where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id );
                ResultSet rs = smt.executeQuery();
                if(rs.next()){
                    feedback = new Feedback();
                    feedback.setId(rs.getInt("id"));
                   feedback.setName(rs.getString("name"));
                   feedback.setMessage(rs.getString("message"));
                    
                   
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        
       return feedback;
    }
    public ArrayList<Feedback> getAllRecords(){
    ArrayList<Feedback> feedbacks=new ArrayList();
    
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from feedback";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while(rs.next()){
                    Feedback feedback = new Feedback();
                   feedback =new Feedback();
                  feedback.setId(rs.getInt("id"));
                  feedback.setName(rs.getString("name"));
                  
                 feedback.setMessage(rs.getString("message"));
                   
                    
                   feedbacks.add(feedback);
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
 
    return feedbacks;
}  
    public int getRecordCount()
{   int total=0;
    try
    {
         ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
               if(con!=null){
           String sql ="select count(*) from feedback";
          PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
              if(rs.next()){
                 total = rs.getInt(1);
                  System.out.println("total records:" + total );
                }
                 cp.putConnection(con);
             smt.close();
              
    }
        
} catch(Exception e)
       {
        System.out.println("error" + e.getMessage());
       }
       return total;
}
}
