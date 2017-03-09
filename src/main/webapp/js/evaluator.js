/**
 * Created by student on 2/19/17.
 */
$(document).ready(function() {
    $(".form-control").hide();
    $(function () {



        $("img").click(function () {


            if ($("#sevenToEvaluate > img").length < 7) {
                $(this).toggleClass("selected");
                $("#sevenToEvaluate").append($(this));
                //$(this).hide();


                switch ($(this).attr("id")) {
                    case "2C":
                        $('.form-control option[value="2C"]').attr('selected', true);
                        break;
                    case "3C":
                        $('.form-control option[value="3C"]').attr('selected', true);
                        break;
                    case "4C":
                        $('.form-control option[value="4C"]').attr('selected', true);
                        break;
                    case "5C":
                        $('.form-control option[value="5C"]').attr('selected', true);
                        break;
                    case "6C":
                        $('.form-control option[value="6C"]').attr('selected', true);
                        break;
                    case "7C":
                        $('.form-control option[value="7C"]').attr('selected', true);
                        break;
                    case "8C":
                        $('.form-control option[value="8C"]').attr('selected', true);
                        break;
                    case "9C":
                        $('.form-control option[value="9C"]').attr('selected', true);
                        break;
                    case "10C":
                        $('.form-control option[value="10C"]').attr('selected', true);
                        break;
                    case "JC":
                        $('.form-control option[value="JC"]').attr('selected', true);
                        break;
                    case "QC":
                        $('.form-control option[value="QC"]').attr('selected', true);
                        break;
                    case "KC":
                        $('.form-control option[value="KC"]').attr('selected', true);
                        break;
                    case "AC":
                        $('.form-control option[value="AC"]').attr('selected', true);
                        break;
                    case "2D":
                        $('.form-control option[value="2D"]').attr('selected', true);
                        break;
                    case "3D":
                        $('.form-control option[value="3D"]').attr('selected', true);
                        break;
                    case "4D":
                        $('.form-control option[value="4D"]').attr('selected', true);
                        break;
                    case "5D":
                        $('.form-control option[value="5D"]').attr('selected', true);
                        break;
                    case "6D":
                        $('.form-control option[value="6D"]').attr('selected', true);
                        break;
                    case "7D":
                        $('.form-control option[value="7D"]').attr('selected', true);
                        break;
                    case "8D":
                        $('.form-control option[value="8D"]').attr('selected', true);
                        break;
                    case "9D":
                        $('.form-control option[value="9D"]').attr('selected', true);
                        break;
                    case "10D":
                        $('.form-control option[value="10D"]').attr('selected', true);
                        break;
                    case "JD":
                        $('.form-control option[value="JD"]').attr('selected', true);
                        break;
                    case "QD":
                        $('.form-control option[value="QD"]').attr('selected', true);
                        break;
                    case "KD":
                        $('.form-control option[value="KD"]').attr('selected', true);
                        break;
                    case "AD":
                        $('.form-control option[value="AD"]').attr('selected', true);
                        break;
                    case "2H":
                        $('.form-control option[value="2H"]').attr('selected', true);
                        break;
                    case "3H":
                        $('.form-control option[value="3H"]').attr('selected', true);
                        break;
                    case "4H":
                        $('.form-control option[value="4H"]').attr('selected', true);
                        break;
                    case "5H":
                        $('.form-control option[value="5H"]').attr('selected', true);
                        break;
                    case "6H":
                        $('.form-control option[value="6H"]').attr('selected', true);
                        break;
                    case "7H":
                        $('.form-control option[value="7H"]').attr('selected', true);
                        break;
                    case "8H":
                        $('.form-control option[value="8H"]').attr('selected', true);
                        break;
                    case "9H":
                        $('.form-control option[value="9H"]').attr('selected', true);
                        break;
                    case "10H":
                        $('.form-control option[value="10H"]').attr('selected', true);
                        break;
                    case "JH":
                        $('.form-control option[value="JH"]').attr('selected', true);
                        break;
                    case "QH":
                        $('.form-control option[value="QH"]').attr('selected', true);
                        break;
                    case "KH":
                        $('.form-control option[value="KH"]').attr('selected', true);
                        break;
                    case "AH":
                        $('.form-control option[value="AH"]').attr('selected', true);
                        break;
                    case "2S":
                        $('.form-control option[value="2S"]').attr('selected', true);
                        break;
                    case "3S":
                        $('.form-control option[value="3S"]').attr('selected', true);
                        break;
                    case "4S":
                        $('.form-control option[value="4S"]').attr('selected', true);
                        break;
                    case "5S":
                        $('.form-control option[value="5S"]').attr('selected', true);
                        break;
                    case "6S":
                        $('.form-control option[value="6S"]').attr('selected', true);
                        break;
                    case "7S":
                        $('.form-control option[value="7S"]').attr('selected', true);
                        break;
                    case "8S":
                        $('.form-control option[value="8S"]').attr('selected', true);
                        break;
                    case "9S":
                        $('.form-control option[value="9S"]').attr('selected', true);
                        break;
                    case "10S":
                        $('.form-control option[value="10S"]').attr('selected', true);
                        break;
                    case "JS":
                        $('.form-control option[value="JS"]').attr('selected', true);
                        break;
                    case "QS":
                        $('.form-control option[value="QS"]').attr('selected', true);
                        break;
                    case "KS":
                        $('.form-control option[value="KS"]').attr('selected', true);
                        break;
                    case "AS":
                        $('.form-control option[value="AS"]').attr('selected', true);


                }

            } else {
                alert("Please select at least seven cards");
            }
        });
    });

        $("#resetHand").click(function () {

            location.reload(true);

        });


    //Functionality for the Submit Code to API button
    $("#submitHand").click(function() {
        console.log($("#sevenToEvaluate > img").length);
        if ($("#sevenToEvaluate > img").length == 7) {

            //Get the value of the textarea and package it up to be sent to the API
            var code = {hand: $(".form-control").val()};
            var code2 = {hand2: $(".selected").attr('id')};

            console.log(code2);
            console.log(code);
            //jQuery AJAX call to server and the web validator api
            $.ajax({
                url: "api/evaluate",
                type: "POST",
                data: code,
                success: function (response) {
                    //FOR DEBUGGING - Log the response to the browser console

                    console.log(response);


                    //Print the server reponse to the index.jsp #output <div>'s html
                    $("#score").html(response);
                }
            });
        } else {
            alert("Please only select seven cards");
        }
    });

});