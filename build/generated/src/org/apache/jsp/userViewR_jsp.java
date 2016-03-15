package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>My Schedule</TITLE>\n");
      out.write("<META content=\"Cutepage 2.0\" name=GENERATOR></HEAD>\n");
      out.write("<META content=\"text/html; charset=iso-8859-1\" http-equiv=Content-Type>\n");
      out.write("<STYLE type=text/css>\n");
      out.write("<!--\n");
      out.write("A:link {text-decoration:none; color:\"#0000ff\"}\n");
      out.write("A:visited {text-decoration:none}\n");
      out.write("A:hover {text-decoration:underline; color:\"#FF0033\"}\n");
      out.write("\n");
      out.write("body { font-family:\"Verdana\", \"Arial\", \"Helvetica\", \"sans-serif\"; font-size: 9pt}\n");
      out.write("\n");
      out.write("p {  font-family:\"Verdana\", \"Arial\", \"Helvetica\", \"sans-serif\"; font-size: 9pt}\n");
      out.write("\n");
      out.write("td {  font-family: \"Verdana\", \"Arial\", \"Helvetica\", \"sans-serif\"; font-size: 9pt}\n");
      out.write("\n");
      out.write("#main_container{\n");
      out.write("\twidth: 960px;\n");
      out.write("\tmargin-left: auto;\n");
      out.write("\tmargin-right: auto;\n");
      out.write("}\n");
      out.write("#header{\n");
      out.write("\tposition:relative;\n");
      out.write("\t\t\n");
      out.write("}\n");
      out.write("#header #navigation{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop:50px;\n");
      out.write("\tleft:400px;\n");
      out.write("}\n");
      out.write("#navigation ul li{\n");
      out.write("\tfloat:left;\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin-left: 10px\n");
      out.write("}\n");
      out.write("#navigation ul li a{\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth:110px;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("#content{\n");
      out.write("\ttop: 25px;\n");
      out.write("\tposition:relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table, th, td{\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("\tpadding: 10px;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write(".tableHeaders {\n");
      out.write("\tbackground-color: #29a8cd;\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</STYLE>\n");
      out.write("</HEAD>\n");
      out.write("<BODY background=./image/blackground.gif bgColor=#ffffff>\n");
      out.write("<TABLE border=0 cellPadding=0 cellSpacing=0 height=55 width=1175>\n");
      out.write("  <TR>\n");
      out.write("    <TD background=./image/top.gif colSpan=2 rowSpan=2>\n");
      out.write("      <DIV align=center><b><font color=\"#ffffcc\" size=\"5\" face=\"Arial, Helvetica, sans-serif\">Exam Schedule</font></b></DIV>\n");
      out.write("\t</TD>\n");
      out.write("    <TD bgColor=#00b2eb height=1 width=868><IMG height=1 src=\"./image/pixel.gif\" width=1></TD>\n");
      out.write("  </TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD bgColor=#ffffff vAlign=bottom>\n");
      out.write("      <DIV align=right></DIV>\n");
      out.write("\t</TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("<TABLE width=\"1166\" height=\"608\" border=0 cellPadding=0 cellSpacing=0>\n");
      out.write("  <TR>\n");
      out.write("    <TD colSpan=2 height=24>&nbsp;</TD>\n");
      out.write("    <TD bgColor=#00b2eb rowSpan=9 width=10><IMG height=1 src=\"./image/pixel.gif\" width=1> </TD>\n");
      out.write("    <TD rowSpan=6 width=10>&nbsp;</TD>\n");
      out.write("    <TD height=24 width=997>&nbsp;</TD>\n");
      out.write("  </TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD colSpan=2 vAlign=top>\n");
      out.write("      <TABLE align=right border=0 cellPadding=4 cellSpacing=4 height=270 width=141>\n");
      out.write("        <TR bgColor=#29a8cd>\n");
      out.write("          <TD>\n");
      out.write("            <DIV align=center><B><a href=\"instructor_exam_schedule.php\"><FONT color=#ffffff size=2>My Schedule</FONT></A></B></DIV>\n");
      out.write("\t\t  </TD>\n");
      out.write("\t\t</TR>\n");
      out.write("        <TR bgColor=#35a8a5>\n");
      out.write("          <TD>\n");
      out.write("            <DIV align=center><b><a href=\"instructor_set_schedule.php\"><font color=\"#ffffff\" size=\"2\">Set Course Schedule</font></a></b></DIV>\n");
      out.write("\t\t  </TD>\n");
      out.write("\t\t</TR>\n");
      out.write("        <TR bgColor=#37a67c>\n");
      out.write("          <TD>\n");
      out.write("            <DIV align=center><b><a href=\"instructor_change_passwd.php\"><font color=\"#ffffff\" size=\"2\">Change Password</font></a></b></DIV>\n");
      out.write("\t\t  </TD>\n");
      out.write("\t\t</TR>\n");
      out.write("        <TR bgColor=#339966>\n");
      out.write("          <TD>\n");
      out.write("\t\t\t<DIV align=center><p><b><a href=\"logout.php\"><font color=\"#ffffff\" size=\"2\">LOG OUT</font></a></b></p></DIV>\n");
      out.write("\t\t  </TD>\n");
      out.write("        </TR>\n");
      out.write("      </TABLE>\n");
      out.write("      <P align=right>&nbsp;</P>\n");
      out.write("\t</TD>\n");
      out.write("    <td width=\"997\" valign=\"top\">\n");
      out.write("\t\t<p><div id=\"main_container\">\n");
      out.write("\t\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<h1>Current Schedule</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t<h2>To Schedule</h2>\n");
      out.write("\t\t\t\t<table border=\"1\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Course_Section_ID</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Course_Name</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Faculty_Name</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<h2>Already Scheduled</h2>\t\n");
      out.write("\t\t<table border=\"1\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Course Section_ID</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Course Name</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Faculty Name</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Date</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Time Period</th>\n");
      out.write("\t\t\t\t\t<th class=\"tableHeaders\">Class Room</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t\t<td>2111</td>\n");
      out.write("\t\t\t\t<td>English</td>\n");
      out.write("\t\t\t\t<td>jeff</td>\n");
      out.write("\t\t\t\t<td>Mon</td>\n");
      out.write("\t\t\t\t<td>08-10</td>\n");
      out.write("\t\t\t\t<td>E417</td>\n");
      out.write("\t\t\t\t</tr><tr>\n");
      out.write("\t\t\t\t<td>2222</td>\n");
      out.write("\t\t\t\t<td>Philosophy</td>\n");
      out.write("\t\t\t\t<td>jeff</td>\n");
      out.write("\t\t\t\t<td>Mon</td>\n");
      out.write("\t\t\t\t<td>08-10</td>\n");
      out.write("\t\t\t\t<td>J129</td>\n");
      out.write("\t\t\t\t</tr><tr>\n");
      out.write("\t\t\t\t<td>2666</td>\n");
      out.write("\t\t\t\t<td>Maths</td>\n");
      out.write("\t\t\t\t<td>jeff</td>\n");
      out.write("\t\t\t\t<td>Mon</td>\n");
      out.write("\t\t\t\t<td>08-10</td>\n");
      out.write("\t\t\t\t<td>J132</td>\n");
      out.write("\t\t\t\t</tr>\t\t\t\t</table>\t\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</p>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("  <tr> \n");
      out.write("    <td colspan=\"2\" rowspan=\"4\">&nbsp;</td>\n");
      out.write("    <td width=\"997\" valign=\"bottom\" rowspan=\"4\"> \n");
      out.write("      <div align=\"right\"> \n");
      out.write("        <table width=\"480\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"29\" background=\"image/button5.gif\">\n");
      out.write("          <tr valign=\"top\"> \n");
      out.write("            <td>&nbsp;</td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("      <div align=\"center\"> </div>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr> </tr>\n");
      out.write("  <tr> </tr>\n");
      out.write("  <tr> </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
