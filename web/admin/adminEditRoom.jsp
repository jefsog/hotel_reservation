<%-- 
    Document   : adminEditRoom
    Created on : Mar 21, 2016, 2:48:33 PM
    Author     : Trisha
--%>

<%@page import="_db._DB"%>
<%@page import="_model.Room"%>
<%@page import="java.util.List"%>
<%@page import="_model.RoomType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Room</title>
        <link rel="stylesheet" href="Styles/adminAdd_Edit.css" type="text/css"/>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">
        <%
            int rId = Integer.parseInt((String) request.getAttribute("rId"));
            session.setAttribute("rId", rId);
            _DB db = new _DB();
            Room r = db.getRoom(rId);
            int rmID = r.getRoomID();
            String rmType = r.getRt().getRoomName();
            String rmSpec = r.getRoomSpec();
        %>
        <div id="header">
            <h1>Edit Room</h1>
        </div>
        <div id="frmGroup">
            <form method="GET" name="editForm" action="EditRoom">
                <div id="roomNum">
                    <h3>Room Number:</h3> 
                    <span><%=rmID%></span> 
                </div>
                <div id="typeGroup">
                    <h3>Room Type:</h3>
                    <%
                        String chk1 = null, chk2 = null, chk3 = null;
                        if (rmType.contains("King")) {
                            chk1 = "checked";
                        } else if (rmType.contains("One Queen")) {
                            chk2 = "checked";
                        } else {
                            chk3 = "checked";
                        }
                    %>
                    <input type="radio" name="radRoom" value="King" id="radKing" <%= chk1%>>
                    <label>King</label>  
                    
                    <input type="radio" name="radRoom" value="One Queen" id="radOQueen" <%= chk2%>>
                    <label>One Queen</label>  
                    
                    <input type="radio" name="radRoom" value="Two Queens" id="radTQueen" <%= chk3%>>
                    <label>Two Queens</label>
                </div>


                <div id="smokeGroup">
                    <h3>Specifications:</h3>

                    <%
                        String chkSmk1 = null, chkSmk2 = null;
                        if (rmSpec.contains("Non-smoking")) {
                            chkSmk1 = "checked";
                        } else {
                            chkSmk2 = "checked";
                        }
                    %>
                    <input type="radio" name="radSmoke" value="Non-smoking"<%=chkSmk1%>>
                    <label>Non-smoking</label>
                                                                                            
                    <input type="radio" name="radSmoke" value="Smoking"  <%=chkSmk2%>>
                    <label>Smoking</label>
                </div>


                <div id ="btnGroup">
                    <input class="btn" type="submit" name="btn" value="Cancel"/>
                    <input class="btn" type="submit" name="btn" value="Edit"/>
                </div>       
            </form>
        </div>
    </body>
</html>
