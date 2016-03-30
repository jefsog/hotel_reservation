<%-- 
    Document   : userViewR
    Created on : Mar 10, 2016, 9:04:25 PM
    Author     : Jeff_2
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="logicJeff.ReservationJeff"%>
<%@page import="databaseJeff.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
    <%
        session = request.getSession();
        String username = session.getAttribute("username").toString();
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=username%></title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/adminVw.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">

        <h1>Hello <%=username%></h1>

        <nav id="navGroup">
            <ul>
                <li>
                    <a href="userViewR.jsp">My Reservation</a>
                </li>
                <li>
                    <a href="userReserve.jsp">New Reservation</a>
                </li>
                <li>
                    <a href="userResetPSW.jsp">Change Password</a>
                </li>
                <li>
                    <a href="_home.jsp">Log Out</a>
                </li>
            </ul>
        </nav>

        <!--Reservation -->
        <%

            int cID = (Integer) session.getAttribute("cID"); //convert to int doesn't work here.
            //int cID = 8999;
            Database db = Database.getDatabase();
            ArrayList<ReservationJeff> reservations = db.getReservation(cID);
            session.setAttribute("reservations", reservations);
        %>
        <div class="tableForm">
            <h1>Reservations</h1>
            <form method="get" action="Change">
                <table>
                    <thead>
                        <tr>
                            <th class="thead"></th>
                            <th class="thead">Reservation ID</th>
                            <th class="thead">User ID</th>
                            <th class="thead">Starting</th>
                            <th class="thead">Ending</th>
                            <th class="thead">Room Type</th>
                            <th class="thead">Quantity</th>
                            <th class="thead">Special Request</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            Date today = new Date();
                            for (ReservationJeff res : reservations) {
                                if (today.before(res.starting)) {
                        %>
                        <tr>

                            <td><input type="radio" name="reservation" value="<%=res.rID%>"></td>
                            <td><%=res.rID%></td>
                            <td><%=res.uID%></td>
                            <td><%=res.starting%></td>
                            <td><%=res.ending%></td>
                            <td><%=res.rType%></td>
                            <td><%=res.rQuantity%></td>
                            <td><%=res.spRequest%></td>

                        </tr>
                        <%
                                }
                            }
                        %> 
                    </tbody>
                </table>                       
                <input class="btns" type="submit" name="submit" value="change"/>
                <input class="btns" type="submit" name="submit" value="delete"/>
                <div id="message">
                    <%
                        if (request.getAttribute("msg") != null) {
                            out.print(request.getAttribute("msg"));
                        }
                    %>
                </div>
            </form> 
        </div>

        <!--History --> 
        <div class="tableForm">
            <h1>History</h1>	
            <table>
                <thead>
                    <tr>
                        <th class="thead">Reservation ID</th>
                        <th class="thead">User ID</th>
                        <th class="thead">Starting</th>
                        <th class="thead">Ending</th>
                        <th class="thead">Room Type</th>
                        <th class="thead">Quantity</th>
                        <th class="thead">Special Request</th>
                    </tr>	
                </thead>
                <tbody>
                    <%
                        for (ReservationJeff res : reservations) {
                            if (today.after(res.starting)) {
                    %>
                    <tr>
                        <td><%=res.rID%></td>
                        <td><%=res.uID%></td>
                        <td><%=res.starting%></td>
                        <td><%=res.ending%></td>
                        <td><%=res.rType%></td>
                        <td><%=res.rQuantity%></td>
                        <td><%=res.spRequest%></td>
                    </tr>
                    <%
                            }
                        }
                    %> 
                </tbody>
            </table>	
        </div>
    </body>
</html>
