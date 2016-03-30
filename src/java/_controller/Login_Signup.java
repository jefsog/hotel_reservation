/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _controller;

import databaseJeff.Database;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Trisha
 */
public class Login_Signup extends HttpServlet {

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
        RequestDispatcher rd;
        String usnm = request.getParameter("user_name");
        String psw = request.getParameter("password");
        String submit = request.getParameter("submit");
        int cID;
        String error = null;
        boolean isValid;

        try {
            Database db = Database.getDatabase();

            if (submit.equals("Login")) {
                if (!usnm.isEmpty() && !psw.isEmpty()) {
                    isValid = db.validateUser(usnm, psw);
                    cID = db.getUserID(usnm, psw);
                    if (isValid) {
                        if (cID == 9999) {
                            rd = request.getRequestDispatcher("/admin/adminViewRooms.jsp");
                            rd.forward(request, response);
                        } else {
                            HttpSession session = request.getSession();
                            session.setAttribute("cID", cID);
                            session.setAttribute("username", usnm);
                            rd = request.getRequestDispatcher("userViewR.jsp");
                            rd.forward(request, response);
                        }
                    }
                    error = "Invalid username or password";

                } else {
                    error = "Please enter empty fields.";
                }
            } else if (submit.equals("Sign up")) {
                rd = request.getRequestDispatcher("userRegister.jsp");
                rd.forward(request, response);
            }

            request.setAttribute("error", error);
            rd = request.getRequestDispatcher("_home.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
        }
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
