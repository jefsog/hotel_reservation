package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class userReserve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"Styles/Main.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"Styles/Request.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <h1>Royal Inns and Suites</h1>\n");
      out.write("        <h2>Where you&rsquo;re always treated like royalty</h2>\n");
      out.write("        </header>\n");
      out.write("        <form>\n");
      out.write("        <h1>Reservation Request</h1>\n");
      out.write("            \n");
      out.write("            <h2>Request data</h2>\n");
      out.write("            <label class=\"label\">Arrival date</label>\n");
      out.write("            ");

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
	
                Date arrival = new Date(); 
                String date = sdf.format(arrival); 
            
      out.write("\n");
      out.write("            <input name=\"txtArrivalDate\" type=\"text\" value=\"");
      out.print(date);
      out.write("\" id=\"txtArrivalDate\" />\n");
      out.write("            <br>    \n");
      out.write("            <label class=\"label\">Departure date</label>\n");
      out.write("            <input name=\"txtDepartureDate\" type=\"text\" id=\"txtDepartureDate\" />\n");
      out.write("            <br>    \n");
      out.write("\n");
      out.write("            <label class=\"label\">Number of room</label>\n");
      out.write("            <select name=\"ddlNoOfPeople\" id=\"ddlNoOfPeople\">\n");
      out.write("                <option value=\"1\">1</option>\n");
      out.write("                <option value=\"2\">2</option>\n");
      out.write("                <option value=\"3\">3</option>\n");
      out.write("                <option value=\"4\">4</option>\n");
      out.write("\n");
      out.write("            </select><br />          \n");
      out.write("\n");
      out.write("            <label class=\"label\">Room type</label><br>\n");
      out.write("            <div style=\"position: relative; left: 130px\">\n");
      out.write("            <input id=\"rdoKing\" type=\"radio\" name=\"Bed\" value=\"rdoKing\" checked=\"checked\" /><label for=\"rdoKing\">King</label>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input id=\"rdoDouble\" type=\"radio\" name=\"Bed\" value=\"rdoDouble\" /><label for=\"rdoDouble\">Two Queens</label>\n");
      out.write("            <br>\n");
      out.write("            <input id=\"rdoSingle\" type=\"radio\" name=\"Bed\" value=\"rdoSingle\" /><label for=\"rdoSingle\">One Queen</label><br />\n");
      out.write("            </div>\n");
      out.write("            <h2>Special requests</h2>\n");
      out.write("            <textarea name=\"txtSpecialRequests\" rows=\"2\" cols=\"20\" id=\"txtSpecialRequests\">\n");
      out.write("            </textarea><br />\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" name=\"btnSubmit\" value=\"Submit\" id=\"btnSubmit\" class=\"button\" />\n");
      out.write("        </form>\n");
      out.write("        </body>\n");
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
