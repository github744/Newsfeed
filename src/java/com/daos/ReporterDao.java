/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.Reporter;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ReporterDao {
    

    

    public boolean add(Reporter reporter) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "Insert into reporter(name,dob,gender,contact,email,userid,password,image,status)values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, reporter.getName());
                smt.setString(2, reporter.getDob());
                smt.setString(3, reporter.getGender());
                smt.setString(4, reporter.getContact());
                smt.setString(5, reporter.getEmail());
               
                smt.setString(6, reporter.getUserid());
                smt.setString(7, reporter.getPassword());
                  smt.setString(8, reporter.getImage());
                smt.setString(9, reporter.getStatus());
                if (smt.executeUpdate() > 0) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Database Error :" + e.getMessage());
            }
        }

        return status;
    }

    public boolean remove(int id) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "Delete from reporter where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id);

                if (smt.executeUpdate() > 0) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }

    public Reporter getById(int id) {
        Reporter reporter = null;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    reporter = new Reporter();
                    reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
               
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                    reporter.setImage(rs.getString("image"));
                    reporter.setStatus(rs.getString("status"));
               }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return reporter;
    }

    public ArrayList<Reporter> getAllRecords() {

        ArrayList<Reporter> reporters = new ArrayList<Reporter>();
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Reporter reporter = new Reporter();
                    reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
                  
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                      reporter.setImage(rs.getString("image"));
                    reporter.setStatus(rs.getString("status"));
                   reporters.add(reporter);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return reporters;
    }

    public ArrayList<Reporter> getRecordByLimit(int start, int end) {

        ArrayList<Reporter> reporters = new ArrayList<Reporter>();
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter limit ?,?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, start);
                smt.setInt(2, end);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Reporter reporter = new Reporter();
                    reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                    reporter.setImage(rs.getString("image"));
                    reporter.setStatus(rs.getString("status"));
                   reporters.add(reporter);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return reporters;
    }

    public int getRecordsCount() {

        int total = 0;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select count(*) from reporter";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    total = rs.getInt(1);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return total;
    }

    public boolean update(Reporter reporter) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "update reporter set name=?,dob=?,gender=?,contact=?,email=?,password=?,image=? where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, reporter.getName());
                smt.setString(2, reporter.getDob());
                smt.setString(3, reporter.getGender());
                smt.setString(4, reporter.getContact());
                smt.setString(5, reporter.getEmail());
                  smt.setString(6, reporter.getPassword());
                 smt.setString(7, reporter.getImage());
                smt.setInt(8, reporter.getId());
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

    public boolean isUserIdExist(String userid) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where userid=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }

    public boolean isContactExist(String contact) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where contact=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, contact);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }

    public boolean isEmailExist(String email) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where email=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, email);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }

    public int isValid(String userid, String password) {
        int status = -1;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where userid=? and password=? and status='approved'";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);
                smt.setString(2, password);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = rs.getInt("id");
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("DBError :" + e.getMessage());
            }
        }

        return status;
    }
    public boolean updateNewsStatus(Reporter reporter, String status){
    boolean sts = false;
    ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();

        if (con != null) {
           try {
                String sql = "update reporter set status=? where id = ?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, status);
              
                smt.setInt(2, reporter.getId());
                smt.executeUpdate();
                cp.putConnection(con);
                sts = true;
                smt.close();

            } catch (Exception e) {
              System.out.println("Error " + e.getMessage());
            }
       }
     return sts;
}
    public Reporter ChangePassword(String password, String userid) {
        Reporter reporter = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "update reporter set password = ? where userid=?";
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

        return reporter;
    }
 public Reporter ChangePassword(String password, int id) {
        Reporter reporter = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "update reporter set password = ? where id=?";
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

        return reporter;
    }
 public boolean validateEmail(String userid,String email) {
       boolean status=false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from reporter where userid=? and email=?";
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
    
}
