<%-- 
    Document   : userRegister
    Created on : Mar 10, 2016, 8:01:51 PM
    Author     : Jeff_2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/loginForm.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">

        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>

        <div id="header">
            <h1>Please enter new credentials</h1>
        </div>

        <div id="frmGroup">
            <form action="Register" method="post">
                <%
                    String user_name = "";
                    if (request.getParameter("user_name") != null) {
                        user_name = request.getParameter("user_name");
                    }

                %>
                <div class="txt">
                    <label>Username:</label>
                    <input class="txtGroup" type="text" name="user_name" value="<%=user_name%>">
                </div>

                <div class="txt">
                    <label>New Password:</label>
                    <input class="txtGroup" type="password" name="password1">
                </div>

                <div class="txt">
                    <label>Retype New Password: </label>
                    <input class="txtGroup" type="password" name="password2">
                </div>   

                <input class="btn" type="submit" name="submit" value="Register">
                <div id="message">
                    <% if (request.getAttribute("error") != null) {
                    out.print(request.getAttribute("error"));
                }%>
                </div>
            </form>
        </div>

        <!--Footer-->
        <jsp:include page="_footer.jsp"/>                 
    </body>
</html>

