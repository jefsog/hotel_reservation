/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _controller;

import _db._DB;
import databaseJeff.ConnectionPool;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logicJeff.ReservationJeff;

/**
 *
 * @author Trisha
 */
public class ViewReservationList extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String checkIn = request.getParameter("txtCheckIn");
        String checkOut = request.getParameter("txtCheckOut");
        String price = request.getParameter("txtPrice").trim();
        String level = request.getParameter("radLevel");
        String submit = request.getParameter("btn");
        String filter = request.getParameter("ddlFilter");
        RequestDispatcher rd;
        //String msg = null;
        HttpSession session = request.getSession();
        _DB db = (_DB) session.getAttribute("db");
        if (submit != null) {
            //if (checkIn != null && checkOut != null && !price.isEmpty()) {
                if (filter.equals("by Date")) {
                    db.setReservationListByDate(checkIn, checkOut);
                } else if (filter.equals("by Price")) {
                    double p = Double.parseDouble(price);
                    db.setReservationListByPrice(p);
                } else if (filter.equals("by Room Level")) {
                    db.setReservationListByRoomLevel(level);
                }
            //} else {
            //    msg = "Please enter empty fields";
           // }
        }
        session.setAttribute("resultDB", db);
        //request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("adminViewReservations.jsp");
        rd.forward(request, response);
    }

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
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ViewReservationList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ViewReservationList.class.getName()).log(Level.SEVERE, null, ex);
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
