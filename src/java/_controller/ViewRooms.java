/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _controller;

import _db._DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class ViewRooms extends HttpServlet {

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
        String submit = request.getParameter("btn");
        String rId = request.getParameter("radRoom");
        RequestDispatcher rd;
        _DB db = new _DB();
        String msg = null;
        if (submit != null) {
            if (rId != null) {
                int i = Integer.parseInt(rId);
                if (submit.equals("Delete Room")) {
                    try {
               
                        db.deleteRoom(i);
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewRooms.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    request.setAttribute("rId", rId);
                    rd = request.getRequestDispatcher("adminEditRoom.jsp");
                    rd.forward(request, response);
                }
            } else {
                msg = "Please select a room.";
            }

            request.setAttribute("msg", msg);
            rd = request.getRequestDispatcher("adminViewRooms.jsp");
            rd.forward(request, response);
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
