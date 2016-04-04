/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.sql.DataSource;

/**
 *
 * @author Jeff_2
 */
public class ConnectionPool {

    private DataSource ds;
    private static ConnectionPool connPool = null;
    private static Connection conn = null;
    private static Statement stmt  = null;

    //private constructor
    private ConnectionPool() {
        try {
            init();
        } catch (ServletException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //initialize 
    private void init() throws ServletException {

        try {
            Context ctx = new InitialContext();
            //for dilbert
            ds = (DataSource) ctx.lookup("jdbc/dilbert_HotelResDatasource");
            conn = ds.getConnection("n01039590", "oracle");
            stmt = conn.createStatement();

        } catch (NamingException | SQLException e) {
            throw new ServletException();
        }
    }

    //creates an instance of ConnectionPool class
    public static synchronized ConnectionPool getInstance() {
        if (connPool == null) {
            connPool = new ConnectionPool();
        }
        return connPool;
    }
    
    public static Statement getStatement(){
        return stmt;
    }
    
    public static Connection getConn(){
        return conn;
    }
    
    public static void destroy(){
        try{
            if(conn !=null){
                conn.close();
            }
        }catch(Exception e){
        
        }
    }
}
