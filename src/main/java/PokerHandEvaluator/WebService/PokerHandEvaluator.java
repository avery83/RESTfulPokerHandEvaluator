package PokerHandEvaluator.WebService;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.servlet.http.*;
import javax.ws.rs.POST;
import javax.xml.bind.annotation.XmlRootElement;
import PokerHandEvaluator.evaluator.*;
import PokerHandEvaluator.evaluator.SuitEnum.Suit;
import PokerHandEvaluator.evaluator.CardRankEnum.CardRank;
import org.apache.log4j.Logger;

/**
 * Created by student on 2/19/17.
 */
// The Java class will be hosted at the URI path "/evaluate"
@Path("/evaluate")
public class PokerHandEvaluator {
    // The Java method will process HTTP GET requests

    private final Logger log = Logger.getLogger(this.getClass());

    @POST
    public Response validateString(@FormParam("hand[]") ArrayList<String> input) {

        Evaluator bestHand = new Evaluator();
        log.debug(input);
        ArrayList<Card> sevenCardHand = new ArrayList<>();


        for (String card : input) {
            if (card.equals("2C")) {
                sevenCardHand.add(new Card(CardRank.TWO, Suit.CLUB));
            }
            if (card.equals("3C")) {
                sevenCardHand.add(new Card(CardRank.THREE, Suit.CLUB));
            }
            if (card.equals("4C")) {
                sevenCardHand.add(new Card(CardRank.FOUR, Suit.CLUB));
            }
            if (card.equals("5C")) {
                sevenCardHand.add(new Card(CardRank.FIVE, Suit.CLUB));
            }
            if (card.equals("6C")) {
                sevenCardHand.add(new Card(CardRank.SIX, Suit.CLUB));
            }
            if (card.equals("7C")) {
                sevenCardHand.add(new Card(CardRank.SEVEN, Suit.CLUB));
            }
            if (card.equals("8C")) {
                sevenCardHand.add(new Card(CardRank.EIGHT, Suit.CLUB));
            }
            if (card.equals("9C")) {
                sevenCardHand.add(new Card(CardRank.NINE, Suit.CLUB));
            }
            if (card.equals("10C")) {
                sevenCardHand.add(new Card(CardRank.TEN, Suit.CLUB));
            }
            if (card.equals("JC")) {
                sevenCardHand.add(new Card(CardRank.JACK, Suit.CLUB));
            }
            if (card.equals("QC")) {
                sevenCardHand.add(new Card(CardRank.QUEEN, Suit.CLUB));
            }
            if (card.equals("KC")) {
                sevenCardHand.add(new Card(CardRank.KING, Suit.CLUB));
            }
            if (card.equals("AC")) {
                sevenCardHand.add(new Card(CardRank.ACE, Suit.CLUB));
            }
            if (card.equals("2D")) {
                sevenCardHand.add(new Card(CardRank.TWO, Suit.DIAMOND));
            }
            if (card.equals("3D")) {
                sevenCardHand.add(new Card(CardRank.THREE, Suit.DIAMOND));
            }
            if (card.equals("4D")) {
                sevenCardHand.add(new Card(CardRank.FOUR, Suit.DIAMOND));
            }
            if (card.equals("5D")) {
                sevenCardHand.add(new Card(CardRank.FIVE, Suit.DIAMOND));
            }
            if (card.equals("6D")) {
                sevenCardHand.add(new Card(CardRank.SIX, Suit.DIAMOND));
            }
            if (card.equals("7D")) {
                sevenCardHand.add(new Card(CardRank.SEVEN, Suit.DIAMOND));
            }
            if (card.equals("8D")) {
                sevenCardHand.add(new Card(CardRank.EIGHT, Suit.DIAMOND));
            }
            if (card.equals("9D")) {
                sevenCardHand.add(new Card(CardRank.NINE, Suit.DIAMOND));
            }
            if (card.equals("10D")) {
                sevenCardHand.add(new Card(CardRank.TEN, Suit.DIAMOND));
            }
            if (card.equals("JD")) {
                sevenCardHand.add(new Card(CardRank.JACK, Suit.DIAMOND));
            }
            if (card.equals("QD")) {
                sevenCardHand.add(new Card(CardRank.QUEEN, Suit.DIAMOND));
            }
            if (card.equals("KD")) {
                sevenCardHand.add(new Card(CardRank.KING, Suit.DIAMOND));
            }
            if (card.equals("AD")) {
                sevenCardHand.add(new Card(CardRank.ACE, Suit.DIAMOND));
            }
            if (card.equals("2H")) {
                sevenCardHand.add(new Card(CardRank.TWO, Suit.HEART));
            }
            if (card.equals("3H")) {
                sevenCardHand.add(new Card(CardRank.THREE, Suit.HEART));
            }
            if (card.equals("4H")) {
                sevenCardHand.add(new Card(CardRank.FOUR, Suit.HEART));
            }
            if (card.equals("5H")) {
                sevenCardHand.add(new Card(CardRank.FIVE, Suit.HEART));
            }
            if (card.equals("6H")) {
                sevenCardHand.add(new Card(CardRank.SIX, Suit.HEART));
            }
            if (card.equals("7H")) {
                sevenCardHand.add(new Card(CardRank.SEVEN, Suit.HEART));
            }
            if (card.equals("8H")) {
                sevenCardHand.add(new Card(CardRank.EIGHT, Suit.HEART));
            }
            if (card.equals("9H")) {
                sevenCardHand.add(new Card(CardRank.NINE, Suit.HEART));
            }
            if (card.equals("10H")) {
                sevenCardHand.add(new Card(CardRank.TEN, Suit.HEART));
            }
            if (card.equals("JH")) {
                sevenCardHand.add(new Card(CardRank.JACK, Suit.HEART));
            }
            if (card.equals("QH")) {
                sevenCardHand.add(new Card(CardRank.QUEEN, Suit.HEART));
            }
            if (card.equals("KH")) {
                sevenCardHand.add(new Card(CardRank.KING, Suit.HEART));
            }
            if (card.equals("AH")) {
                sevenCardHand.add(new Card(CardRank.ACE, Suit.HEART));
            }
            if (card.equals("2S")) {
                sevenCardHand.add(new Card(CardRank.TWO, Suit.SPADE));
            }
            if (card.equals("3S")) {
                sevenCardHand.add(new Card(CardRank.THREE, Suit.SPADE));
            }
            if (card.equals("4S")) {
                sevenCardHand.add(new Card(CardRank.FOUR, Suit.SPADE));
            }
            if (card.equals("5S")) {
                sevenCardHand.add(new Card(CardRank.FIVE, Suit.SPADE));
            }
            if (card.equals("6S")) {
                sevenCardHand.add(new Card(CardRank.SIX, Suit.SPADE));
            }
            if (card.equals("7S")) {
                sevenCardHand.add(new Card(CardRank.SEVEN, Suit.SPADE));
            }
            if (card.equals("8S")) {
                sevenCardHand.add(new Card(CardRank.EIGHT, Suit.SPADE));
            }
            if (card.equals("9S")) {
                sevenCardHand.add(new Card(CardRank.NINE, Suit.SPADE));
            }
            if (card.equals("10S")) {
                sevenCardHand.add(new Card(CardRank.TEN, Suit.SPADE));
            }
            if (card.equals("JS")) {
                sevenCardHand.add(new Card(CardRank.JACK, Suit.SPADE));
            }
            if (card.equals("QS")) {
                sevenCardHand.add(new Card(CardRank.QUEEN, Suit.SPADE));
            }
            if (card.equals("KS")) {
                sevenCardHand.add(new Card(CardRank.KING, Suit.SPADE));
            }
            if (card.equals("AS")) {
                sevenCardHand.add(new Card(CardRank.ACE, Suit.SPADE));
            }
        }

        log.debug(sevenCardHand);
        Rank output = bestHand.evaluate(sevenCardHand);
        log.debug(output.toString());

        return Response.status(200).entity(output.toString()).build();

    }
}
