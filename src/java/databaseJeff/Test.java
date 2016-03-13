/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

import logicJeff.RoomJeff;

/**
 *
 * @author Jeff_2
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RoomJeff[] rooms = new RoomJeff[30];
        rooms[0].setRoomID(32);
        //rooms[0].roomType="King";
        System.out.println(rooms[0].roomID);
        //System.out.println(rooms[0].roomType);
        System.out.println(":)");
    }
    
}
