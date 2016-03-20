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
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public String searchRoom(String _rm) throws SQLException {
        String rm = null;
        String qSel = "SELECT tname FROM hroomtype WHERE tname = ?";
        pstmt = con.prepareStatement(qSel);
        pstmt.setString(1, _rm);
        ResultSet rs = pstmt.executeQuery();

        if (rs != null) {
            while (rs.next()) {
                rm = rs.getString("TNAME");
            }
        }
        return rm;
    }

    public void addRoom(Room r) throws SQLException {
        try {    
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
        } catch (SQLException ex) {
            Logger.getLogger(Room_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateRoom(Room r) throws SQLException {
        try {
        
            String qSel = "SELECT specification FROM hroom WHERE rid = ?";
            pstmt = con.prepareStatement(qSel);
            pstmt.setInt(1, r.getRoomID());
            ResultSet rs = pstmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    String spec = rs.getString(1);
                    String qUpd = "UPDATE hroom SET specification = ? WHERE rid = ?";
                    pstmt = con.prepareStatement(qUpd);
                    pstmt.setString(1, spec);
                    pstmt.setInt(2, r.getRoomID());
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Room_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteRoom(Room r) throws SQLException {
        try {
            ResultSet rs;
            String qSel = "SELECT * FROM hroom where rid = ?";
            pstmt = con.prepareStatement(qSel);
            pstmt.setInt(1, r.getRoomID());
            rs = pstmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    String qDel = " DELETE FROM hroom WHERE rid = ?";
                    pstmt = con.prepareStatement(qDel);
                    pstmt.setInt(1, r.getRoomID());
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Room_DB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public List<RoomType> getRoomTypes() throws SQLException{
        List<RoomType> list = new ArrayList<>();
        String qSel = "SELECT tname FROM hroomtype";
        pstmt = con.prepareStatement(qSel);
        ResultSet rs = pstmt.executeQuery();
        if(rs != null){
            while(rs.next()){
                RoomType rt = new RoomType();
                rt.setRoomName(rs.getString(1));
                list.add(rt);
            }
        }
        return list;
    }

}
