/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _controller;

import _db._DB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trisha
 */
public class CheckAvailable extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String arrival = request.getParameter("txtArrival");
        String depart = request.getParameter("txtDeparture");
        int qty = Integer.parseInt(request.getParameter("ddlNumRooms"));
        String rType = request.getParameter("radRoom");
        int totalRms, rmAvail, rmOccupied;
        String msg;
        try {
            _DB db = new _DB();
            rmAvail = db.getAvailableRoomQty(arrival, depart, rType);
            totalRms = db.getRoomQty(rType);
            rmOccupied = db.occupiedRoomQty(arrival, depart, rType);
            System.out.println(totalRms + " " + rType + " total rooms");
            System.out.println(rmOccupied + " " + rType + " occupied");
            System.out.println(rmAvail + " " + rType + " left");
            if (qty <= rmAvail) {
                msg = "From " + arrival + " to " + depart + ", only " + rmAvail + " " + rType + " room/s left.";
                request.setAttribute("msg", msg);
            }
            if(qty > rmAvail){
                      msg = "Arrival Date: " + arrival + "<br/>"
                        + "Departure Date: " + depart + "<br/>"
                        + "You have selected " + qty + " rooms.<br/>"
                        + "No available " + rType + " rooms.<br/>";
                request.setAttribute("msg", msg);
            }
            RequestDispatcher rd = request.getRequestDispatcher("_home.jsp");
            rd.forward(request, response);
        } catch (SQLException | ServletException | IOException ex) {
            Logger.getLogger(CheckAvailable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
