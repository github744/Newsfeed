/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.Subscriber;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class SubscriberDao {
     public boolean add(Subscriber subscriber)
    {
        boolean status =false;
       try
        {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if(con!=null){
           String sql ="insert into subscribers(name,email)values(?,?)";
          PreparedStatement smt = con.prepareStatement(sql);
           smt.setString(1, subscriber.getName());
           smt.setString(2, subscriber.getEmail());
         
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
                String sql = "Delete from subscribers where id=?";
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
    public Subscriber getById(int id){
        Subscriber subscriber=null;
        
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from subscribers where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id );
                ResultSet rs = smt.executeQuery();
                if(rs.next()){
                    subscriber=new Subscriber();
                    subscriber.setId(rs.getInt("id"));
                    subscriber.setName(rs.getString("name"));
                    subscriber.setEmail(rs.getString("email"));
                   
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        
       return subscriber;
    }
    public ArrayList<Subscriber> getAllRecords(){
    ArrayList<Subscriber> subscribers=new ArrayList();
    
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from subscribers";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while(rs.next()){
                    Subscriber subscriber = new Subscriber();
                   subscriber=new Subscriber();
                   subscriber.setId(rs.getInt("id"));
                   subscriber.setName(rs.getString("name"));
                   subscriber.setEmail(rs.getString("fname"));
                   
                    
                   subscribers.add(subscriber);
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
 
    return subscribers;
}  
    public int getRecordCount()
{   int total=0;
    try
    {
         ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
               if(con!=null){
           String sql ="select count(*) from subscribers";
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
