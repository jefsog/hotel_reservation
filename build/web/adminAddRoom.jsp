<%-- 
    Document   : addRoom
    Created on : Mar 17, 2016, 5:10:30 PM
    Author     : Trisha
--%>

<%@page import="_db._DB"%>
<%@page import="java.util.List"%>
<%@page import="_model.RoomType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel</title>
    </head>
    <body>
        <div id="header">
            <h1>Add Room</h1>
        </div>
        <div id="frmGroup">
            <form method="GET" name="addForm" action="AddRoom">
                <div id="radRoomType">
                    <label>Room Type:</label>
                    <%
                        _DB db = new _DB();
                        List<RoomType> list = db.getRoomTypeList();
                        for(RoomType rt : list){
                            String nm = rt.getRoomName();
                        
                    %>
                    <input type="radio" name="radRoom" value="<%= nm%>" checked><%= nm%><br/>      
                <%}%>
                </div>

                <div id="radRoomNum">
                    <label>Room Number:</label>       
                    <input type="number" name="txtRoomNum"/><br/> 
                </div>
                <div id="specs">
                    <label>Specifications:</label>
                    <input type="radio" name="radSmoke" value="Non-smoking" checked>Non-smoking<br/>
                    <input type="radio" name="radSmoke" value="Smoking"  >Smoking<br/>
                    <textarea name="txtSpecs" rows="2" cols="20"></textarea>
                </div>


                <div id ="btnGroup">
                    <input class="buttons" type="reset" name="btnReset" value="Reset"/>
                    <input class="buttons" type="submit" name="btnAdd" value="Add"/>
                </div>       
            </form>
        </div>

    </body>
</html>
