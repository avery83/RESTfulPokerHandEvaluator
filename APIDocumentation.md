
# Seven Card Poker Hand Evaluator
Takes any seven cards and returns the best five card hand.

## URL
* /api/evaluate

## Method
* POST

## Data Params
* Example
~~~~~
{
  hand : [
    "10C", "JC", "QC", "KC", "AC", "8D", "10H"
  ]
}
~~~~~

## Success Response
* Code: 200
* Example Content: `royal flush, [AC, KC, QC, JC, 10C]`

## Sample Call
~~~~~
$.ajax({
  url: "api/evaluate",
  type: "POST",
  data: {
          hand : [
            "2C", "4C", "5C", "6C", "7C", "8D", "10H"
          ]
 },
 success: function (response) {
   console.log(response);
   $("#score").html(response);
 }
});
~~~~~~
