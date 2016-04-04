package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import _model.RoomType;
import _db._DB;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class _005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    session.invalidate();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/main.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/nav.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/home.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\" defer></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\" defer></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/home.js\" defer></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(images/pattern.png), url(images/santorini_sunset_2.jpg); \">\n");
      out.write("        <!--Header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_header.jsp", out, false);
      out.write("\n");
      out.write("        <!--Navigation-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_navigation.jsp", out, false);
      out.write("\n");
      out.write("        <!--Login-->\n");
      out.write("        <div id=\"loginGroup\">\n");
      out.write("            <form method=\"post\" action=\"Login_Signup\">\n");
      out.write("                <input class=\"txtGroup\" type=\"text\" name=\"user_name\" placeholder=\"username\">\n");
      out.write("                <input class=\"txtGroup\" type=\"password\" name=\"password\" placeholder=\"password\">\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Login\" class=\"btn\" id=\"btnLogIn\">\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Sign up\" class=\"btn\" id=\"btnSignUp\">\n");
      out.write("                <div id=\"error\">\n");
      out.write("                    ");

                        if (request.getAttribute("error") != null) {
                            out.print(request.getAttribute("error"));
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"checkGroup\">   \n");
      out.write("            <form method=\"get\" action=\"CheckAvailable\">\n");
      out.write("                <h3>Check Availability</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <input class=\"txtGroup\" name=\"txtCheckIn\" type=\"text\" id=\"checkIn\" placeholder=\"Check in\"/>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <input class=\"txtGroup\" name=\"txtCheckOut\" type=\"text\" id=\"checkOut\" placeholder=\"Check out\"/> \n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <select name=\"ddlNumRooms\" class=\"ddlGroup\">\n");
      out.write("                            <option class=\"opt\" value=\"\" selected disabled>Number of rooms</option>\n");
      out.write("                            <option class=\"opt\" value=\"1\">1</option>\n");
      out.write("                            <option class=\"opt\" value=\"2\">2</option>\n");
      out.write("                            <option class=\"opt\" value=\"3\">3</option>\n");
      out.write("                            <option class=\"opt\" value=\"4\">4</option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("\n");
      out.write("                        <select name=\"ddlRoomTypes\" class=\"ddlGroup\">\n");
      out.write("                            <option value=\"\" selected disabled>Room Type</option>\n");
      out.write("                            ");

                                _DB db = new _DB();
                                List<RoomType> lst = db.getRoomTypeList();
                                for (RoomType r : lst) {
                                    String val = r.getRoomName();
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(val);
      out.write('"');
      out.write('>');
      out.print(val);
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>                 \n");
      out.write("                    </li>\n");
      out.write("                </ul>        \n");
      out.write("                <input type=\"submit\" name=\"btnCheck\" value=\"Check Availability\" class=\"btn\" id=\"btnCheckAvail\"/><br/>  \n");
      out.write("                <div id=\"message\">\n");
      out.write("                    ");

                        if (request.getAttribute("msg") != null) {
                            out.print(request.getAttribute("msg"));
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!--Footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
