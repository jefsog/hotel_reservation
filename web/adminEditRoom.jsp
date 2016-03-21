<%-- 
    Document   : adminEditRoom
    Created on : Mar 21, 2016, 2:48:33 PM
    Author     : Trisha
--%>

<%@page import="_model.Room"%>
<%@page import="java.util.List"%>
<%@page import="_model.RoomType"%>
<%@page import="_db.Room_DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="header">
            <h1>Edit Room</h1>
        </div>
        <div id="frmGroup">
            <form method="GET" name="editForm" action="EditRoom">
                <div id="radRoomType">
                    <label>Room Type:</label>
                    <%
                        int rId = Integer.parseInt((String) request.getAttribute("rId"));
                        session.setAttribute("rId", rId);
                        Room_DB db = new Room_DB();
                        Room r = db.getRoom(rId);
                        int rmID = r.getRoomID();
                        String rmType = r.getRt().getRoomName();
                        String rmSpec = r.getRoomSpec();
                        String chk = null;
                        if (rmType.equals("King")) {
                            chk = "checked";
                        }
                        if (rmType.equals("Two Queens")) {
                            chk = "checked";
                        }
                        if (rmType.equalsIgnoreCase("One Queen")) {
                            chk = "checked";
                        }

                    %>
                    <input type="radio" name="radRoom" value="King" <%= chk%>>King<br/>   
                    <input type="radio" name="radRoom" value="One Queen" <%= chk%>>One Queen<br/>  
                    <input type="radio" name="radRoom" value="Two Queens" <%= chk%>>Two Queens<br/>  
                </div>

                <div id="radRoomNum">
                    <label>Room Number:</label>       
                    <input type="text" name="txtRoomNum" value="<%=rmID%>"/><br/> 
                </div>
                <div id="specs">
                    <label>Specifications:</label>
                    <%! String chkSmk1, chkSmk2;%>
                    <%
                        if (rmSpec.equalsIgnoreCase("Non-smoking")) {
                            chkSmk1 = "checked";
                        }
                        if (rmSpec.equalsIgnoreCase("Smoking")) {
                            chkSmk2 = "checked";
                        }

                    %>
                    <input type="radio" name="radSmoke" value="Non-smoking"<%=chkSmk1%>>Non-smoking<br/>
                    <input type="radio" name="radSmoke" value="Smoking"  <%=chkSmk2%>>Smoking<br/>
                    <textarea name="txtSpecs" rows="2" cols="20"><%= rmSpec + rmType%></textarea>
                </div>


                <div id ="btnGroup">
                    <input class="buttons" type="submit" name="btn" value="Cancel"/>
                    <input class="buttons" type="submit" name="btn" value="Edit"/>
                </div>       
            </form>
        </div>
    </body>
</html>
