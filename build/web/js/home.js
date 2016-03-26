/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    var dateToday = new Date();
    $("#arrival").datepicker({
        dateFormat:'dd-M-y',
        changeMonth: true,
        changeYear: true,
        numberOfMonths: 1,
        minDate: dateToday,
        onClose: function (selectedDate) {
        $("#depart").datepicker("option", "minDate", selectedDate);
        }
    });
    $("#depart").datepicker({
        dateFormat:'dd-M-y',
        changeMonth: true,
        changeYear: true,
        numberOfMonths: 1,
        onClose: function (selectedDate) {
            $("#arrival").datepicker("option", "maxDate", selectedDate);
        }
    });
});


