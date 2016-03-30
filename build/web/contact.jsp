<%-- 
    Document   : contact
    Created on : Mar 28, 2016, 12:18:14 AM
    Author     : Trisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <link rel="stylesheet" href="Styles/main.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/nav.css" type="text/css"/>
        <link rel="stylesheet" href="Styles/contact.css" type="text/css"/>
        <script src='https://maps.googleapis.com/maps/api/js?v=3.exp' defer></script>
        <script type="text/javascript" src="js/map.js" defer></script>

    </head>

    <body style="background-image: url(images/pattern.png), url(images/steps_3.jpg); ">
        <!--Header-->
        <jsp:include page="_header.jsp"/>

        <!--Navigation-->
        <jsp:include page="_navigation.jsp"/>

        <div id="googleMap">

            <div style='overflow:hidden;height:440px;width:700px;'>
                <div id='gmap_canvas' style='height:440px;width:700px;'>
                </div>
                <div>
                    <small>
                        <a href="http://embedgooglemaps.com">Embed map</a>
                    </small>
                </div>
                <div>
                    <small>
                        <a href="http://freedirectorysubmissionsites.com/">link directories</a>
                    </small>
                </div>
            </div>
        </div>


        <!--Footer-->
        <jsp:include page="//_footer.jsp"/>
    </body>
</html>
