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
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Reservations</h2>
        <form method="GET" name="viewReservations" action="ViewReservations">
            <table border="1">
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

            </table>
            <input type="submit" name="btn" value="Go Back"/>
        </form>              
    </body>
</html>
