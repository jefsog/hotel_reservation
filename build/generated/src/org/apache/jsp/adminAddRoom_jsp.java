package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import _model.RoomType;
import _db.Room_DB;

public final class adminAddRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hotel</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <h1>Add Room</h1>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"frmGroup\">\n");
      out.write("            <form method=\"GET\" name=\"addForm\" action=\"AddRoom\">\n");
      out.write("                <div id=\"radRoomType\">\n");
      out.write("                    <label>Room Type:</label>\n");
      out.write("                    ");

                        Room_DB db = new Room_DB();
                        List<RoomType> list = db.getRoomTypes();
                        for(RoomType rt : list){
                            String nm = rt.getRoomName();
                        
                    
      out.write("\n");
      out.write("                    <input type=\"radio\" name=\"radRoom\" value=\"");
      out.print( nm);
      out.write("\" checked >");
      out.print( nm);
      out.write("<br/>      \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"radRoomNum\">\n");
      out.write("                    <label>Room Number:</label>       \n");
      out.write("                    <input type=\"text\" name=\"txtRoomNum\"/><br/> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"specs\">\n");
      out.write("                    <label>Specifications:</label>\n");
      out.write("                    <input type=\"radio\" name=\"radSmoke\" value=\"Non-Smoking\" checked>Non-smoking<br/>\n");
      out.write("                    <input type=\"radio\" name=\"radSmoke\" value=\"Smoking\"  >Smoking<br/>\n");
      out.write("                    <textarea name=\"txtSpecs\" rows=\"2\" cols=\"20\"></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id =\"btnGroup\">\n");
      out.write("                    <input class=\"buttons\" type=\"reset\" name=\"btnReset\" value=\"Reset\"/>\n");
      out.write("                    <input class=\"buttons\" type=\"submit\" name=\"btnAdd\" value=\"Add\"/>\n");
      out.write("                </div>       \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
