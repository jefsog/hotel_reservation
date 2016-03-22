/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _controller;

import _db._DB;
import _model.Room;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trisha
 */
@WebServlet(name = "EditRoom", urlPatterns = {"/EditRoom"})
public class EditRoom extends HttpServlet {

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
            Room r = new Room();
            _DB db = new _DB();
            HttpSession session = request.getSession();
            int rId = (int) session.getAttribute("rId");
            String type = request.getParameter("radRoom");
            String spec = request.getParameter("radSmoke");
            String submit = request.getParameter("btn");
       
            if (submit != null) {
                if (submit.equals("Edit")) {
                    r.setRoomID(rId);
                    r.getRt().setRoomName(type);
                    r.setRoomSpec(spec);
                    db.updateRoom(r);
                }
            }
            RequestDispatcher rd = request.getRequestDispatcher("adminViewRooms.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(EditRoom.class.getName()).log(Level.SEVERE, null, ex);
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
