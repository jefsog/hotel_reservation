/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _model;

/**
 *
 * @author Trisha
 */
public class Room {
    private int roomID;
    private RoomType rt;
    private String roomSpec;

    public Room(){ rt = new RoomType();}
    
    public int getRoomID() { return roomID; }
    public void setRoomID(int _rmID) { roomID = _rmID; }

    public RoomType getRt() { return rt;}
    public void setRt(RoomType _rmType) { rt = _rmType; }

    public String getRoomSpec() { return roomSpec;}
    public void setRoomSpec(String _rmSpec) { roomSpec = _rmSpec; }   
}
