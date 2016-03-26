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
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Rooms</h2>
        <form method="GET" name="viewRooms" action="ViewRooms">
            <table border="1">
                <tr>
                    <th class="thead"></th>
                    <th class="thead">Room Number</th>
                    <th class="thead">Room Type</th>
                    <th class="thead">Specification</th>
                </tr> 

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

            </table>
            <input type="submit" name="btn" value="Add Room"/>
            <input type="submit" name="btn" value="Edit Room"/>
            <input type="submit" name="btn" value="Delete Room"/>
            <input type="submit" name="btn" value="View Reservations"/>
            <input type="submit" name="btn" value="Log Out"/>
            
        </form>              
    </body>
</html>
