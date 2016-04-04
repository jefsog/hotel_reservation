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
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/_menu.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/_rooms.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/pattern.png), url(images/room_3_.jpg); ">

        <!--Navigation-->
        <jsp:include page="_menu.jsp"/>             
        <h3>Rooms</h3>
        <div class="roomGroup">
            <div class="indivRoom fadeIn animated">
                <h4 class="fadeInDown animated">King</h4>
                <h5 class="fadeInDown animated">$399</h5>
                <p class="fadeIn animated">
                    The king rooms at our Royal Inn are 260 square feet and feature one king size bed. 
                    The bathrooms have a shower/bathtub combination or a separate bathtub and shower. 
                    I am happy to inform you that rollaway beds are allowed in these rooms.
                </p>
            </div>
            <div class="indivRoom fadeIn animated">
                <h4 class="fadeInDown animated">Two Queen</h4>
                <h5 class="fadeInDown animated">$299</h5>
                <p class="fadeIn animated">
                    This room accommodation  is 215 square feet and feature two queen size bed. 
                    The bathrooms have a shower/bathtub combination. 
                    Unfortunately, rollaway beds are not allowed in these hotel rooms.
                </p>
            </div>
            <div class="indivRoom fadeIn animated">
                <h4 class="fadeInDown animated">One Queen</h4>
                <h5 class="fadeInDown animated">$199</h5>
                <p class="fadeIn animated">
                    The Standard rooms at our Royal Inn are 195 square feet and feature one queen size bed. 
                    The bathrooms have a stand-alone shower or a shower/bathtub combination. 
                    I must inform you, though, that rollaway beds are not allowed in these hotel rooms.
                </p>
            </div>
        </div>

        <!--Footer-->
        <jsp:include page="//_footer.jsp"/>
    </body>
</html>
