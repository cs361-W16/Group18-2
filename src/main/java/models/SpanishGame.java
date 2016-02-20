package models;

/**
 * Created by Luay on 2/19/2016.
 */
public class SpanishGame extends Game {
    public void buildDeck() {
        super.buildDeck();
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Coins));
            deck.add(new Card(i,Suit.Cups));
            deck.add(new Card(i,Suit.Swords));
            deck.add(new Card(i,Suit.Clubs));
        }
    }
}
