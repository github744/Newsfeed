/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;
import java.net.ConnectException;
import java.sql.*;
import java.util.*;
/**
 *
 * @author HP
 */
public class ConnectionPool {
    static final int MAX_CONNECTIONS = 20;
    static Vector connnections = null;
    static ConnectionPool instance = null;
    
    
    
    
    public synchronized void removeAllConnections()
    {
       try
        {
            if(connnections == null)
            {
                return;
            }
            int sz = connnections.size();
            for(int i=0;i<sz;i++)
            {
                Connection c = (Connection) connnections.elementAt(i);
                c.close();
            }
           connnections.removeAllElements();
           connnections = null;
        }catch(SQLException sqlE){
            System.out.println(sqlE);
        
        }
    }
    public synchronized void initialize()
    {
        if(connnections==null)
        {
            try
            {
                String userName = "root";
                String password = "5050";
                String url = "jdbc:mysql://localhost:3306/training";
                Class.forName("com.mysql.jdbc.Driver");
                connnections = new Vector();
                int count = 0;
                while(count < MAX_CONNECTIONS)
                {
                    Connection c = DriverManager.getConnection(url, userName, password);
                    connnections.addElement(c);
                    count++;
            }
        }catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
 }
    
    public synchronized Connection getConnection()
    {
        Connection c = null; // to take connection from pool
        if(connnections== null)
        {
            return null;
        }
        if(connnections.size()>0)
        {
            c = (Connection) connnections.elementAt(0);
            connnections.removeElementAt(0);
        }
        return c;
    }
    public synchronized void putConnection(Connection c)
    {
        connnections.addElement(c); // to put connection to pool
        notifyAll();
    }
    
    public static synchronized ConnectionPool getInstance()
    {
        if(instance == null){
            instance= new ConnectionPool(); // creating connection object
        }
        return instance;
    }
}
