/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

import java.sql.Connection;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Jeff_2
 */
public class Database {
    private String strConnection=
            "jdbc:oracle:thin:n01039590/oracle@dilbert.humber.ca:1521:grok";
    private Connection con;
    private OracleDataSource dataSource;
    private Statement st;
    
    public Database() throws Exception{
        dataSource = new OracleDataSource();
        dataSource.setURL(strConnection);
        con = dataSource.getConnection();
        st = con.createStatement();
    }
    
    public void close() throws Exception{
        con.close();
    }
    
    public void create_hcustomer() throws Exception{
        String sql = "create table hcustomer"
                + "(cid number(4),"  //'uid' has been used by oracle
                + "fname varchar2(30),"
                + "psw varchar2(30),"
                + "utype char(2),"
                + "constraint huser_uid_pk primary key(cid)"
                + ")";
        st.executeUpdate(sql);
    }
    
    public void insert_ad() throws Exception{
        String sql = "insert into hcustomer values(9999, 'admin', 'admin', 'ad')";
        st.executeUpdate(sql);
    }
    
}
