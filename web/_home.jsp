<%-- 
    Document   : home
    Created on : Mar 23, 2016, 11:08:46 AM
    Author     : Trisha
--%>

<%@page import="java.util.List"%>
<%@page import="_model.RoomType"%>
<%@page import="_db._DB"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session != null) {
        session.invalidate();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="Styles/_main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/_menu.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/_home.css" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.12.0.min.js" defer></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js" defer></script>
        <script type="text/javascript" src="js/home.js" defer></script>
    </head>
    <body style="background-image: url(images/pattern.png), url(images/santorini_sunset_2.jpg); ">
        <!--Header-->
        <header id="headerGroup">
            <h1 class="fadeIn animated">Royal Inns</h1>
            <h2 class="fadeInUp animated">Where you&rsquo;re always treated like royalty</h2>
        </header>
        
        <!--Navigation-->
        <nav id="menuGroup">
            <ul>       
                <li class="menu-1 fadeInDown animated" ><a href="_home.jsp">Home</a></li>
                <li class="menu-2 fadeInDown animated" ><a href="_rooms.jsp">Rooms</a></li>
                <li class="menu-3 fadeInDown animated" ><a href="_contact.jsp">Location</a></li>
                <li class="menu-4 fadeInDown animated" ><a href="_about.jsp">About Us</a></li>
            </ul>
        </nav>

        <!--Login-->
        <div id="loginGroup">
            <form method="post" action="Login_Signup">
                <div id="error">
                    <%
                        if (request.getAttribute("error") != null) {
                            out.print(request.getAttribute("error"));
                        }
                    %>
                </div>
                <input class="txtGroup" type="text" name="user_name" placeholder="username">
                <input class="txtGroup" type="password" name="password" placeholder="password">
                <input type="submit" name="submit" value="Login" class="btn" id="btnLogIn">
                <input type="submit" name="submit" value="Sign up" class="btn" id="btnSignUp">         
            </form>
        </div>

        <div class="fadeIn animated" id="checkGroup">   
            <form method="get" action="CheckAvailable">
                <h3>—Check Availability—</h3>
                <ul>
                    <li>
                        <input class="txtGroup" name="txtCheckIn" type="text" id="checkIn" placeholder="Check in"/>
                    </li>
                    <li>
                        <input class="txtGroup" name="txtCheckOut" type="text" id="checkOut" placeholder="Check out"/> 

                    </li>

                    <li>
                        <select name="ddlNumRooms" class="ddlGroup">
                            <option value="" selected disabled>Number of rooms</option>
                            <option class="opt" value="1">1</option>
                            <option class="opt" value="2">2</option>
                            <option class="opt" value="3">3</option>
                            <option class="opt" value="4">4</option>
                        </select>

                    </li>
                    <li>

                        <select name="ddlRoomTypes" class="ddlGroup">
                            <option value="" selected disabled>Room Type</option>
                            <%
                                _DB db = new _DB();
                                List<RoomType> lst = db.getRoomTypeList();
                                for (RoomType r : lst) {
                                    String val = r.getRoomName();
                            %>
                            <option class="opt" value="<%=val%>"><%=val%></option>
                            <%}%>
                        </select>                 
                    </li>
                </ul>        
                <input type="submit" name="btnCheck" value="Check Availability" class="btn" id="btnCheckAvail"/><br/>  
                <div id="message">
                    <%
                        String msg = (String)request.getAttribute("msg");
                        if (msg != null) {
                            out.print(msg);
                        if(!msg.contains("Please") && !msg.contains("No Available")){
                        %>                       
                        <input type="submit" name="btnBook" value="Book Now" class="btn" id="btnBookNow"/><br/>  
                    <%}}%>
                </div>
            </form>
        </div>
        <!--Footer-->
        <jsp:include page="_footer.jsp"/>
    </body>

</html>
