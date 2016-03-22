/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicJeff;

import _model.Room;
import java.util.Date;

/**
 *
 * @author Jeff_2
 */
public class ReservationJeff {
    public int rID, uID;
    public Date starting, ending;
    public String rType;
    public int rQuantity;
    public String spRequest;
    public Room room = new Room();    
}
