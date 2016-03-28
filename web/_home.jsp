<%-- 
    Document   : home
    Created on : Mar 23, 2016, 11:08:46 AM
    Author     : Trisha
--%>

<%@page import="java.util.List"%>
<%@page import="_model.RoomType"%>
<%@page import="_db._DB"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/home.css" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js" defer></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js" defer></script>
        <script type="text/javascript" src="js/home.js" defer></script>
    </head>
    <body style="background-image: url(images/pattern.png), url(images/santorini_sunset.jpg); ">
        <!--Header-->
        <jsp:include page="_header.jsp"/>
        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>



        <!--Login-->
        <div id="loginGroup">
            <form method="post" action="Login">
                <input class="txtGroup" type="text" name="user_name" placeholder="username">
                <input class="txtGroup" type="password" name="password" placeholder="password">
                <input type="submit" name="Login" value="Login" class="btn" id="btnLogIn">
            </form>
        </div>

        <div id="checkGroup">   
            <form method="get" action="CheckAvailable">
                <h3>Check Availability</h3>
                <ul>
                    <li>
                        <input class="txtGroup" name="txtCheckIn" type="text" id="checkIn" placeholder="Check in"/>
                    </li>
                    <li>
                        <input class="txtGroup" name="txtCheckOut" type="text" id="checkOut" placeholder="Check out"/> 

                    </li>

                    <li>
                        <select name="ddlNumRooms" class="ddlGroup">
                            <option value="" selected disabled>Number of rooms</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                        </select>

                    </li>
                    <li>

                        <select name="ddlRoomTypes" class="ddlGroup">
                            <option value="" selected disabled>Room Type</option>
                            <%
                                _DB db = new _DB();
                                List<RoomType> lst = db.getRoomTypeList();
                                for (RoomType r : lst) {
                                    String val = r.getRoomName();
                            %>
                            <option value="<%=val%>"><%=val%></option>
                            <%}%>
                        </select>                 
                    </li>
                </ul>        
                <input type="submit" name="btnCheck" value="Check Availability" class="btn" id="btnCheckAvail"/><br/>           
            </form>
        </div>
        <div id="message">
            <%
                if (request.getAttribute("msg") != null) {
                    out.print(request.getAttribute("msg"));
                }
            %>
        </div>
        <!--Footer-->
        <jsp:include page="_footer.jsp"/>
    </body>

</html>
