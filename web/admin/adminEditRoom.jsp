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
        <title>JSP Page</title>
    </head>
    <body>
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
                    <label>Room Number:</label> 
                    <span><%=rmID%></span> 
                </div>
                <div id="radRoomType">
                    <label>Room Type:</label>
                    <%
                        String chk1 = null, chk2 = null, chk3 = null;
                        if (rmType.contains("King")) { chk1 = "checked";}               
                        else if (rmType.contains("One Queen")) { chk2 = "checked"; }
                        else { chk3 = "checked";}                      
                    %>
                    <input type="radio" name="radRoom" value="King" <%= chk1%>>King<br/>   
                    <input type="radio" name="radRoom" value="One Queen" <%= chk2%>>One Queen<br/>  
                    <input type="radio" name="radRoom" value="Two Queens" <%= chk3%>>Two Queens<br/>  
                </div>


                <div id="specs">
                    <label>Specifications:</label>

                    <%
                        String chkSmk1 = null, chkSmk2 = null;
                        if (rmSpec.contains("Non-smoking")) { chkSmk1 = "checked";  }                     
                        else { chkSmk2 = "checked";  }                     
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
