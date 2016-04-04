/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _db;

import _model.Room;
import _model.RoomType;
import databaseJeff.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logicJeff.ReservationJeff;

/**
 *
 * @author Trisha
 */
public class _DB {

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ConnectionPool cp = null;
    private ArrayList<ReservationJeff> reservationList;
    private final ArrayList<ReservationJeff> searchResultList;

    public _DB() {
        searchResultList = new ArrayList<>();
        cp = ConnectionPool.getInstance();
        con = ConnectionPool.getConn();
    }

    public String searchRoomName(String _rm) throws SQLException {
        String rm = null;
        String qSel = "SELECT tname FROM hroomtype WHERE tname = ?";
        pstmt = con.prepareStatement(qSel);
        pstmt.setString(1, _rm);
        ResultSet rs = pstmt.executeQuery();

        if (rs != null) {
            while (rs.next()) {
                rm = rs.getString("tname");
            }
        }
        return rm;
    }

    public void addRoom(Room r) throws SQLException {

        int room_id = r.getRoomID();
        String qSel = "SELECT * FROM hroom WHERE rid = ?";
        pstmt = con.prepareStatement(qSel);
        pstmt.setInt(1, room_id);
        ResultSet rs = pstmt.executeQuery();

        //check if rs is not null
        if (rs != null) {
            if (!rs.next()) {
                String qIns = "INSERT INTO hroom(rid, tname, specification) VALUES(?,?,?)";

                pstmt = con.prepareStatement(qIns);
                pstmt.setInt(1, r.getRoomID());
                pstmt.setString(2, r.getRt().getRoomName());
                pstmt.setString(3, r.getRoomSpec());
                pstmt.executeUpdate();
            }
        }

    }

    public void updateRoom(Room r) throws SQLException {
        String qUpd = "UPDATE hroom SET tname=?, specification = ? WHERE rid = ?";
        pstmt = con.prepareStatement(qUpd);
        pstmt.setString(1, r.getRt().getRoomName());
        pstmt.setString(2, r.getRoomSpec());
        pstmt.setInt(3, r.getRoomID());
        pstmt.executeUpdate();

    }

    public void deleteRoom(int i) throws SQLException {
        String qDel = " DELETE FROM hroom WHERE rid = ?";
        pstmt = con.prepareStatement(qDel);
        pstmt.setInt(1, i);
        pstmt.executeUpdate();
    }

    public Room getRoom(int i) throws SQLException {
        Room r = null;
        String qSel = "SELECT * FROM hroom where rid = ?";
        pstmt = con.prepareStatement(qSel);
        pstmt.setInt(1, i);
        ResultSet rs = pstmt.executeQuery();

        if (rs != null) {
            while (rs.next()) {
                r = new Room();
                r.setRoomID(rs.getInt("rid"));
                r.getRt().setRoomName(rs.getString("tname"));
                r.setRoomSpec(rs.getString("specification"));
            }
        }
        return r;
    }

    public List<Room> getRoomList() throws SQLException {
        List<Room> list = new ArrayList<>();
        String qSel = "SELECT * FROM hroom ORDER BY rid ASC";
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                Room r = new Room();
                r.setRoomID(rs.getInt("RID"));
                r.getRt().setRoomName(rs.getString("TNAME"));
                r.setRoomSpec(rs.getString("SPECIFICATION"));
                list.add(r);
            }
        }
        return list;
    }

    public List<RoomType> getRoomTypeList() throws SQLException {
        List<RoomType> list = new ArrayList<>();
        String qSel = "SELECT * FROM hroomtype";
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                RoomType rt = new RoomType();
                rt.setRoomName(rs.getString(1));
                rt.setRoomPrice(rs.getDouble(2));
                list.add(rt);
            }
        }
        return list;
    }

    private final String qReservList = "SELECT res.RSID, rm.RID, res.CID, res.STARTING, res.ENDING, res.TNAME, res.QUANTITY, rmTyp.PRICE, res.COMMENTS "
            + "FROM hreservation res JOIN hroomtype rmTyp "
            + "ON res.TNAME = rmTyp.TNAME "
            + "JOIN hroom rm "
            + "ON rmTyp.TNAME = rm.TNAME ";
    
    private final String orderBy = "ORDER BY res.RSID";
    private ReservationJeff resJ;
    
    public ArrayList<ReservationJeff> getReservationList() throws SQLException {
        reservationList = new ArrayList<>();
        String qSel = qReservList + " " + orderBy;
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                resJ = new ReservationJeff();
                resJ.rID = rs.getInt("RSID");
                resJ.room.setRoomID(rs.getInt("RID"));
                resJ.uID = rs.getInt("CID");
                resJ.starting = rs.getDate("STARTING");
                resJ.ending = rs.getDate("ENDING");
                resJ.rType = rs.getString("TNAME");
                resJ.rQuantity = rs.getInt("QUANTITY");
                resJ.spRequest = rs.getString("COMMENTS");
                resJ.room.getRt().setRoomPrice(rs.getDouble("PRICE"));
                reservationList.add(resJ);
            }
        }
        return reservationList;

    }
    
    public ArrayList<ReservationJeff> getSearchResultList(){
        return searchResultList;
    }

    public void setReservationListByDate(String starting, String ending) throws SQLException {
        String qSel = qReservList + " "
                + "WHERE (res.starting >= TO_DATE(?, 'DD-MON-YY') AND res.starting <= TO_DATE(?, 'DD-MON-YY') "
                + "OR res.ending >= TO_DATE(?, 'DD-MON-YY') AND res.ending <= TO_DATE(?, 'DD-MON-YY')) "
                + orderBy;
        pstmt = con.prepareStatement(qSel);
        pstmt.setString(1, starting);
        pstmt.setString(2, ending);
        pstmt.setString(3, starting);
        pstmt.setString(4, ending);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                resJ = new ReservationJeff();
                resJ.rID = rs.getInt("RSID");
                resJ.room.setRoomID(rs.getInt("RID"));
                resJ.uID = rs.getInt("CID");
                resJ.starting = rs.getDate("STARTING");
                resJ.ending = rs.getDate("ENDING");
                resJ.rType = rs.getString("TNAME");
                resJ.rQuantity = rs.getInt("QUANTITY");
                resJ.spRequest = rs.getString("COMMENTS");
                resJ.room.getRt().setRoomPrice(rs.getDouble("PRICE"));
                searchResultList.add(resJ);
            }
        }
    }

    public void setReservationListByPrice(double price) throws SQLException {
        String qSel = qReservList + " "
                + "WHERE rmTyp.PRICE = ? "
                + orderBy;
        pstmt = con.prepareStatement(qSel);
        pstmt.setDouble(1, price);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                resJ = new ReservationJeff();
                resJ.rID = rs.getInt("RSID");
                resJ.room.setRoomID(rs.getInt("RID"));
                resJ.uID = rs.getInt("CID");
                resJ.starting = rs.getDate("STARTING");
                resJ.ending = rs.getDate("ENDING");
                resJ.rType = rs.getString("TNAME");
                resJ.rQuantity = rs.getInt("QUANTITY");
                resJ.spRequest = rs.getString("COMMENTS");
                resJ.room.getRt().setRoomPrice(rs.getDouble("PRICE"));
                searchResultList.add(resJ);
            }
        }
    }

    public void setReservationListByRoomLevel(String level) throws SQLException {
        char lvl;
        switch (level) {
            case "1":
                lvl =  '1';
                break;
            case "2":
                lvl = '2';
                break;
            default:
                lvl = '3';
                break;
        }
        String qSel = qReservList + " "
                + "WHERE rm.RID LIKE '" + lvl + "%' "
                + orderBy;
     
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                resJ = new ReservationJeff();
                resJ.rID = rs.getInt("RSID");
                resJ.room.setRoomID(rs.getInt("RID"));
                resJ.uID = rs.getInt("CID");
                resJ.starting = rs.getDate("STARTING");
                resJ.ending = rs.getDate("ENDING");
                resJ.rType = rs.getString("TNAME");
                resJ.rQuantity = rs.getInt("QUANTITY");
                resJ.spRequest = rs.getString("COMMENTS");
                resJ.room.getRt().setRoomPrice(rs.getDouble("PRICE"));
                searchResultList.add(resJ);
            }
        }
    }
}
