package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/26/16.
 */
public class testCard {

    @Test
    public void testCardInit() {
        Card c = new Card();
        assertNotNull(c);
    }

    @Test
    public void testUSGetSuit(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals(Suit.Clubs,c.getSuit());
    }

    @Test
    public void testSPANGetSuit(){
        Card c = new Card(5,Suit.Coins);
        assertEquals(Suit.Coins,c.getSuit());
    }

    @Test
    public void testToString(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals("5Clubs",c.toString());
    }

    @Test
    public void testCardValue() {
        Card c = new Card(5,Suit.Clubs);
        assertEquals(5, c.getValue());
    }

    @Test
    public void testUSMoveCard(){
        Game g = new USgame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
        g.move(0,2);
        assertEquals(1,g.cols.get(2).size());
        assertEquals(0,g.cols.get(0).size());
    }
    @Test
    public void testSPANMoveCard(){
        Game g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
        g.move(0,2);
        assertEquals(1,g.cols.get(2).size());
        assertEquals(0,g.cols.get(0).size());
    }


}
