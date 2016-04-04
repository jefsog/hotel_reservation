package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import _db._DB;
import _model.Room;
import java.util.List;
import _model.RoomType;

public final class adminEditRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Edit Room</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Styles/main.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/nav.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/adminForm.css\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--adminMenu-->\r\n");
      out.write("        <nav id=\"menuGroup\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/hotel_reservation/admin/adminViewRooms.jsp\">View Rooms</a>\r\n");
      out.write("                </li> \r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/hotel_reservation/admin/adminAddRoom.jsp\">Add Room</a>\r\n");
      out.write("                </li>      \r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/hotel_reservation/admin/adminViewReservations.jsp\">View Reservations</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/hotel_reservation/_home.jsp\">Log out</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("        <!--header-->\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <h1>-Edit Room-</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");

            int rId = Integer.parseInt((String) request.getAttribute("rId"));
            session.setAttribute("rId", rId);
            _DB db = new _DB();
            Room r = db.getRoom(rId);
            int rmID = r.getRoomID();
            String rmType = r.getRt().getRoomName();
            String rmSpec = r.getRoomSpec();
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"frmGroup\">\r\n");
      out.write("            <form method=\"GET\" name=\"editForm\" action=\"EditRoom\">\r\n");
      out.write("                <div id=\"roomNum\">\r\n");
      out.write("                    <h3>Room Number:</h3> \r\n");
      out.write("                    <span>");
      out.print(rmID);
      out.write("</span> \r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"typeGroup\">\r\n");
      out.write("                    <h3>Room Type:</h3>\r\n");
      out.write("                    ");

                        String chk1 = null, chk2 = null, chk3 = null;
                        if (rmType.contains("King")) {
                            chk1 = "checked";
                        } else if (rmType.contains("One Queen")) {
                            chk2 = "checked";
                        } else {
                            chk3 = "checked";
                        }
                    
      out.write("\r\n");
      out.write("                    <input type=\"radio\" name=\"radRoom\" value=\"King\" id=\"radKing\" ");
      out.print( chk1);
      out.write(">\r\n");
      out.write("                    <label>King</label>  \r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" name=\"radRoom\" value=\"One Queen\" id=\"radOQueen\" ");
      out.print( chk2);
      out.write(">\r\n");
      out.write("                    <label>One Queen</label>  \r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" name=\"radRoom\" value=\"Two Queens\" id=\"radTQueen\" ");
      out.print( chk3);
      out.write(">\r\n");
      out.write("                    <label>Two Queens</label>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"smokeGroup\">\r\n");
      out.write("                    <h3>Specifications:</h3>\r\n");
      out.write("\r\n");
      out.write("                    ");

                        String chkSmk1 = null, chkSmk2 = null;
                        if (rmSpec.contains("Non-smoking")) {
                            chkSmk1 = "checked";
                        } else {
                            chkSmk2 = "checked";
                        }
                    
      out.write("\r\n");
      out.write("                    <input type=\"radio\" name=\"radSmoke\" value=\"Non-smoking\"");
      out.print(chkSmk1);
      out.write(">\r\n");
      out.write("                    <label>Non-smoking</label>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" name=\"radSmoke\" value=\"Smoking\"  ");
      out.print(chkSmk2);
      out.write(">\r\n");
      out.write("                    <label>Smoking</label>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id =\"btnGroup\">\r\n");
      out.write("                    <input class=\"btns\" type=\"submit\" name=\"btn\" value=\"Cancel\"/>\r\n");
      out.write("                    <input class=\"btns\" type=\"submit\" name=\"btn\" value=\"Edit\"/>\r\n");
      out.write("                </div>       \r\n");
      out.write("            </form>\r\n");
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
