/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    var dateToday = new Date();
    $("#checkIn").datepicker({
        dateFormat:'dd-M-y',
        changeMonth: true,
        changeYear: true,
        numberOfMonths: 1,
        minDate: dateToday,
        onClose: function (selectedDate) {
        $("#checkOut").datepicker("option", "minDate", selectedDate);
        }
    });
    $("#checkOut").datepicker({
        dateFormat:'dd-M-y',
        changeMonth: true,
        changeYear: true,
        numberOfMonths: 1,
        onClose: function (selectedDate) {
            $("#checkIn").datepicker("option", "maxDate", selectedDate);
        }
    });
});


