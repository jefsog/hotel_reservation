<%-- 
    Document   : userReserve
    Created on : Mar 12, 2016, 5:28:17 PM
    Author     : Jeff_2
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservation Request</title>
        <link rel="stylesheet" href="Styles/adminAdd_Edit.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userForm.css" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js" defer></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js" defer></script>
        <script type="text/javascript" src="js/home.js" defer></script>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">
        <%
            session = request.getSession();
            String username = session.getAttribute("username").toString();
        %>
        <div id="header">
            <h1>Reservation Request</h1>
        </div>
        <div id="frmGroup">
            <form action="Reserve" method="get">
                <!--<label class="label">Arrival date</label>
                <%--
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");

                Date arrival = new Date();
                String date = sdf.format(arrival);
                --%>
                <input name="txtArrivalDate" type="text" value="<%--=date--%>" id="txtArrivalDate" />
                <br>    
                <label class="label">Departure date</label>
                <input name="txtDepartureDate" type="text" id="txtDepartureDate" />
                <br>  -->  

                <!--MODIFIED DATE INPUT-->
                <input class="txtGroup" name="txtCheckIn" type="text" id="checkIn" placeholder="Check in"/>

                <input class="txtGroup" name="txtCheckOut" type="text" id="checkOut" placeholder="Check out"/>
                <!--END-->

                <select name="ddlNumRooms" class="ddlGroup">
                    <option value="" selected disabled>Number of rooms</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                </select>         

                <div id="typeGroup">
                    <h3>Room type:</h3>

                    <input id="radKing" type="radio" name="Bed" value="King" checked="checked" />
                    <label>King</label>


                    <input id="radTQueen" type="radio" name="Bed" value="Two Queens" />
                    <label>Two Queens</label>

                    <input id="radOQueen" type="radio" name="Bed" value="One Queen" />
                    <label>One Queen</label>
                </div>
                <div id="specialReqs">
                    <h3>Special requests</h3>
                    <textarea name="txtSpecialRequests" rows="2" cols="20" id="txtSpecialRequests">
                    </textarea>
                </div>


                <input type="submit" name="btnSubmit" value="Submit" id="btnSubmit" class="btn" /><br/>

                <div id="message">
                    <%
                        if (request.getAttribute("msg") != null) {
                            out.print(request.getAttribute("msg"));
                        }
                    %>
                </div>
            </form>
        </div>
    </body>
</html>
