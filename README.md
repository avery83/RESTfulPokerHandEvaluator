# RESTfulPokerHandEvaluator API

### Problem Statement
I wanted to learn a more about REST web services so I decided to turn part of another project into a API. 
I had a partially finished Texas Hold Em game that had a seven card had evaluator that I was really proud of.  
I decided to use that class to create a RESTful Web Service to get the score and best five hand card from any seven cards.

### Front End
To show an example of how the web service works I used bootstrap and jQuery to create a website displaying all 52 playing cards.
The user should select seven cards and then click the evaluate button to send a POST request with the value of those seven cards to the server. The response back of the score and best five card hand will be displayed below the cards.

### Back End
After creating a [Card](src/main/java/PokerHandEvaluator/evaluator/Card.java) and a Deck class I created a Evaluator class that would take any seven cards and evaluate them to get the best five card hand.   
