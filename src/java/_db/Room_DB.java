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

/**
 *
 * @author Trisha
 */
public class Room_DB {

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ConnectionPool cp = null;

    public Room_DB() {
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

        String qUpd = "UPDATE hroom SET rid = ?, specification = ? WHERE rid = ?";
        pstmt = con.prepareStatement(qUpd);
        pstmt.setInt(1, r.getRoomID());
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

    public List<Room> getRooms() throws SQLException {
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

    public List<RoomType> getRoomTypes() throws SQLException {
        List<RoomType> list = new ArrayList<>();
        String qSel = "SELECT tname FROM hroomtype";
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                RoomType rt = new RoomType();
                rt.setRoomName(rs.getString(1));
                list.add(rt);
            }
        }
        return list;
    }

}
