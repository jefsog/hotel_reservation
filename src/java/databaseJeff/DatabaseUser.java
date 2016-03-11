/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseJeff;

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
            Database db = new Database();
            //db.create_hcustomer();
            //db.insert_ad();
            
            System.out.println(":)");
            db.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
