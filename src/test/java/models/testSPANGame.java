package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
* Created by Charles Siebert on 2/20/2016.
*/
public class testSPANGame {

    @Test
    public void testSPANGameCreation(){
        Game g = new SpanishGame();
        assertNotNull(g);
    }

    @Test
    public void testSPANGameBuildDeck(){
        Game g = new SpanishGame();
        g.buildDeck();
        assertEquals(40,g.deck.size());
    }

    @Test
    public void testSPANGameInit(){
        Game g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testSPANGameStart(){
        Game g = new SpanishGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testSPANCustomDeal(){
        Game g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("1Coins",g.cols.get(0).get(0).toString());
        assertEquals("2Coins",g.cols.get(1).get(0).toString());
        assertEquals("3Coins",g.cols.get(2).get(0).toString());
        assertEquals("4Coins",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testSPANRemoveFunction(){
        Game g = new SpanishGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }



}

