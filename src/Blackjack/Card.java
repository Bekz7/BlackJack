package Blackjack;

import java.io.Serializable;

enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

enum Rank {
    TWO, TREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING, ACE

}

public class Card implements Serializable {
    private Suit suit;
    private Rank rank;


    protected Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }


    @Override
    public String toString() {
        return suit + ": " + rank;
    }

    protected Rank getRank() {
        return rank;
    }
}
