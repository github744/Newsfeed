/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.Admin;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AdminDao {
    
     public Admin getByLoginDetail(String userid, String password) {
        Admin admin = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from admin where userid=? and password = ?";
                PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, userid);
               smt.setString(2,password);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    System.out.println("ok..");
                    admin = new Admin();
                    admin.setId(rs.getInt("id"));
                    admin.setImage(rs.getString("image"));
                    admin.setName(rs.getString("name"));
                   admin.setUserid(rs.getString("userid"));
                //   admin.setPassword(rs.getString("password"));
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return admin;
    }
     public Admin ChangePassword(String password, String userid) {
        Admin admin = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "update admin set password = ? where userid=?";
                PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, password);
               smt.setString(2,userid);
                 smt.executeUpdate();
               
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return admin;
    }
     public boolean update(Admin admin) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "update admin set name=?,image=? where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, admin.getName());
               
                 smt.setString(2, admin.getImage());
                smt.setInt(3, admin.getId());
                if (smt.executeUpdate() > 0) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("DBError :" + e.getMessage());
            }
        }

        return status;
    }
 public Admin getById(int id) {
        Admin admin = null;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from admin where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    admin = new Admin();
                    admin.setId(rs.getInt("id"));
                    admin.setName(rs.getString("name"));
                    admin.setEmail(rs.getString("email"));
                    admin.setImage(rs.getString("image"));
                    
               }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return admin;
    }
 public ArrayList<Admin> getAllRecords(){
    ArrayList<Admin> admins=new ArrayList();
    
          try{
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con!=null){
                String sql = "select * from admin";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while(rs.next()){
                    Admin admin = new Admin();
                    admin=new Admin();
                   
                    admin.setName(rs.getString("name"));
                    admin.setEmail(rs.getString("email"));
                     admin.setUserid(rs.getString("userid"));
                      admin.setImage(rs.getString("image"));
                    
                    
                    admins.add(admin);
                }
               cp.putConnection(con);
               smt.close();
              }
         }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
 
    return admins;
}  
 
  public boolean validateEmail(String userid,String email) {
       boolean status=false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from admin where userid=? and email=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);
                smt.setString(2,email);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                   status=true;
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return status;
    }
  public Admin ChangePassword(String password, int id) {
       Admin admin = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "update admin set password = ? where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, password);
               smt.setInt(2,id);
                smt.executeUpdate();
               
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return admin;
    }
}
