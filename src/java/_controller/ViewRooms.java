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
            switch (submit) {
                case "Add Room":
                    rd = request.getRequestDispatcher("admin/adminAddRoom.jsp");
                    rd.forward(request, response);
                    break;
                case "View Reservations":
                    rd = request.getRequestDispatcher("admin/adminViewReservations.jsp");
                    rd.forward(request, response);
                    break;
                case "Log Out":
                    rd = request.getRequestDispatcher("/_home.jsp");
                    rd.forward(request, response);
                    break;
                default:
                    try {
                        if (rId != null) {
                            if (submit.equals("Delete Room")) {
                                int i = Integer.parseInt(rId);
                                db.deleteRoom(i);
                            } else if (submit.equals("Edit Room")) {
                                request.setAttribute("rId", rId);
                                rd = request.getRequestDispatcher("admin/adminEditRoom.jsp");
                                rd.forward(request, response);
                            }
                        } else {
                            msg = "Please select a room.";
                        }

                        request.setAttribute("msg", msg);
                        rd = request.getRequestDispatcher("admin/adminViewRooms.jsp");
                        rd.forward(request, response);
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewRooms.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            }
        }

    }

    private void inputError(HttpServletRequest req, HttpServletResponse res) {
        try {
            try (PrintWriter out = res.getWriter()) {
                res.setContentType("text/html");
                out.println("<html><head>"
                        + " <title>Hotel</title></head><body>");
                out.println("<div id='warning'> Please select a room </div>");
                ServletContext sc = getServletConfig().getServletContext();
                RequestDispatcher rd = sc.getRequestDispatcher("/admin/adminViewRooms.jsp");
                rd.include(req, res);
                out.println("</body></html>");
            }
        } catch (ServletException | IOException e1) {
            e1.printStackTrace();
        } finally {

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
