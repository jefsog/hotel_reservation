<%-- 
    Document   : userRegister
    Created on : Mar 10, 2016, 8:01:51 PM
    Author     : Jeff_2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Change User Password</title>
        <META content="Cutepage 2.0" name=GENERATOR>
    </head>
    <META content="text/html; charset=iso-8859-1" http-equiv=Content-Type>
    <STYLE type=text/css>
        <!--
        A:link {text-decoration:none; color:"#0000ff"}
        A:visited {text-decoration:none}
        A:hover {text-decoration:underline; color:"#FF0033"}

        body { font-family:"Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 9pt}

        p {  font-family:"Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 9pt}

        td {  font-family: "Verdana", "Arial", "Helvetica", "sans-serif"; font-size: 9pt}
        -->

    </STYLE>
</HEAD>
<BODY background=./image/blackground.gif bgColor=#ffffff>
    <!--Header-->
    <jsp:include page="_header.jsp"/>

    <!--Navigation-->
    <jsp:include page="_navigation.jsp"/>
    <TABLE width=1382 height=55 border=0 cellPadding=0 cellSpacing=0>
        <TR>
            <TD background=./image/top.gif colSpan=2 rowSpan=2>
                <DIV align=center><b><font color="#ffffcc" size="5" face="Arial, Helvetica, sans-serif">Change Password</font></b></DIV>
            </TD>
            <TD bgColor=#00b2eb height=1 width=1145><IMG height=1 src="./image/pixel.gif" width=1></TD>
        </TR>
        <TR>
            <TD bgColor=#ffffff vAlign=bottom>
                <DIV align=right></DIV>
            </TD>
        </TR>
    </TABLE>
    <TABLE width=865 height="341" border=0 cellPadding=0 cellSpacing=0>
        <TR>
            <TD colSpan=2 height=24 width=244>&nbsp;</TD>
            <TD bgColor=#00b2eb rowSpan=9 width=1><IMG height=1 src="./image/pixel.gif" width=1> </TD>
            <TD rowSpan=6 width=10>&nbsp;</TD>
            <TD height=24 width=495>&nbsp;</TD>
        </TR>
        <TR>
            <TD colSpan=2 vAlign=top width=244><P align=right>&nbsp;</P>
            </TD>
            <td width="494" valign="top"> 
                <table width="480" border="0" cellspacing="0" cellpadding="0">
                    <tr> 
                        <td colspan="3"> 
                            <div align="center"><font face="Times New Roman, Times, serif"><b><font face="Courier New, Courier, mono">Please enter new credentials</font></b></font></div>
                        </td>
                    </tr>
                    <tr> 
                        <td width="150" height="18"> 
                            <p>&nbsp;</p>
                            <p>&nbsp;</p>
                        </td>
                        <td colspan="2">&nbsp;</td>
                    </tr>
                    <form action="Register" method="get">
                        <tr> 
                            <td colspan="3"> 
                                <div align="left"> 
                                    <blockquote>User     Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                                        <%
                                            String user_name = "";
                                            if (request.getParameter("user_name") != null) {
                                                user_name = request.getParameter("user_name");
                                            }

                                        %>
                                        <input type="text" name="user_name" value="<%=user_name%>">
                                    </blockquote>
                                </div>
                            </td>
                        </tr>
                        <tr> 
                            <td colspan="3"> 
                                <div align="left"> 
                                    <blockquote>New Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                                        <input type="password" name="password1">
                                    </blockquote>
                                </div>
                            </td>
                        </tr>
                        <tr> 
                            <td colspan="3"> 
                                <div align="left"> 
                                    <blockquote> Retype New Password: 
                                        <input type="password" name="password2">
                                    </blockquote>
                                </div>
                            </td>
                        </tr>
                        <tr> 
                            <td colspan="3"> 
                                <div align="center"> 
                                    <input type="submit" name="submit" value="Register">
                                    <% if (request.getAttribute("error") != null) {
                        out.print(request.getAttribute("error"));
                    }%>
                                </div>
                            </td>
                        </tr>

                </table>

            </td>
        </tr>
        <tr> 
            <td colspan="2" rowspan="4" width="244">&nbsp;</td>
            <td width="494" valign="bottom" rowspan="4"> 
                <div align="right"> 
                    <table width="480" border="0" cellspacing="0" cellpadding="0" height="29" background="image/button5.gif">
                        <tr valign="top"> 
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                </div>
                <div align="center"> </div>
            </td>
        </tr>
        <tr> </tr>
        <tr> </tr>
        <tr> </tr>
    </table>
    <!--Footer-->
    <jsp:include page="_footer.jsp"/>                 
</body>
</html>

