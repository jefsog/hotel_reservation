<%-- 
    Document   : adminViewReservations
    Created on : Mar 21, 2016, 8:47:27 PM
    Author     : Trisha
--%>

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
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/adminVw.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">
        
        <div class="tableForm">
        <h1>Reservations</h1>
        <form method="GET" name="viewReservations" action="ViewReservations">
            <table border="1">
                <thead>
                <tr>          
                    <th class="thead">Reservation ID</th>
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
                    _DB db = new _DB();
                   // Date today = new Date();
                    List<ReservationJeff> list = db.getReservationList();
                    for (ReservationJeff res : list) {
                    //    if (today.before(res.starting)) {
                %>
                <tr>
                    <td><%=res.rID%></td>
                    <td><%=res.uID%></td>
                    <td><%=res.starting%></td>
                    <td><%=res.ending%></td>
                    <td><%=res.rType%></td>
                    <td><%=res.rQuantity%></td>
                    <td><%=res.room.getRt().getRoomPrice()%></td>
                    <td><%=res.spRequest%></td>  
                </tr>
                <%
                 //   }
                }%>
                </tbody>
            </table>
            <input class="btns" type="submit" name="btn" value="Go Back"/>
        </form>   
        </div>
    </body>
</html>
