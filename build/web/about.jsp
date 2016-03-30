<%-- 
    Document   : about
    Created on : Mar 28, 2016, 12:10:13 AM
    Author     : Trisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/about.css" type="text/css"/>

    </head>
    <body style="background-image: url(images/pattern.png), url(images/1.jpg); ">
        <!--Header-->
        <jsp:include page="_header.jsp"/>

        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>

        <div id="aboutGroup">
            <h3>About Us</h3>
            <p id="para">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 
                labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi 
                ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum 
                dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia 
                deserunt mollit anim id est laborum
            </p>
        </div>


        <!--Footer-->
        <jsp:include page="//_footer.jsp"/>
    </body>
</html>
