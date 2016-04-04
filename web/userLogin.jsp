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
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/_menu.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/_loginRegister.css" type="text/css"/>
    </head>
    <body>
        <!--Navigation-->
        <jsp:include page="_menu.jsp"/>

        <div class="content fadeIn animated">
            <h2 class="slideInDown animated">-Please enter login credentials-</h2>
            <div id="message">
                <% if (request.getAttribute("error") != null) {
                        out.print(request.getAttribute("error"));
                    }%>
            </div>
            <form class = "frm" method="post" action="Login">

                <div class="txt">
                    <label>Username: </label>
                    <input class="txtGroup" type="text" name="user_name">
                </div>
                <div class="txt">
                    <label>Password: </label> 
                    <input class="txtGroup" type="password" name="password">
                </div>
                <input class="btns" type="submit" name="submit" value="Login">
            </form>
        </div>

        <!--Footer-->
        <jsp:include page="_footer.jsp"/>
    </body>
</html>

