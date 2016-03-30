<%--
    Document   : userLogin
    Created on : Mar 10, 2016, 7:40:52 PM
    Author     : Jeff_2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% session.invalidate(); //invalidate all the sessions %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/loginForm.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">
        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>

        <div id="header">
            <h1>Please Enter Login Credentials</h1>
        </div>
        <div id="frmGroup">
            <form method="post" action="Login">

                <div class="txt">
                    <label>Username: </label>
                    <input class="txtGroup" type="text" name="user_name">
                </div>
                <div class="txt">
                    <label>Password: </label> 
                    <input class="txtGroup" type="password" name="password">
                </div>
                <input class="btn" type="submit" name="submit" value="Login">
            </form>
            <div id="message">
                <% if (request.getAttribute("error") != null) {
                        out.print(request.getAttribute("error"));
                    }%>
            </div>
        </div>

        <!--Footer-->
        <jsp:include page="_footer.jsp"/>
    </body>
</html>

