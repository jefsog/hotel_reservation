package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import _db._DB;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import _model.Room;

public final class adminViewRooms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Rooms</h2>\r\n");
      out.write("        <form method=\"GET\" name=\"viewRooms\" action=\"ViewRooms\">\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th class=\"thead\"></th>\r\n");
      out.write("                    <th class=\"thead\">Room Number</th>\r\n");
      out.write("                    <th class=\"thead\">Room Type</th>\r\n");
      out.write("                    <th class=\"thead\">Specification</th>\r\n");
      out.write("                </tr> \r\n");
      out.write("\r\n");
      out.write("                ");
  
                    _DB db = new _DB();
                    List<Room> list = db.getRoomList();           
                        for (Room r : list) {
                            int id = r.getRoomID();
                            String nm = r.getRt().getRoomName();
                            String spec = r.getRoomSpec();
                        
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"radio\" name=\"radRoom\" value=\"");
      out.print(id);
      out.write("\"></td>\r\n");
      out.write("                    <td>");
      out.print(id);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(nm);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(spec);
      out.write("</td>       \r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("            <input type=\"submit\" name=\"btn\" value=\"Add Room\"/>\r\n");
      out.write("            <input type=\"submit\" name=\"btn\" value=\"Edit Room\"/>\r\n");
      out.write("            <input type=\"submit\" name=\"btn\" value=\"Delete Room\"/>\r\n");
      out.write("            <input type=\"submit\" name=\"btn\" value=\"View Reservations\"/>\r\n");
      out.write("            \r\n");
      out.write("        </form>              \r\n");
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
