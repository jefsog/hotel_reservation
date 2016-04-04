package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import logicJeff.ReservationJeff;
import _db._DB;

public final class adminViewReservations_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>View Reservations</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/_main.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/userMain.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\" defer></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\" defer></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/home.js\" defer></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--admin menu-->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content fadeIn animated\">\r\n");
      out.write("            <h2 class=\"slideInDown animated\">-View Reservations-</h2>\r\n");
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>          \r\n");
      out.write("                        <th class=\"thead\">Reservation ID</th>\r\n");
      out.write("                        <th class=\"thead\">User ID</th>\r\n");
      out.write("                        <th class=\"thead\">Starting</th>\r\n");
      out.write("                        <th class=\"thead\">Ending</th>\r\n");
      out.write("                        <th class=\"thead\">Room Type</th>\r\n");
      out.write("                        <th class=\"thead\">Quantity</th>\r\n");
      out.write("                        <th class=\"thead\">Price</th>\r\n");
      out.write("                        <th class=\"thead\">Special Request</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");

                        //_DB db = new _DB();
                        //db.getReservationList();
                        ArrayList<ReservationJeff> list = new ArrayList<ReservationJeff>();
                        list = (ArrayList<ReservationJeff>)request.getAttribute("lst");
                        for (ReservationJeff res : list) {

                    
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
      out.print(res.room.getRt().getRoomPrice());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(res.spRequest);
      out.write("</td>  \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");


                        }
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("        <form method=\"get\" action=\"ViewReservationList\">\r\n");
      out.write("            <div class=\"message\">\r\n");
      out.write("                ");
if (request.getAttribute("msg") != null) {
                    out.println(request.getAttribute("msg"));
                }
      out.write("  \r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <input class=\"txtGroup\" name=\"txtCheckIn\" type=\"text\" id=\"checkIn\" placeholder=\"Check in\"/>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <input class=\"txtGroup\" name=\"txtCheckOut\" type=\"text\" id=\"checkOut\" placeholder=\"Check out\"/> \r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <input class=\"txtGroup\" name=\"txtPrice\" type=\"text\" placeholder=\"Price\"/> \r\n");
      out.write("                </li>\r\n");
      out.write("                <li> \r\n");
      out.write("                    <input class=\"btns\" type=\"submit\" name=\"btn\" value=\"View\"/>  \r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </form>\r\n");
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
