<%-- 
    Document   : userChange
    Created on : Mar 14, 2016, 10:49:43 AM
    Author     : Jeff_2
--%>

<%@page import="logicJeff.ReservationJeff"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Reservation</title>
        <link rel="stylesheet" href="Styles/adminAdd_Edit.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/userForm.css" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js" defer></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js" defer></script>
        <script type="text/javascript" src="js/home.js" defer></script>
    </head>
    <body style="background-image: url(images/natural_paper.png); ">

        <div id="header">
            <h1>Change Reservation</h1>
        </div>
        <div id="frmGroup">
            <form action="Update" method="get">        
                <%
                    int rID = Integer.parseInt((String) request.getAttribute("rID"));
                    session.setAttribute("rID", rID);

                    ArrayList<ReservationJeff> reservations
                            = (ArrayList<ReservationJeff>) session.getAttribute("reservations");
                    ReservationJeff res = new ReservationJeff();
                    for (ReservationJeff rs : reservations) {
                        if (rID == rs.rID) {
                            res = rs;
                        }
                    }
                %>

                <h3>Reservation ID</h3>
                <label><%=rID%></label><br/>
                <%
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");

                    Date arrival = new Date();
                    String date = sdf.format(arrival);
                %>
                <input class="txtGroup" name="txtCheckIn" type="text" id="checkIn" value="<%=res.starting%>"/>

                <input class="txtGroup" name="txtCheckOut" type="text" id="checkOut" value="<%=res.ending%>"/>

                <div id ="ddlRoom">
                    <h3>Number of room</h3>
                    <%
                        int n = res.rQuantity;
                        String s1 = null, s2 = null, s3 = null, s4 = null;
                        if (n == 1) {
                            s1 = "selected";
                        }
                        if (n == 2) {
                            s2 = "selected";
                        }
                        if (n == 3) {
                            s3 = "selected";
                        }
                        if (n == 4) {
                            s4 = "selected";
                        }
                    %>

                    <select name="ddlNumRooms" class="ddlGroup">
                        <option value="1" <%=s1%>>1</option>
                        <option value="2" <%=s2%>>2</option>
                        <option value="3" <%=s3%>>3</option>
                        <option value="4" <%=s4%>>4</option>

                    </select>  
                </div>
                <%
                    String c1 = null, c2 = null, c3 = null;
                    String rt = res.rType;
                    if (rt.equals("King")) {
                        c1 = "checked";
                    }
                    if (rt.equals("Two Queens")) {
                        c2 = "checked";
                    }
                    if (rt.equals("One Queen")) {
                        c3 = "checked";
                    }
                %>

                <div id="typeGroup">
                    <h3>Room type</h3>
                    <input id="radKing" type="radio" name="Bed" value="King" <%=c1%> />
                    <label>King</label>

                    <input id="radTQueen" type="radio" name="Bed" value="Two Queens" <%=c2%> />
                    <label>Two Queens</label>

                    <input id="radOQueen" type="radio" name="Bed" value="One Queen" <%=c3%>/>
                    <label>One Queen</label>
                </div>
                    
                <div id="specialReqs">
                    <h2>Special requests</h2>
                    <textarea name="txtSpecialRequests" rows="2" cols="20"  id="txtSpecialRequests"><%=res.spRequest%>
                    </textarea>
                </div>
                <%--=res.spRequest--%>
                <input type="submit" name="btnSubmit" value="Submit" id="btnSubmit" class="btn" />
            </form>
        </div>
    </body>
</html>
