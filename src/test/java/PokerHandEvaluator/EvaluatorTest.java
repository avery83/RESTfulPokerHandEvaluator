package PokerHandEvaluator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import PokerHandEvaluator.evaluator.ScoreEnum.Score;
import PokerHandEvaluator.evaluator.Card;
import PokerHandEvaluator.evaluator.SuitEnum.Suit;
import PokerHandEvaluator.evaluator.CardRankEnum.CardRank;
import PokerHandEvaluator.evaluator.Evaluator;
import static org.junit.Assert.*;

/**
 * Created by student on 11/14/16.
 */
public class EvaluatorTest {
    ArrayList<Card> cards2= new ArrayList<>();
    ArrayList<Card> cards3= new ArrayList<>();
    ArrayList<Card> cards4= new ArrayList<>();
    ArrayList<Card> cards5= new ArrayList<>();
    ArrayList<Card> cards6= new ArrayList<>();
    ArrayList<Card> cards7= new ArrayList<>();
    ArrayList<Card> cards8 = new ArrayList<>();
    ArrayList<Card> cards9 = new ArrayList<>();
    ArrayList<Card> cards10 = new ArrayList<>();
    ArrayList<Card> cards11 = new ArrayList<>();
    Evaluator eval = new Evaluator();

    @Before
    public void setUp() throws Exception {
        //List<Card> list = new ArrayList<>();

        Card card = new Card(CardRank.TWO, Suit.CLUB);
        cards2.add(card);
        Card card2 = new Card(CardRank.THREE, Suit.CLUB);
        cards2.add(card2);
        Card card3 = new Card(CardRank.FOUR, Suit.CLUB);
        cards2.add(card3);
        Card card4 = new Card(CardRank.FIVE, Suit.CLUB);
        cards2.add(card4);
        Card card5 = new Card(CardRank.SIX, Suit.CLUB);
        cards2.add(card5);
        Card card6 = new Card(CardRank.SEVEN, Suit.CLUB);
        cards2.add(card6);
        Card card7 = new Card(CardRank.EIGHT, Suit.CLUB);
        cards2.add(card7);

        Card card8 = new Card(CardRank.TWO, Suit.CLUB);
        cards3.add(card8);
        Card card9 = new Card(CardRank.THREE, Suit.CLUB);
        cards3.add(card9);
        Card card10 = new Card(CardRank.FOUR, Suit.CLUB);
        cards3.add(card10);
        Card card11 = new Card(CardRank.FIVE, Suit.CLUB);
        cards3.add(card11);
        Card card12 = new Card(CardRank.ACE, Suit.SPADE);
        cards3.add(card12);
        Card card13 = new Card(CardRank.SEVEN, Suit.HEART);
        cards3.add(card13);
        Card card14 = new Card(CardRank.EIGHT, Suit.HEART);
        cards3.add(card14);

        Card card15 = new Card(CardRank.TWO, Suit.CLUB);
        cards4.add(card15);
        Card card16 = new Card(CardRank.THREE, Suit.CLUB);
        cards4.add(card16);
        Card card17 = new Card(CardRank.THREE, Suit.CLUB);
        cards4.add(card17);
        Card card18 = new Card(CardRank.THREE, Suit.CLUB);
        cards4.add(card18);
        Card card19 = new Card(CardRank.FOUR, Suit.HEART);
        cards4.add(card19);
        Card card20 = new Card(CardRank.TWO, Suit.HEART);
        cards4.add(card20);
        Card card21 = new Card(CardRank.EIGHT, Suit.HEART);
        cards4.add(card21);

        cards5.add(new Card(CardRank.TEN, Suit.CLUB));
        cards5.add(new Card(CardRank.JACK, Suit.CLUB));
        cards5.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards5.add(new Card(CardRank.KING, Suit.CLUB));
        cards5.add(new Card(CardRank.ACE, Suit.CLUB));
        cards5.add(new Card(CardRank.TEN, Suit.HEART));
        cards5.add(new Card(CardRank.TEN, Suit.SPADE));

        cards6.add(new Card(CardRank.TWO, Suit.CLUB));
        cards6.add(new Card(CardRank.JACK, Suit.CLUB));
        cards6.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards6.add(new Card(CardRank.THREE, Suit.CLUB));
        cards6.add(new Card(CardRank.ACE, Suit.CLUB));
        cards6.add(new Card(CardRank.TEN, Suit.HEART));
        cards6.add(new Card(CardRank.TEN, Suit.SPADE));

        cards7.add(new Card(CardRank.TEN, Suit.CLUB));
        cards7.add(new Card(CardRank.TEN, Suit.DIAMOND));
        cards7.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards7.add(new Card(CardRank.KING, Suit.CLUB));
        cards7.add(new Card(CardRank.ACE, Suit.CLUB));
        cards7.add(new Card(CardRank.TEN, Suit.HEART));
        cards7.add(new Card(CardRank.TEN, Suit.SPADE));




        cards8.add(new Card(CardRank.TEN, Suit.CLUB));
        cards8.add(new Card(CardRank.TEN, Suit.DIAMOND));
        cards8.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards8.add(new Card(CardRank.KING, Suit.CLUB));
        cards8.add(new Card(CardRank.ACE, Suit.CLUB));
        cards8.add(new Card(CardRank.NINE, Suit.HEART));
        cards8.add(new Card(CardRank.TEN, Suit.SPADE));

        cards9.add(new Card(CardRank.TEN, Suit.CLUB));
        cards9.add(new Card(CardRank.TEN, Suit.DIAMOND));
        cards9.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards9.add(new Card(CardRank.KING, Suit.CLUB));
        cards9.add(new Card(CardRank.ACE, Suit.CLUB));
        cards9.add(new Card(CardRank.NINE, Suit.HEART));
        cards9.add(new Card(CardRank.NINE, Suit.SPADE));

        cards10.add(new Card(CardRank.TEN, Suit.CLUB));
        cards10.add(new Card(CardRank.TEN, Suit.DIAMOND));
        cards10.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards10.add(new Card(CardRank.KING, Suit.CLUB));
        cards10.add(new Card(CardRank.ACE, Suit.CLUB));
        cards10.add(new Card(CardRank.NINE, Suit.HEART));
        cards10.add(new Card(CardRank.EIGHT, Suit.SPADE));

        cards11.add(new Card(CardRank.ACE, Suit.CLUB));
        cards11.add(new Card(CardRank.TEN, Suit.DIAMOND));
        cards11.add(new Card(CardRank.QUEEN, Suit.CLUB));
        cards11.add(new Card(CardRank.KING, Suit.CLUB));
        cards11.add(new Card(CardRank.TWO, Suit.CLUB));
        cards11.add(new Card(CardRank.NINE, Suit.HEART));
        cards11.add(new Card(CardRank.EIGHT, Suit.SPADE));

    }

    @Test
    public void testEvaluate() throws Exception {
        assertEquals(Score.FULL_HOUSE,eval.evaluate(cards4).score);
        assertEquals(Score.STRAIGHT,eval.evaluate(cards3).score);
        assertEquals(Score.STRAIGHT_FLUSH,eval.evaluate(cards2).score);
        assertEquals(Score.ROYAL_FLUSH,eval.evaluate(cards5).score);
        assertEquals(Score.FLUSH,eval.evaluate(cards6).score);
        assertEquals(Score.FOUR_OF_A_KIND,eval.evaluate(cards7).score);
        assertEquals(Score.THREE_OF_A_KIND,eval.evaluate(cards8).score);
        assertEquals(Score.TWO_PAIR,eval.evaluate(cards9).score);
        assertEquals(Score.PAIR,eval.evaluate(cards10).score);
        assertEquals(Score.HIGH_CARD,eval.evaluate(cards11).score);
    }


}