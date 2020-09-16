/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

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
public class QueryDao {
       public boolean add(Query query)
    {
        boolean status =false;
       try
        {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if(con!=null){
           String sql ="insert into query(name,email,contact,message)values(?,?,?,?)";
          PreparedStatement smt = con.prepareStatement(sql);
           smt.setString(1, query.getName());
           smt.setString(2, query.getEmail());
           smt.setString(3, query.getContact());
           smt.setString(4, query.getMessage());
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
                String sql = "Delete from query where id=?";
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
    public Query getById(int id){
        Query query=null;
        
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from query where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id );
                ResultSet rs = smt.executeQuery();
                if(rs.next()){
                    query=new Query();
                    query.setId(rs.getInt("id"));
                    query.setName(rs.getString("name"));
                    query.setEmail(rs.getString("email"));
                     query.setContact(rs.getString("contact"));
                    query.setMessage(rs.getString("message"));
                   
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        
       return query;
    }
    public ArrayList<Query> getAllRecords(){
    ArrayList<Query> querys=new ArrayList();
    
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from query";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while(rs.next()){
                    Query query = new Query();
                   query=new Query();
                   query.setId(rs.getInt("id"));
                   query.setName(rs.getString("name"));
                   query.setEmail(rs.getString("email"));
                   query.setContact(rs.getString("contact"));
                   query.setMessage(rs.getString("message"));
                   
                    
                   querys.add(query);
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
 
    return querys;
}  
    public int getRecordCount()
{   int total=0;
    try
    {
         ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
               if(con!=null){
           String sql ="select count(*) from query";
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
