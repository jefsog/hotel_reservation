/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var google;
function init_map() {

    var myOptions = {
        zoom: 16,
        center: new google.maps.LatLng(36.4327707, 25.42280740000001),
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    map = new google.maps.Map(document.getElementById('gmap_canvas'), myOptions);
    marker = new google.maps.Marker({
        map: map,
        position: new google.maps.LatLng(36.4327707, 25.42280740000001)});
    infowindow = new google.maps.InfoWindow({
        content: '<strong>Location</strong><br>Imerovigli 847 00<br>'});
    google.maps.event.addListener(marker, 'click', function () {
        infowindow.open(map, marker);
    });
    infowindow.open(map, marker);
}
google.maps.event.addDomListener(window, 'load', init_map);


