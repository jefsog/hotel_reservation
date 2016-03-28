<%-- 
    Document   : rooms
    Created on : Mar 25, 2016, 10:33:14 PM
    Author     : Trisha
--%>

<%@page import="_model.RoomType"%>
<%@page import="java.util.List"%>
<%@page import="_db._DB"%>
<%@page import="_model.Room"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rooms</title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/rooms.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/pattern.png), url(images/room_2.jpg); ">
        <!--Header-->
        <jsp:include page="_header.jsp"/>

        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>
        
        <div id="roomGroup">
            <h3>Rooms</h3>
            <div class="roomKing">
                <label>King <span>$399</span></label>
                <label>Specifications:</label>

                <p></p>
            </div>
            <div class="roomTwoQueen">
                <label>Two Queen <span>$299</span></label>
                <label>Specifications:</label>
                
                <p></p>
            </div>
            <div class="roomOneQueen">
                <label>One Queen <span>$199</span></label>
                <label>Specifications:</label>

                <p></p>
            </div>
        </div>

        <!--Footer-->
        <jsp:include page="//_footer.jsp"/>
    </body>
</html>
