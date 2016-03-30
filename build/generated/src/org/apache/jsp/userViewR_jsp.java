package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.ArrayList;
import logicJeff.ReservationJeff;
import databaseJeff.Database;

public final class userViewR_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<HTML>\r\n");
      out.write("    ");

        session = request.getSession();
        String username = session.getAttribute("username").toString();
    
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>");
      out.print(username);
      out.write("</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/main.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/nav.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/adminVw.css\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-image: url(images/natural_paper.png); \">\r\n");
      out.write("\r\n");
      out.write("        <h1>Hello ");
      out.print(username);
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("        <nav id=\"navGroup\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"userViewR.jsp\">My Reservation</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"userReserve.jsp\">New Reservation</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"userResetPSW.jsp\">Change Password</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"_home.jsp\">Log Out</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!--Reservation -->\r\n");
      out.write("        ");


            int cID = (Integer) session.getAttribute("cID"); //convert to int doesn't work here.
            //int cID = 8999;
            Database db = Database.getDatabase();
            ArrayList<ReservationJeff> reservations = db.getReservation(cID);
            session.setAttribute("reservations", reservations);
        
      out.write("\r\n");
      out.write("        <div class=\"tableForm\">\r\n");
      out.write("            <h1>Reservations</h1>\r\n");
      out.write("            <form method=\"get\" action=\"Change\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"thead\"></th>\r\n");
      out.write("                            <th class=\"thead\">Reservation ID</th>\r\n");
      out.write("                            <th class=\"thead\">User ID</th>\r\n");
      out.write("                            <th class=\"thead\">Starting</th>\r\n");
      out.write("                            <th class=\"thead\">Ending</th>\r\n");
      out.write("                            <th class=\"thead\">Room Type</th>\r\n");
      out.write("                            <th class=\"thead\">Quantity</th>\r\n");
      out.write("                            <th class=\"thead\">Special Request</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            Date today = new Date();
                            for (ReservationJeff res : reservations) {
                                if (today.before(res.starting)) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("\r\n");
      out.write("                            <td><input type=\"radio\" name=\"reservation\" value=\"");
      out.print(res.rID);
      out.write("\"></td>\r\n");
      out.write("                            <td>");
      out.print(res.rID);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(res.uID);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(res.starting);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(res.ending);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(res.rType);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(res.rQuantity);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(res.spRequest);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                                }
                            }
                        
      out.write(" \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>                       \r\n");
      out.write("                <input class=\"btns\" type=\"submit\" name=\"submit\" value=\"change\"/>\r\n");
      out.write("                <input class=\"btns\" type=\"submit\" name=\"submit\" value=\"delete\"/>\r\n");
      out.write("                <div id=\"message\">\r\n");
      out.write("                    ");

                        if (request.getAttribute("msg") != null) {
                            out.print(request.getAttribute("msg"));
                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form> \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--History --> \r\n");
      out.write("        <div class=\"tableForm\">\r\n");
      out.write("            <h1>History</h1>\t\r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th class=\"thead\">Reservation ID</th>\r\n");
      out.write("                        <th class=\"thead\">User ID</th>\r\n");
      out.write("                        <th class=\"thead\">Starting</th>\r\n");
      out.write("                        <th class=\"thead\">Ending</th>\r\n");
      out.write("                        <th class=\"thead\">Room Type</th>\r\n");
      out.write("                        <th class=\"thead\">Quantity</th>\r\n");
      out.write("                        <th class=\"thead\">Special Request</th>\r\n");
      out.write("                    </tr>\t\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");

                        for (ReservationJeff res : reservations) {
                            if (today.after(res.starting)) {
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(res.rID);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.uID);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.starting);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.ending);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.rType);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.rQuantity);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.spRequest);
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                            }
                        }
                    
      out.write(" \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\t\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
