<%-- 
    Document   : userResetPSW
    Created on : Mar 14, 2016, 1:59:53 PM
    Author     : Jeff_2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userMain.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/user.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userLogin.css" type="text/css"/>
    </head>
    <body>
        <!--user menu-->
        <jsp:include page="userMenu.jsp"/>

        <div class="content fadeIn animated">
            <h2 class="slideInDown animated">—Change Password—</h2>

            <form class="frm" action="ResetPSW" method="post">
                <%
                    String user_name = "";

                    if (session.getAttribute("cID") != null) {
                        Integer cID = (Integer) session.getAttribute("cID");
                        user_name = cID.toString();
                    }
                %>
                <div class="txt">
                    <label>User ID:</label>
                    <div id="name"><%=user_name%></div>
                </div>

                <div class="txt">
                    <label> New Password:</label>
                    <input class="txtGroup" type="password" name="password1">
                </div>

                <div class="txt">
                    <label>Retype New Password: </label>
                    <input class="txtGroup" type="password" name="password2">
                </div>

                <input class="btns" type="submit" name="submit" value="reset">
                <div id="message">
                    <% if (request.getAttribute("error") != null) {
                            out.print(request.getAttribute("error"));
                        }%>
                </div>
            </form>
        </div>  
    </body>
</html>
