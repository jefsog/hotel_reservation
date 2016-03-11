package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<TITLE>Login</TITLE>\n");
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
      out.write("-->\n");
      out.write("\n");
      out.write("</STYLE>\n");
      out.write("</HEAD>\n");
      out.write("<BODY background=./image/blackground.gif bgColor=#ffffff>\n");
      out.write("<TABLE width=1382 height=55 border=0 cellPadding=0 cellSpacing=0>\n");
      out.write("  <TR>\n");
      out.write("    <TD background=./image/top.gif colSpan=2 rowSpan=2>\n");
      out.write("      <DIV align=center><b><font color=\"#ffffcc\" size=\"5\" face=\"Arial, Helvetica, sans-serif\">Exam Schedule</font></b></DIV>\n");
      out.write("\t</TD>\n");
      out.write("    <TD bgColor=#00b2eb height=1 width=1145><IMG height=1 src=\"./image/pixel.gif\" width=1></TD>\n");
      out.write("  </TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD bgColor=#ffffff vAlign=bottom>\n");
      out.write("      <DIV align=right></DIV>\n");
      out.write("\t</TD>\n");
      out.write("  </TR>\n");
      out.write("</TABLE>\n");
      out.write("<TABLE width=865 height=\"341\" border=0 cellPadding=0 cellSpacing=0>\n");
      out.write("  <TR>\n");
      out.write("    <TD colSpan=2 height=24 width=244>&nbsp;</TD>\n");
      out.write("    <TD bgColor=#00b2eb rowSpan=9 width=1><IMG height=1 src=\"./image/pixel.gif\" width=1> </TD>\n");
      out.write("    <TD rowSpan=6 width=10>&nbsp;</TD>\n");
      out.write("    <TD height=24 width=495>&nbsp;</TD>\n");
      out.write("  </TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD colSpan=2 vAlign=top width=244><P align=right>&nbsp;</P>\n");
      out.write("\t</TD>\n");
      out.write("    <td width=\"494\" valign=\"top\"> \n");
      out.write("      <table width=\"480\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("        <tr> \n");
      out.write("          <td colspan=\"3\"> \n");
      out.write("            <div align=\"center\"><font face=\"Times New Roman, Times, serif\"><b><font face=\"Courier New, Courier, mono\">Please Enter Login Credentials</font></b></font></div>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr> \n");
      out.write("          <td width=\"150\" height=\"18\"> \n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("          </td>\n");
      out.write("          <td colspan=\"2\">&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("        <form method=\"get\" action=\"Login\">\n");
      out.write("        <tr> \n");
      out.write("          <td colspan=\"3\"> \n");
      out.write("              <div align=\"center\"> \n");
      out.write("                <blockquote> username: \n");
      out.write("                  <input type=\"text\" name=\"user_name\">\n");
      out.write("                </blockquote>\n");
      out.write("              </div>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr> \n");
      out.write("          <td colspan=\"3\"> \n");
      out.write("              <div align=\"center\"> \n");
      out.write("                <blockquote> password: \n");
      out.write("                  <input type=\"password\" name=\"password\">\n");
      out.write("                </blockquote>\n");
      out.write("              </div>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr> \n");
      out.write("          <td colspan=\"3\"> \n");
      out.write("              <div align=\"center\"> \n");
      out.write("                <input type=\"submit\" name=\"Login\" value=\"Login\">\n");
      out.write("              </div>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
      out.write("      </table>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr> \n");
      out.write("    <td colspan=\"2\" rowspan=\"4\" width=\"244\">&nbsp;</td>\n");
      out.write("    <td width=\"494\" valign=\"bottom\" rowspan=\"4\"> \n");
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
      out.write("\n");
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
