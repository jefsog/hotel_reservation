/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.sql.DataSource;

/**
 *
 * @author Jeff_2
 */
public class ConnectionPool {
    private DataSource ds;

    public ConnectionPool() {
        try {
            init();
        } catch (ServletException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void init() throws ServletException {

        try {
            Context ctx = new InitialContext();
            //for localhost
            //ds = (DataSource) ctx.lookup("jdbc/myMenuDatasource_local");
            ds = (DataSource) ctx.lookup("jdbc/dilbertResource");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        //for localhost
        //return ds.getConnection("admin1", "admin1");
        return ds.getConnection("n01049709", "oracle");
    }
    
    
    
}
