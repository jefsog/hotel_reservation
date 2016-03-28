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
        <title>Add Room</title>
        <link rel="stylesheet" href="Styles/adminAdd_Edit.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">
        <div id="header">
            <h1>Add Room</h1>
        </div>
        <div id="frmGroup">
            <form method="GET" name="addForm" action="AddRoom">
                <div id="typeGroup">
                    <h3>Room Type:</h3>

                    <input type="radio" name="radRoom" value="King" id="radKing" checked>
                    <label>King</label>   

                    <input type="radio" name="radRoom" value="Two Queen" id="radTQueen">
                    <label>Two Queen</label>   

                    <input type="radio" name="radRoom" value="One Queen" id="radOQueen">
                    <label>One Queen</label>                     
                </div>

                <div id="radRoomNum">
                    <h3>Room Number:</h3>       
                    <input class="txtGroup" type="number" name="txtRoomNum"/><br/> 
                </div>
                <div id="smokeGroup">
                    <h3>Specifications:</h3>

                    <input type="radio" name="radSmoke" value="Non-smoking" checked>
                    <label>Non-smoking</label>

                    <input type="radio" name="radSmoke" value="Smoking"  >
                    <label>Smoking</label>
                </div>
                <div id ="btnGroup">
                    <input class="btn" type="reset" name="btnReset" value="Reset"/>
                    <input class="btn" type="submit" name="btnAdd" value="Add"/>
                </div>       
            </form>
        </div>

    </body>
</html>
