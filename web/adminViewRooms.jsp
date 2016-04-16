<%-- 
    Document   : adminEditRoom
    Created on : Mar 20, 2016, 6:26:25 PM
    Author     : Trisha
--%>

<%@page import="_db._DB"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="_model.Room"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rooms</title>
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userMain.css" type="text/css"/>
    </head>
    <body>
        <!--admin menu-->
        <div id="menuGroup">
            <ul id="navigation">
                <li class="menu-1 fadeInLeft animated">
                    <a class = "hvr-sweep-to-left" href="adminViewRooms.jsp">View Rooms</a>
                </li> 
                <li class="menu-2 fadeInLeft animated">
                    <a class = "hvr-sweep-to-left" href="adminAddRoom.jsp">Add Room</a>
                </li>      
                <li class="menu-3 fadeInLeft animated">
                    <a class = "hvr-sweep-to-left" href="adminViewReservations.jsp">View Reservations</a>
                </li>
                <li class="menu-4 fadeInLeft animated">
                    <a class = "hvr-sweep-to-left" href="_home.jsp">Log out</a>
                </li>
            </ul>
        </div>

        <!--room list-->
        <div class="content fadeIn animated">
            <h2 class="slideInDown animated">—Rooms—</h2>
            <div class="message">
                <%
                    if (request.getAttribute("msg") != null) {
                        out.print(request.getAttribute("msg"));
                    }
                %>
            </div>  
            <form method="GET" name="viewRooms" action="ViewRooms">
                <table>
                    <thead>
                        <tr>
                            <th class="thead"></th>
                            <th class="thead">Room Number</th>
                            <th class="thead">Room Type</th>
                            <th class="thead">Specification</th>
                        </tr> 
                    </thead>
                    <tbody>
                        <%
                            _DB db = new _DB();
                            List<Room> list = db.getRoomList();
                            for (Room r : list) {
                                int id = r.getRoomID();
                                String nm = r.getRt().getRoomName();
                                String spec = r.getRoomSpec();

                        %>
                        <tr>
                            <td><input type="radio" name="radRoom" value="<%=id%>"></td>
                            <td><%=id%></td>
                            <td><%=nm%></td>
                            <td><%=spec%></td>       
                        </tr>
                        <%}%>
                    </tbody>
                </table>

                <!--buttons-->   
                <input class="btns" type="submit" name="btn" value="Edit Room"/>
                <input class="btns" type="submit" name="btn" value="Delete Room"/>             
            </form>  
        </div>
        <!--room list-->
    </body>
</html>
