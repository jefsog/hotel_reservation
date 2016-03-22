package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userResetPSW_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Change User Password</TITLE>\r\n");
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
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY background=./image/blackground.gif bgColor=#ffffff>\r\n");
      out.write("<TABLE width=1382 height=55 border=0 cellPadding=0 cellSpacing=0>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD background=./image/top.gif colSpan=2 rowSpan=2>\r\n");
      out.write("      <DIV align=center><b><font color=\"#ffffcc\" size=\"5\" face=\"Arial, Helvetica, sans-serif\">Change Password</font></b></DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("    <TD bgColor=#00b2eb height=1 width=1145><IMG height=1 src=\"./image/pixel.gif\" width=1></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD bgColor=#ffffff vAlign=bottom>\r\n");
      out.write("      <DIV align=right></DIV>\r\n");
      out.write("\t</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE width=865 height=\"341\" border=0 cellPadding=0 cellSpacing=0>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD colSpan=2 height=24 width=244>&nbsp;</TD>\r\n");
      out.write("    <TD bgColor=#00b2eb rowSpan=9 width=1><IMG height=1 src=\"./image/pixel.gif\" width=1> </TD>\r\n");
      out.write("    <TD rowSpan=6 width=10>&nbsp;</TD>\r\n");
      out.write("    <TD height=24 width=495>&nbsp;</TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD colSpan=2 vAlign=top width=244><P align=right>&nbsp;</P>\r\n");
      out.write("\t</TD>\r\n");
      out.write("    <td width=\"494\" valign=\"top\"> \r\n");
      out.write("      <table width=\"480\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td colspan=\"3\"> \r\n");
      out.write("            <div align=\"center\"><font face=\"Times New Roman, Times, serif\"><b><font face=\"Courier New, Courier, mono\">Please enter new credentials</font></b></font></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td width=\"150\" height=\"18\"> \r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("            <p>&nbsp;</p>\r\n");
      out.write("          </td>\r\n");
      out.write("          <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <form action=\"ResetPSW\" method=\"get\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td colspan=\"3\"> \r\n");
      out.write("              <div align=\"left\"> \r\n");
      out.write("                <blockquote>User     ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("                    ");

                        String user_name = "";
                        
                        if(session.getAttribute("cID") != null){
                            Integer cID = (Integer)session.getAttribute("cID");
                            user_name = cID.toString();
                        }
                        
      out.write("\r\n");
      out.write("                        <label name=\"userID\">");
      out.print(user_name);
      out.write("</LABEL>\r\n");
      out.write("                </blockquote>\r\n");
      out.write("              </div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td colspan=\"3\"> \r\n");
      out.write("              <div align=\"left\"> \r\n");
      out.write("                <blockquote>New Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("                  <input type=\"password\" name=\"password1\">\r\n");
      out.write("                </blockquote>\r\n");
      out.write("              </div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td colspan=\"3\"> \r\n");
      out.write("              <div align=\"left\"> \r\n");
      out.write("                <blockquote> Retype New Password: \r\n");
      out.write("                  <input type=\"password\" name=\"password2\">\r\n");
      out.write("                </blockquote>\r\n");
      out.write("              </div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td colspan=\"3\"> \r\n");
      out.write("              <div align=\"center\"> \r\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"reset\">\r\n");
      out.write("                ");
 if(request.getAttribute("error")!=null) out.print(request.getAttribute("error"));
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("      </table>\r\n");
      out.write("          \r\n");
      out.write("\t      </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td colspan=\"2\" rowspan=\"4\" width=\"244\">&nbsp;</td>\r\n");
      out.write("    <td width=\"494\" valign=\"bottom\" rowspan=\"4\"> \r\n");
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
      out.write("                    \r\n");
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
