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
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/adminVw.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">

        <div class="tableForm">
            <h1>Rooms</h1>
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
                <div id="nav">
                    <ul class="menu">
                        <li>
                            <input class="btns" type="submit" name="btn" value="Add Room"/>
                        </li>
                        <li>
                            <input class="btns" type="submit" name="btn" value="Edit Room"/>
                        </li>
                        <li>
                            <input class="btns" type="submit" name="btn" value="Delete Room"/>
                        </li>
                        <li>
                            <input class="btns" type="submit" name="btn" value="View Reservations"/>
                        </li>
                        <li>
                        <li>
                            <input class="btns" type="submit" name="btn" value="Log Out"/>
                        </li>
                    </ul>
                    <div id="message">
                        <%
                            if (request.getAttribute("msg") != null) {
                                out.print(request.getAttribute("msg"));
                            }
                        %>
                    </div>
                </div>     
            </form>  
        </div>
    </body>
</html>
