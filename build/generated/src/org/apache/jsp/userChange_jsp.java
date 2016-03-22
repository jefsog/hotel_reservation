package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logicJeff.ReservationJeff;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class userChange_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"Styles/Main.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"Styles/Request.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("        <h1>Royal Inns and Suites</h1>\r\n");
      out.write("        <h2>Where you&rsquo;re always treated like royalty</h2>\r\n");
      out.write("        </header>\r\n");
      out.write("        <form action=\"Update\" method=\"get\">\r\n");
      out.write("        <h1>Reservation Request</h1>\r\n");
      out.write("        ");

            int rID = Integer.parseInt((String)request.getAttribute("rID"));
            session.setAttribute("rID", rID);
            
            ArrayList<ReservationJeff> reservations = 
                    (ArrayList<ReservationJeff>)session.getAttribute("reservations");
            ReservationJeff res = new ReservationJeff();
            for(ReservationJeff rs: reservations){
                if(rID == rs.rID){
                    res = rs;
                }
            }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            <h2>Request data</h2>\r\n");
      out.write("            <label class=\"label\">Reservation ID</label>\r\n");
      out.write("            <label name = \"rID\" value=\"");
      out.print(rID);
      out.write('"');
      out.write('>');
      out.print(rID);
      out.write("</label><br>\r\n");
      out.write("            <label class=\"label\">Arrival date</label>\r\n");
      out.write("            ");

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
	
                Date arrival = new Date(); 
                String date = sdf.format(arrival); 
            
      out.write("\r\n");
      out.write("            <input name=\"txtArrivalDate\" type=\"text\" value=\"");
      out.print(res.starting);
      out.write("\" id=\"txtArrivalDate\" />\r\n");
      out.write("            <br>    \r\n");
      out.write("            <label class=\"label\">Departure date</label>\r\n");
      out.write("            <input name=\"txtDepartureDate\" type=\"text\" value=\"");
      out.print(res.ending);
      out.write("\" id=\"txtDepartureDate\" />\r\n");
      out.write("            <br>    \r\n");
      out.write("\r\n");
      out.write("            <label class=\"label\">Number of room</label>\r\n");
      out.write("            ");

            int n = res.rQuantity;
            String s1=null, s2=null, s3=null, s4=null;
            if(n == 1) s1="selected";
            if(n == 2) s2="selected";
            if(n == 3) s3="selected";
            if(n == 4) s4="selected";
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <select name=\"ddlNoOfPeople\" id=\"ddlNoOfPeople\">\r\n");
      out.write("                <option value=\"1\" ");
      out.print(s1);
      out.write(">1</option>\r\n");
      out.write("                <option value=\"2\" ");
      out.print(s2);
      out.write(">2</option>\r\n");
      out.write("                <option value=\"3\" ");
      out.print(s3);
      out.write(">3</option>\r\n");
      out.write("                <option value=\"4\" ");
      out.print(s4);
      out.write(">4</option>\r\n");
      out.write("\r\n");
      out.write("            </select><br />          \r\n");
      out.write("            ");

            String c1=null,c2=null,c3=null;
            String rt = res.rType;
            if(rt.equals("King")) c1="checked";
            if(rt.equals("Two Queens")) c2="checked";
            if(rt.equals("One Queen")) c3="checked";
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <label class=\"label\">Room type</label><br>\r\n");
      out.write("            <div style=\"position: relative; left: 130px\">\r\n");
      out.write("            <input id=\"rdoKing\" type=\"radio\" name=\"Bed\" value=\"King\" ");
      out.print(c1);
      out.write(" /><label for=\"rdoKing\">King</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            <input id=\"rdoDouble\" type=\"radio\" name=\"Bed\" value=\"Two Queens\" ");
      out.print(c2);
      out.write(" /><label for=\"rdoDouble\">Two Queens</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input id=\"rdoSingle\" type=\"radio\" name=\"Bed\" value=\"One Queen\" ");
      out.print(c3);
      out.write("/><label for=\"rdoSingle\">One Queen</label><br />\r\n");
      out.write("            </div>\r\n");
      out.write("            <h2>Special requests</h2>\r\n");
      out.write("            <textarea name=\"txtSpecialRequests\" rows=\"2\" cols=\"20\"  id=\"txtSpecialRequests\">");
      out.print(res.spRequest);
      out.write("\r\n");
      out.write("            </textarea><br />\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <input type=\"submit\" name=\"btnSubmit\" value=\"Submit\" id=\"btnSubmit\" class=\"button\" />\r\n");
      out.write("        </form>\r\n");
      out.write("        </body>\r\n");
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
