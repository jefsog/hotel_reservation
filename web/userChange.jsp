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
        <title>JSP Page</title>
        <link href="Styles/Main.css" rel="stylesheet" />
        <link href="Styles/Request.css" rel="stylesheet" />
    </head>
    <body>
        <header>
        <h1>Royal Inns and Suites</h1>
        <h2>Where you&rsquo;re always treated like royalty</h2>
        </header>
        <form action="Update" method="get">
        <h1>Reservation Request</h1>
        <%
            int rID = Integer.parseInt((String)request.getAttribute("rID"));
            session.setAttribute("rID", rID);
            
            ArrayList<ReservationJeff> reservations = 
                    (ArrayList<ReservationJeff>)session.getAttribute("reservations");
            ReservationJeff res = new ReservationJeff();
            for(ReservationJeff rs: reservations){
                if(rID == rs.rID){
                    res = rs;
                }
            }
        %>
        
            <h2>Request data</h2>
            <label class="label">Reservation ID</label>
            <label name ="rID" value="<%=rID%>"><%=rID%></label><br>
            <label class="label">Arrival date</label>
            <%
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
	
                Date arrival = new Date(); 
                String date = sdf.format(arrival); 
            %>
            <input name="txtArrivalDate" type="text" value="<%=res.starting%>" id="txtArrivalDate" />
            <br>    
            <label class="label">Departure date</label>
            <input name="txtDepartureDate" type="text" value="<%=res.ending%>" id="txtDepartureDate" />
            <br>    

            <label class="label">Number of room</label>
            <%
            int n = res.rQuantity;
            String s1=null, s2=null, s3=null, s4=null;
            if(n == 1) s1="selected";
            if(n == 2) s2="selected";
            if(n == 3) s3="selected";
            if(n == 4) s4="selected";
            %>
            
            <select name="ddlNoOfPeople" id="ddlNoOfPeople">
                <option value="1" <%=s1%>>1</option>
                <option value="2" <%=s2%>>2</option>
                <option value="3" <%=s3%>>3</option>
                <option value="4" <%=s4%>>4</option>

            </select><br />          
            <%
            String c1=null,c2=null,c3=null;
            String rt = res.rType;
            if(rt.equals("King")) c1="checked";
            if(rt.equals("Two Queens")) c2="checked";
            if(rt.equals("One Queen")) c3="checked";
            %>
            
            <label class="label">Room type</label><br>
            <div style="position: relative; left: 130px">
            <input id="rdoKing" type="radio" name="Bed" value="King" <%=c1%> /><label for="rdoKing">King</label>
            <br>
            
            <input id="rdoDouble" type="radio" name="Bed" value="Two Queens" <%=c2%> /><label for="rdoDouble">Two Queens</label>
            <br>
            <input id="rdoSingle" type="radio" name="Bed" value="One Queen" <%=c3%>/><label for="rdoSingle">One Queen</label><br />
            </div>
            <h2>Special requests</h2>
            <textarea name="txtSpecialRequests" rows="2" cols="20"  id="txtSpecialRequests"><%=res.spRequest%>
            </textarea><br />
            <%--=res.spRequest--%>
            <input type="submit" name="btnSubmit" value="Submit" id="btnSubmit" class="button" />
        </form>
        </body>
</html>
