/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*date picker*/
$(function () {
    var dateToday = new Date();
    $("#checkIn").datepicker({
        dateFormat: 'dd-M-y',
        changeMonth: true,
        changeYear: true,
        numberOfMonths: 1,
        minDate: dateToday,
        onClose: function (selectedDate) {
            $("#checkOut").datepicker("option", "minDate", selectedDate);
        }
    });
    $("#checkOut").datepicker({
        dateFormat: 'dd-M-y',
        changeMonth: true,
        changeYear: true,
        numberOfMonths: 1,
        onClose: function (selectedDate) {
            $("#checkIn").datepicker("option", "maxDate", selectedDate);
        }
    });
});

/*show hide selector*/
$(function () {
    $("select").change(function () {
        $(this).find("option:selected").each(function () {
            if ($(this).attr("value") === "by Date") {
                $("#date_div").show();

                $("#price_div").hide();
                $("#room_div").hide();
            } else if ($(this).attr("value") === "by Price") {
                $("#price_div").show();

                $("#date_div").hide();
                $("#room_div").hide();

            } else if ($(this).attr("value") === "by Room Level") {
                $("#room_div").show();

                $("#date_div").hide();
                $("#price_div").hide();

            } else {
                $(".hidden_divs").hide();
            }
        });
    }).change();
});