/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import _db._DB;
import databaseJeff.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jeff_2
 */
public class Reserve extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int uID = (int) session.getAttribute("cID");
        String starting = request.getParameter("txtArrivalDate");
        String ending = request.getParameter("txtDepartureDate");
        String rType = request.getParameter("Bed");
        int rQuantity = Integer.parseInt(request.getParameter("ddlNoOfPeople"));
        String spRequest = request.getParameter("txtSpecialRequests");
        int i = 0;
        int roomAvailability;
        String msg;
        try {
            Database db = Database.getDatabase();
            roomAvailability = db.getAvailableRoomQuantity(starting, ending, rType);
            if (rQuantity <= roomAvailability) {
                i = db.insertReservation(uID, starting, ending, rType, rQuantity, spRequest);
                if (rQuantity > roomAvailability) {
                    msg = "From " + starting + " to " + ending + "\n"
                            + rQuantity + " rooms selected. Only " + roomAvailability + " " + rType + " rooms are available.";
                    request.setAttribute("msg", msg);
                    RequestDispatcher rd = request.getRequestDispatcher("userReserve.jsp");
                    rd.forward(request, response);
                }
            }
//            } else {
//                //return error information;
//                msg = "From " + starting + " to " + ending + " , " + roomAvailability + " " + rType + "  rooms are available.";
//                request.setAttribute("msg", msg);
//                RequestDispatcher rd = request.getRequestDispatcher("userReserve.jsp");
//                rd.forward(request, response);
//            }
            if (rQuantity > roomAvailability) {
                msg = "From " + starting + " to " + ending + "\n"
                        + rQuantity + " rooms selected. No available " + rType + " rooms. Please select another room type.";
                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("userReserve.jsp");
                rd.forward(request, response);
            }
            if (i == 1) {
                RequestDispatcher rd = request.getRequestDispatcher("userViewR.jsp");
                rd.forward(request, response);
            } else {
                //return error information
            }

        } catch (Exception e) {

        }
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Reserve</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println(uID);
//            out.println(starting);
//            out.println(ending);
//            out.println(rType);
//            out.println(rQuantity);
//            out.println(spRequest);
//            out.println(roomAvailability);
//            out.println(i);
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
