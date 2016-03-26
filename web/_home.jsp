<%-- 
    Document   : home
    Created on : Mar 23, 2016, 11:08:46 AM
    Author     : Trisha
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js" defer></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js" defer></script>
        <script type="text/javascript" src="js/home.js" defer></script>
    </head>
    <body>
        <!--Header-->
        <jsp:include page="_header.jsp"/>

        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>

        <!--Login-->
        <div id="loginGroup">
            <form method="post" action="Login">
                <input type="text" name="user_name" placeholder="username">
                <input type="password" name="password" placeholder="password">
                <input type="submit" name="Login" value="Login">
            </form>
        </div>
        <form method="get" action="CheckAvailable">
            <h2>Check Availability</h2>
            <label for="arrival">Arrival date: </label>&nbsp;
            <input name="txtArrival" type="text" id="arrival"/>
            <br>    
            <label for="depart">Departure date: </label>&nbsp;
            <input name="txtDeparture" type="text" id="depart"/>
            <br>    

            <label>Number of room/s</label>
            <select name="ddlNumRooms">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
            </select><br /> 
            <label class="label">Room type</label><br>
            <div>
                <input id="rdoKing" type="radio" name="radRoom" value="King" checked="checked" /><label>King</label>
                <br>
                <input id="rdoDouble" type="radio" name="radRoom" value="Two Queens" /><label>Two Queens</label>
                <br>
                <input id="rdoSingle" type="radio" name="radRoom" value="One Queen" /><label>One Queen</label>
                <br/>
            </div>
            <input type="submit" name="btnCheck" value="Check Availability"/><br/>
            <%
                if (request.getAttribute("msg") != null) {
                    out.print(request.getAttribute("msg"));
                }
            %>
        </form>
        <!--Footer-->
        <jsp:include page="_footer.jsp"/>
    </body>

</html>
