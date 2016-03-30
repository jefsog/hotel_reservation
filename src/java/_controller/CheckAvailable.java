/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _controller;

import databaseJeff.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
        try {
            Database db = Database.getDatabase();
            String check = request.getParameter("btnCheck");
            String checkIn = request.getParameter("txtCheckIn");
            String checkOut = request.getParameter("txtCheckOut");
            String rType = request.getParameter("ddlRoomTypes");
            String q = request.getParameter("ddlNumRooms");

            String msg = null;

            int rmAvail = db.getAvailableRoomQuantity(checkIn, checkOut, rType);

            if (check != null && !checkIn.isEmpty() && !checkOut.isEmpty() && rType != null && q != null) {
                int qty = Integer.parseInt(q);
                if (qty <= rmAvail) {
                    msg = "From " + checkIn + " to " + checkOut + ", " + rmAvail + " " + rType + " room/s left.";
                }
                if (qty > rmAvail) {
                    msg = "Arrival Date: " + checkIn + "<br/>"
                            + "Departure Date: " + checkOut + "<br/>"
                            + "You have selected " + qty + " rooms.<br/>"
                            + "No available " + rType + " rooms.<br/>";
                }   
            } else {
                msg = "Please enter empty fields.";           
            }
            request.setAttribute("msg", msg);
            RequestDispatcher rd = request.getRequestDispatcher("_home.jsp");
            rd.forward(request, response);

        } catch (Exception ex) {
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
