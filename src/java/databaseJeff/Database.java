/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import logicJeff.RoomJeff;
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
    
    private static Database db;
    
    private Database() throws Exception{
        dataSource = new OracleDataSource();
        dataSource.setURL(strConnection);
        con = dataSource.getConnection();
        st = con.createStatement();
    }
    
    public static synchronized Database getDatabase() throws Exception{
        if(db == null){
            db = new Database();
        }
        return db;
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
    
    public void create_hroomtype() {
        try{
            String sql = "create table hroomtype"
                    + "(tname varchar2(20),"  
                    + "price number(3),"
                    
                    + "constraint hroomtype_tname_pk primary key(tname)"
                    + ")";
            st.executeUpdate(sql);
        }catch(Exception e){
            
        }
    }
    
    public void create_hroom() throws SQLException {
        
            String sql = "create table hroom"
                    + "(rid number(3),"  
                    + "tname varchar2(20),"
                    + "specification varchar2(30)," 
                    + "constraint hroom_rid_pk primary key(rid),"
                    + "constraint hroom_tname_fk foreign key(tname) references hroomtype(tname) on delete cascade"
                    + ")";
            st.executeUpdate(sql);
        
    }
    /* 
    create table hreservation 
        ( rsid number(5) primary key,
        cid number(4) references hcustomer(cid) on delete cascade);
    
    alter table hreservation
        add(starting date,
        ending date,
        constraint hreservation_ending_ck check (ending > starting))
    
    alter table hreservation
        add(tname varchar2(20) references hroomtype(tname) on delete cascade);
    
    alter table hreservation
        add(quantity number(1),
        comments varchar2(300));
    
    create sequence res_sequence
        MINVALUE 10001
        MAXVALUE 99999
        start with 10001
        increment by 1;
    
    */
    public void insert_ad() throws Exception{
        String sql = "insert into hcustomer values(9999, 'admin', 'admin', 'ad')";
        st.executeUpdate(sql);
    }
    
    public void create_cid_sequence() throws SQLException{
        String sql = "CREATE SEQUENCE cid_sequence" +
                        "  MINVALUE 5000" +
                        "  MAXVALUE 8999" +
                        "  START WITH 8999" +
                        "  INCREMENT BY -1";
        st.executeUpdate(sql);
                       
    }
    
    public int getUserID(String nm, String psw) throws SQLException{
        int i = -1;
        String sql = "select cid from hcustomer where fname = '"+nm+"' and psw = '"+psw+"'";
        ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
            i = rs.getInt(1);
        }
        return i;
    }
    
    public int addUser(String fname, String psw) throws SQLException{
        String qInsrtOrd = "INSERT INTO hcustomer VALUES(cid_sequence.NEXTVAL,?, ?, 'cs')";
        //String qInsrtOrd = "INSERT INTO hcustomer VALUES(8999,?, ?, 'cs')";
        //for localhost
        //String qInsrtOrd = "INSERT INTO orders(item_id, cust_id, quantity) VALUES(?, ?, ?)";
        int i = 0;
        try{
            PreparedStatement pstmt;
            //ResultSet rs;
            pstmt = con.prepareStatement(qInsrtOrd);
            //pstmt.setInt(1, o.getItem_id());
            pstmt.setString(1, fname); //number in the setString is the position of ?
            pstmt.setString(2, psw);
            i = pstmt.executeUpdate();
        }catch(Exception e){
            i = -1;
        }
        return i;  //if succeed, return 1, else return -1;
        
    }
    
    /*
    
    SELECT TO_DATE(
    '12/3/2016',
    'dd/mm/yyyy'
     )
     FROM DUAL;
    
    select quantity from hreservation 
        where starting<=to_date('12/3/2016') and ending>=to_date('13/3/2016') and tname='King';
    
    The java.sql.Date object's valueOf() method accepts a String, 
    which must be the date in JDBC time escape format: YYYY-MM-DD.
     String date = "2000-11-01";
    java.sql.Date javaSqlDate = java.sql.Date.valueOf(date);
    */
    
    public int occupiedRoomQuantity(String startingDate, String endingDate, String roomType){
        int i = 0;
        //either reservation in database starts or end with the search range, the room is occupied 
        String qInsrtOrd = "select quantity from hreservation where (starting>=? and starting<=? or ending>=? and ending<=?) and tname=?";
        try{
            PreparedStatement pstmt;
            ResultSet rs;
            pstmt = con.prepareStatement(qInsrtOrd);
            //pstmt.setInt(1, o.getItem_id());
            pstmt.setDate(1, java.sql.Date.valueOf(startingDate)); 
            pstmt.setDate(2, java.sql.Date.valueOf(endingDate));
            pstmt.setDate(3, java.sql.Date.valueOf(startingDate)); 
            pstmt.setDate(4, java.sql.Date.valueOf(endingDate));
            //pstmt.setDate(2, (java.sql.Date) endingDate); 
            pstmt.setString(5, roomType);
            rs = pstmt.executeQuery();
            while(rs.next()){
                i = i + rs.getInt(1);
            }
            
        }catch(Exception e){
            i = -1;
        }
        
        return i;
    }
    
    public RoomJeff[] getRooms() throws SQLException{
        RoomJeff[] rooms = new RoomJeff[30];
        String sql = "select * from hroom";
        ResultSet rs = st.executeQuery(sql);
        int count = 0;
        //RoomJeff room = new RoomJeff();
        while(rs.next()){
            rooms[count] = new RoomJeff(); //unlike primite type value, object has to be created.
            rooms[count].roomID = rs.getInt(1);
            rooms[count].roomType = rs.getString(2);
            rooms[count].specification = rs.getString(3);
            
            //System.out.println(count);
            
            //rooms[count] = room;  this is wrong, cause this makes all rooms child point to room
            //System.out.println(rooms[count].roomID);
            //System.out.println(rooms[count].roomType);
            count++;
        }
               
        return rooms;
    }
    
    public int getRoomQuantity(String roomType) throws SQLException{
        int roomQuantity = 0;
        RoomJeff[] rooms = getRooms();
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] == null)
                break;
            if(rooms[i].roomType.equals(roomType)){
//                System.out.println(i);
//                System.out.println(rooms[i].roomID);
//                System.out.println(rooms[i].roomType);
                roomQuantity++;
            }
        }
        return roomQuantity;
    }
    
    public int getAvailableRoomQuantity(String startingDate, String endingDate, String roomType) throws SQLException{
        int totalRoomQuantity = getRoomQuantity(roomType);
        int occupiedRoomQuantity = occupiedRoomQuantity(startingDate, endingDate, roomType);
        return totalRoomQuantity - occupiedRoomQuantity;
    }
    
    public int insertReservation(int cID, String starting, String ending,
            String rType, int rQuantity, String spRequest){
        String sql = "insert into hreservation values(res_sequence.nextval, ?, ?, ?, ?, ?, ?)";
        int i = 0;
        try{
            PreparedStatement pstmt;
            //ResultSet rs;
            pstmt = con.prepareStatement(sql);
            
//        int uID = (int) session.getAttribute("cID");
//        String starting = request.getParameter("txtArrivalDate");
//        String ending = request.getParameter("txtDepartureDate");
//        String rType = request.getParameter("Bed");
//        int rQuantity = Integer.parseInt(request.getParameter("ddlNoOfPeople"));
//        String spRequest = request.getParameter("txtSpecialRequests");
            pstmt.setInt(1, cID);
            pstmt.setDate(2, java.sql.Date.valueOf(starting)); 
            pstmt.setDate(3, java.sql.Date.valueOf(ending));
            pstmt.setString(4, rType);
            pstmt.setInt(5, rQuantity);
            if(spRequest.equals(""))
                spRequest = null;
            pstmt.setString(6, spRequest);
            
            i = pstmt.executeUpdate();
        }catch(Exception e){
            i = -1;
        }
        return i;  //if succeed, return 1, else return -1;
    }
    
}
