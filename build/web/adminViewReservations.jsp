<%-- 
    Document   : adminViewReservations
    Created on : Mar 21, 2016, 8:47:27 PM
    Author     : Trisha
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="logicJeff.ReservationJeff"%>
<%@page import="_db._DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Reservations</title>
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userMain.css" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.12.0.min.js" defer></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js" defer></script>
        <script type="text/javascript" src="js/home.js" defer></script>

    </head>
    <body>
        <%
            _DB db = new _DB();
            Date today = new Date();
            session = request.getSession();
            session.setAttribute("db", db);
            _DB resDB = (_DB) session.getAttribute("resultDB");
            ArrayList<ReservationJeff> list = null;
        %>
        <!--admin menu-->
        <jsp:include page="adminMenu.jsp"/>

        <div class="content fadeIn animated">  
            <%if (resDB == null) {

            %>
            <div class="filter">
                <!--<div class="message">
                <%--if (request.getAttribute("msg") != null) {
                        out.println(request.getAttribute("msg"));
                    }--%>  
            </div>-->
                <form method="get" action="ViewReservationList">


                    <select id="ddlFilter" name="ddlFilter" class="ddlGroup">
                        <option value="" selected disabled>Search by</option>
                        <option class="opt" value="by Date">by Date</option>
                        <option class="opt" value="by Price">by Price</option>
                        <option class="opt" value="by Room Level">by Room Level</option>
                    </select>  

                    <div class="grp">
                        <div id="date_div" class="hidden_divs">
                            <input class="txtGroup" name="txtCheckIn" type="text" id="checkIn" placeholder="Check in">

                            <input class="txtGroup" name="txtCheckOut" type="text" id="checkOut" placeholder="Check out"> 
                            <input class="btns" type="submit" name="btn" value="Search">
                        </div>

                        <div id="price_div" class="hidden_divs">
                            <input id="price_filter" class="txtGroup" name="txtPrice" type="text" placeholder="Price"> 
                            <input class="btns" type="submit" name="btn" value="Search">
                        </div>


                        <div id="room_div" class="hidden_divs">
                            <input type="radio" name="radLevel" value="1" checked>
                            <label class="lbl">1</label>

                            <input type="radio" name="radLevel" value="2" >
                            <label class="lbl">2</label>

                            <input type="radio" name="radLevel" value="3">
                            <label class="lbl">3</label>

                            <input class="btns" type="submit" name="btn" value="Search">
                        </div>
                    </div>
                </form>
            </div>
            <%}%>
            <h2 id="h2" class="slideInDown animated">-Reservations-</h2>
            <table class="tbl">
                <thead>
                    <tr>          
                        <th class="thead">Reservation ID</th>
                        <th class="thead">Room Number</th>
                        <th class="thead">User ID</th>
                        <th class="thead">Starting</th>
                        <th class="thead">Ending</th>
                        <th class="thead">Room Type</th>
                        <th class="thead">Quantity</th>
                        <th class="thead">Price</th>
                        <th class="thead">Special Request</th>
                    </tr>
                </thead>
                <tbody>
                    <%

                        if (resDB != null) {
                            list = resDB.getSearchResultList();
                            session.invalidate();
                        } else {
                            list = db.getReservationList();

                        }
                        for (ReservationJeff res : list) {
                            if (today.before(res.starting)) {

                    %>
                    <tr>
                        <td><%=res.rID%></td>
                        <td><%=res.room.getRoomID()%></td>
                        <td><%=res.uID%></td>
                        <td><%=res.starting%></td>
                        <td><%=res.ending%></td>
                        <td><%=res.rType%></td>
                        <td><%=res.rQuantity%></td>
                        <td>$<%=res.room.getRt().getRoomPrice()%></td>
                        <td><%=res.spRequest%></td>  
                    </tr>
                    <%}
                        }%>
                </tbody>
            </table>
        </div>

    </body>
</html>
