package models;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Charles Siebert on 2/20/2016.
 */
public class testUSGame {

        @Test
        public void testUSGameCreation(){
            Game g = new USgame();
            assertNotNull(g);
        }

        @Test
        public void testUSGameBuildDeck(){
            Game g = new USgame();
            g.buildDeck();
            assertEquals(52,g.deck.size());
        }

        @Test
        public void testUSGameInit(){
            Game g = new USgame();
            g.buildDeck();
            g.shuffle();
            assertNotEquals(2,g.deck.get(0).getValue());
        }

        @Test
        public void testUSGameStart(){
            Game g = new USgame();
            g.buildDeck();
            g.shuffle();
            g.dealFour();
            assertEquals(1,g.cols.get(0).size());
            assertEquals(1,g.cols.get(1).size());
            assertEquals(1,g.cols.get(2).size());
            assertEquals(1,g.cols.get(3).size());
        }

        @Test
        public void testUSCustomDeal(){
            Game g = new USgame();
            g.buildDeck();
            g.customDeal(0,3,6,9);
            assertEquals("2Clubs",g.cols.get(0).get(0).toString());
            assertEquals("3Clubs",g.cols.get(1).get(0).toString());
            assertEquals("4Clubs",g.cols.get(2).get(0).toString());
            assertEquals("5Clubs",g.cols.get(3).get(0).toString());
        }

        @Test
        public void testUSRemoveFunction(){
            Game g = new USgame();
            g.buildDeck();
            g.customDeal(0,3,6,9);
            g.remove(2);
            assertEquals(0,g.cols.get(2).size());
        }



}