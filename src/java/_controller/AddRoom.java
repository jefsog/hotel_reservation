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
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trisha
 */
public class AddRoom extends HttpServlet {

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
            _DB db = new _DB();
            Room r = new Room();
            String rmType = db.searchRoomName(request.getParameter("radRoom"));
            String rmlevel = request.getParameter("radLevel");
            String rmNum = request.getParameter("txtRoomNum").trim();
            String rmSpecs = request.getParameter("radSmoke");
            String add = request.getParameter("btnAdd");
            String msg;
            RequestDispatcher rd;
            int finalNum;

            if (!rmNum.isEmpty()) {

                if (add != null && rmType != null) {
                    int tmpLvl = Integer.parseInt(rmlevel);
                    int tmpNum = Integer.parseInt(rmNum);
                    if (rmlevel.equals("100")) {
                        finalNum = tmpLvl + tmpNum;
                    } else if (rmlevel.equals("200")) {
                        finalNum = tmpLvl + tmpNum;
                    } else {
                        finalNum = tmpLvl + tmpNum;
                    }

                    r.setRoomID(finalNum);
                    r.getRt().setRoomName(rmType);
                    r.setRoomSpec(rmSpecs);
                    db.addRoom(r);
                }
            } else {
                msg = "Please enter empty fields";
                request.setAttribute("msg", msg);
                rd = request.getRequestDispatcher("adminAddRoom.jsp");
                rd.forward(request, response);
            }

            rd = request.getRequestDispatcher("adminViewRooms.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
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
