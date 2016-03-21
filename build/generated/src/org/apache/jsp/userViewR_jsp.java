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
      out.write("<HEAD>\r\n");
      out.write("<TITLE>My Schedule</TITLE>\r\n");
      out.write("<META content=\"Cutepage 2.0\" name=GENERATOR></HEAD>\r\n");
      out.write("<META content=\"text/html; charset=iso-8859-1\" http-equiv=Content-Type>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("<!--\r\n");
      out.write("A:link {text-decoration:none; color:\"#0000ff\"}\r\n");
      out.write("A:visited {text-decoration:none}\r\n");
      out.write("A:hover {text-decoration:underline; color:\"#FF0033\"}\r\n");
      out.write("\r\n");
      out.write("body { font-family:\"Verdana\", \"Arial\", \"Helvetica\", \"sans-serif\"; font-size: 9pt}\r\n");
      out.write("\r\n");
      out.write("p {  font-family:\"Verdana\", \"Arial\", \"Helvetica\", \"sans-serif\"; font-size: 9pt}\r\n");
      out.write("\r\n");
      out.write("td {  font-family: \"Verdana\", \"Arial\", \"Helvetica\", \"sans-serif\"; font-size: 9pt}\r\n");
      out.write("\r\n");
      out.write("#main_container{\r\n");
      out.write("\twidth: 960px;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("#header{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("#header #navigation{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop:50px;\r\n");
      out.write("\tleft:400px;\r\n");
      out.write("}\r\n");
      out.write("#navigation ul li{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tmargin-left: 10px\r\n");
      out.write("}\r\n");
      out.write("#navigation ul li a{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth:110px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#content{\r\n");
      out.write("\ttop: 25px;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table, th, td{\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write(".tableHeaders {\r\n");
      out.write("\tbackground-color: #29a8cd;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY background=./image/blackground.gif bgColor=#ffffff>\r\n");
      out.write("<TABLE border=0 cellPadding=0 cellSpacing=0 height=55 width=1175>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD background=./image/top.gif colSpan=2 rowSpan=2>\r\n");
      out.write("      <DIV align=center><b><font color=\"#ffffcc\" size=\"5\" face=\"Arial, Helvetica, sans-serif\">Exam Schedule</font></b></DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("    <TD bgColor=#00b2eb height=1 width=868><IMG height=1 src=\"./image/pixel.gif\" width=1></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD bgColor=#ffffff vAlign=bottom>\r\n");
      out.write("      <DIV align=right></DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE width=\"1166\" height=\"608\" border=0 cellPadding=0 cellSpacing=0>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD colSpan=2 height=24>&nbsp;</TD>\r\n");
      out.write("    <TD bgColor=#00b2eb rowSpan=9 width=10><IMG height=1 src=\"./image/pixel.gif\" width=1> </TD>\r\n");
      out.write("    <TD rowSpan=6 width=10>&nbsp;</TD>\r\n");
      out.write("    <TD height=24 width=997>&nbsp;</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD colSpan=2 vAlign=top>\r\n");
      out.write("      <TABLE align=right border=0 cellPadding=4 cellSpacing=4 height=270 width=141>\r\n");
      out.write("        <TR bgColor=#29a8cd>\r\n");
      out.write("          <TD>\r\n");
      out.write("            <DIV align=center><B><a href=\"userViewR.jsp\"><FONT color=#ffffff size=2>My Reservation</FONT></A></B></DIV>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR bgColor=#35a8a5>\r\n");
      out.write("          <TD>\r\n");
      out.write("            <DIV align=center><b><a href=\"userReserve.jsp\"><font color=\"#ffffff\" size=\"2\">New Reservation</font></a></b></DIV>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR bgColor=#37a67c>\r\n");
      out.write("          <TD>\r\n");
      out.write("            <DIV align=center><b><a href=\"userResetPSW.jsp\"><font color=\"#ffffff\" size=\"2\">Change Password</font></a></b></DIV>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("        <TR bgColor=#339966>\r\n");
      out.write("          <TD>\r\n");
      out.write("\t\t\t<DIV align=center><p><b><a href=\"userLogin.jsp\"><font color=\"#ffffff\" size=\"2\">LOG OUT</font></a></b></p></DIV>\r\n");
      out.write("\t\t  </TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TABLE>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      <P align=right>&nbsp;</P>\r\n");
      out.write("\t</TD>\r\n");
      out.write("    <td width=\"997\" valign=\"top\">\r\n");
      out.write("\t\t<p><div id=\"main_container\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("                            \r\n");
      out.write("<!--Reservation -->\r\n");

    session = request.getSession();
    int cID = (Integer)session.getAttribute("cID"); //convert to int doesn't work here.
    //int cID = 8999;
    ArrayList<ReservationJeff> reservations = new ArrayList<ReservationJeff>();
    try{
        Database db = Database.getDatabase();
        reservations = db.getReservation(cID);
    }catch(Exception e){
    
    }
    session.setAttribute("reservations", reservations);
    
      out.write("\r\n");
      out.write("\t\t\t\t<h2>Reservations</h2>\r\n");
      out.write("                                <form method=\"get\" action=\"Change\">\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                                    <th class=\"tableHeaders\"></th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Reservation ID</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">User ID</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Starting</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Ending</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Room Type</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Quantity</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Special Request</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                        ");

    Date today = new Date();
for(ReservationJeff res: reservations){
    if(today.before(res.starting)){
                                
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <td><input type=\"radio\" name=\"reservation\" value=\"");
      out.print(res.rID);
      out.write("\"></td>\r\n");
      out.write("                                <td>");
      out.print(res.rID );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.uID );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.starting );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.ending );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.rType );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.rQuantity );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.spRequest );
      out.write("</td>\r\n");
      out.write("                                \r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");

    }
                            }

      out.write("                            \r\n");
      out.write("\t\t</table>\r\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"change\"/>\r\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"delete\"/>\r\n");
      out.write("                                </FORM>              \r\n");
      out.write("                                \r\n");
      out.write("<!--History -->                               \r\n");
      out.write("\t\t<h2>History</h2>\t\r\n");
      out.write("\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <th class=\"tableHeaders\">Reservation ID</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">User ID</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Starting</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Ending</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Room Type</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Quantity</th>\r\n");
      out.write("                                    <th class=\"tableHeaders\">Special Request</th>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t");

    
for(ReservationJeff res: reservations){
    if(today.after(res.starting)){
                                
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                                <td>");
      out.print(res.rID );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.uID );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.starting );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.ending );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.rType );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.rQuantity );
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(res.spRequest );
      out.write("</td>\r\n");
      out.write("                                \r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");

    }
                            }

      out.write("                            \r\n");
      out.write("                </table>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</p>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td colspan=\"2\" rowspan=\"4\">&nbsp;</td>\r\n");
      out.write("    <td width=\"997\" valign=\"bottom\" rowspan=\"4\"> \r\n");
      out.write("      <div align=\"right\"> \r\n");
      out.write("        <table width=\"480\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"29\" background=\"image/button5.gif\">\r\n");
      out.write("          <tr valign=\"top\"> \r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div align=\"center\"> </div>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr> </tr>\r\n");
      out.write("  <tr> </tr>\r\n");
      out.write("  <tr> </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
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
