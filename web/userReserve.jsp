<%-- 
    Document   : userReserve
    Created on : Mar 12, 2016, 5:28:17 PM
    Author     : Jeff_2
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Styles/Main.css" rel="stylesheet" />
        <link href="Styles/Request.css" rel="stylesheet" />
    </head>
    <body>
        <header>
        <h1>Royal Inns and Suites</h1>
        <h2>Where you&rsquo;re always treated like royalty</h2>
        </header>
        <form action="Reserve" method="get">
        <h1>Reservation Request</h1>
            
            <h2>Request data</h2>
            <label class="label">Arrival date</label>
            <%
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
	
                Date arrival = new Date(); 
                String date = sdf.format(arrival); 
            %>
            <input name="txtArrivalDate" type="text" value="<%=date%>" id="txtArrivalDate" />
            <br>    
            <label class="label">Departure date</label>
            <input name="txtDepartureDate" type="text" id="txtDepartureDate" />
            <br>    

            <label class="label">Number of room</label>
            <select name="ddlNoOfPeople" id="ddlNoOfPeople">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>

            </select><br />          

            <label class="label">Room type</label><br>
            <div style="position: relative; left: 130px">
            <input id="rdoKing" type="radio" name="Bed" value="King" checked="checked" /><label for="rdoKing">King</label>
            <br>
            
            <input id="rdoDouble" type="radio" name="Bed" value="Two Queens" /><label for="rdoDouble">Two Queens</label>
            <br>
            <input id="rdoSingle" type="radio" name="Bed" value="One Queen" /><label for="rdoSingle">One Queen</label><br />
            </div>
            <h2>Special requests</h2>
            <textarea name="txtSpecialRequests" rows="2" cols="20" id="txtSpecialRequests">
            </textarea><br />
            
            <input type="submit" name="btnSubmit" value="Submit" id="btnSubmit" class="button" />
        </form>
        </body>
</html>
