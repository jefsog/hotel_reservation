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
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userMain.css" type="text/css"/>
    </head>
    <body>
        <!--admin menu-->
        <jsp:include page="adminMenu.jsp"/>

        <!--form-->
        <div class="content fadeIn animated">
            <h2 class="slideInDown animated">—Add Room—</h2>
            <!--message-->
            <div class="message">
                <%
                    if (request.getAttribute("msg") != null) {
                        out.print(request.getAttribute("msg"));
                    }
                %>
            </div>  
            <form class="frm" method="GET" name="addForm" action="AddRoom">

                <!--room type-->
                <div id="typeGroup">
                    <h3>Room Type:</h3>

                    <input type="radio" name="radRoom" value="King" id="radKing" checked>
                    <label class="lbl">King</label>   

                    <input type="radio" name="radRoom" value="Two Queens" id="radTQueen">
                    <label class="lbl">Two Queens</label>   

                    <input type="radio" name="radRoom" value="One Queen" id="radOQueen">
                    <label class="lbl">One Queen</label>                     
                </div>

                <!--room number-->
                <div class="txt">
                    <h3>Room Number:</h3> 
                    
                    <input type="radio" name="radLevel" value="100" checked>
                    <label class="lbl">1 level</label>

                    <input type="radio" name="radLevel" value="200"  >
                    <label class="lbl">2 level</label>

                    <input type="radio" name="radLevel" value="300"  >
                    <label class="lbl">3 level</label>
                    
                    &nbsp;<input id="rmNum" class="txtGroup" type="number" name="txtRoomNum" min="0" max="20"/><br/> 
                </div>

                <!--smoking-->
                <div id="smokeGroup">
                    <h3>Specifications:</h3>

                    <input type="radio" name="radSmoke" value="Non-smoking" checked>
                    <label class="lbl">Non-smoking</label>

                    <input type="radio" name="radSmoke" value="Smoking"  >
                    <label class="lbl">Smoking</label>
                </div>

                <!--buttons-->
                <div id ="btnGroup">
                    <input class="btns" type="reset" name="btnReset" value="Reset"/>
                    <input class="btns" type="submit" name="btnAdd" value="Add"/>
                </div>       
            </form>
        </div>
    </body>
</html>
