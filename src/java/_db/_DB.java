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

    public _DB() {
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

    public List<ReservationJeff> getReservationList() throws SQLException {
        List<ReservationJeff> list = new ArrayList<>();
        String qSel = "SELECT res.RSID, res.CID, res.STARTING, res.ENDING, res.TNAME, res.QUANTITY, rmTyp.PRICE, res.COMMENTS "
                + "FROM hreservation res JOIN hroomtype rmTyp "
                + "ON res.TNAME = rmTyp.TNAME "
                + "ORDER BY STARTING DESC";
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                ReservationJeff r = new ReservationJeff();
                r.rID = rs.getInt("RSID");
                r.uID = rs.getInt("CID");
                r.starting = rs.getDate("STARTING");
                r.ending = rs.getDate("ENDING");
                r.rType = rs.getString("TNAME");
                r.rQuantity = rs.getInt("QUANTITY");
                r.spRequest = rs.getString("COMMENTS");
                r.room.getRt().setRoomPrice(rs.getDouble("PRICE"));
                list.add(r);
            }
        }
        return list;
    }
    
    /*MODIFIED QUERY FOR INSERT RESERVATION, AND CHECK AVAILABLE ROOMS*/
    /*public int insertReservation(int cID, String starting, String ending,
            String rType, int rQuantity, String spRequest) {
        String sql = "insert into hreservation "
                + "values(res_sequence.nextval, ?, TO_DATE(?, 'DD-MON-YY'), TO_DATE(?, 'DD-MON-YY'), ?, ?, ?)";
        int i;
        ResultSet rs;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, cID);
            pstmt.setString(2, starting);
            pstmt.setString(3, ending);
            pstmt.setString(4, rType);
            pstmt.setInt(5, rQuantity);
            if (spRequest.equals("")) {
                spRequest = null;
            }
            pstmt.setString(6, spRequest);

            i = pstmt.executeUpdate();
        } catch (Exception e) {
            i = -1;
        }
        return i;  //if succeed, return 1, else return -1;
    }

    public int getRoomQty(String type) throws SQLException {
        int qty = 0;

        String qSel = "SELECT * FROM hroom WHERE tname = ?";
        pstmt = con.prepareStatement(qSel);
        pstmt.setString(1, type);
        ResultSet rs = pstmt.executeQuery();

        if (rs != null) {
            while (rs.next()) {
                qty++;
            }
        }
        return qty;
    }

    public int occupiedRoomQty(String arrival, String depart, String type) {
        int i = 0;
        String qSel = "SELECT quantity FROM hreservation "
                + "WHERE (starting >= TO_DATE(?, 'DD-MON-YY') AND starting <= TO_DATE(?, 'DD-MON-YY') "
                + "OR ending >= TO_DATE(?, 'DD-MON-YY') AND ending <= TO_DATE(?, 'DD-MON-YY')) AND tname = ?";
        ResultSet rs;
        try {
            pstmt = con.prepareStatement(qSel);
            pstmt.setString(1, arrival);
            pstmt.setString(2, depart);
            pstmt.setString(3, arrival);
            pstmt.setString(4, depart);
            pstmt.setString(5, type);
            rs = pstmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    i += rs.getInt(1);

                }
            }

        } catch (SQLException ex) {
            i = -1;
        }
        return i;
    }

    public int getAvailableRoomQty(String arrival, String depart, String rmType) throws SQLException {
        int totalQty = getRoomQty(rmType);
        int occupiedRm = occupiedRoomQty(arrival, depart, rmType);
        return totalQty - occupiedRm;
    }*/

}
