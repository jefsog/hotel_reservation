/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

import java.text.SimpleDateFormat;
import java.util.Date;
import logicJeff.RoomJeff;

/**
 *
 * @author Jeff_2
 */
public class DatabaseUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Database db = Database.getDatabase();
            //db.create_hcustomer();
            //db.insert_ad();
            //ConnectionPool dbPool = new ConnectionPool();
            //db.create_cid_sequence();
            //System.out.println(db.getUserID("admin", "admin"));
            //System.out.println(db.addUser("jeff", "psw"));
            //db.create_hroomtype();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
//	
//                //Date arrival = new Date(); 
//                
//            Date starting = new Date();
//            String date = sdf.format(starting); 
//            Date ending;
//            ending = new Date();
//            
//            
//            System.out.println(date);
//            System.out.println(ending);
//            //System.out.println(ending > starting);
//            
//            int i = db.occupiedRoomQuantity("2016-3-11", date,  "King");
            int j = db.occupiedRoomQuantity("2016-3-13", "2016-3-14", "King");
            int i = db.getRoomQuantity("King");
            int k = db.getAvailableRoomQuantity("2016-3-13", "2016-3-14", "King");
            System.out.println(k);
//            RoomJeff[] rooms = db.getRooms();
//            for(int i = 0; i<12; i++){
//                System.out.println(i);
//                System.out.println(rooms[i].roomID);
//                System.out.println(rooms[i].roomType);
//                //System.out.println(rooms[i].specification);
//            }
            
//            RoomJeff[] rooms = new RoomJeff[30];
//            rooms[0].roomID=32;
//            rooms[0].roomType="King";
//            System.out.println(rooms[0].roomID);
//            System.out.println(rooms[0].roomType);
            
            System.out.println(":)");
            //db.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
