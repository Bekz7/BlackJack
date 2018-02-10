package Blackjack;


import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DeckOfCards implements Serializable {

    private List<Card> cards = new ArrayList<>();
    private List<Card> actualDeck = new ArrayList<>();

    protected DeckOfCards() {
        this.cards = new ArrayList<>();
    }

    protected void currentDeck() throws IOException {
        recoverCurrentDeckFromFile();

        if (!actualDeck.isEmpty()) {
            shuffle();
        } else {
            createFullDeck();
            shuffle();
            savingCurrentDeckToFile();
        }
    }

    private void createFullDeck() {
        this.cards = this.actualDeck;

        for (Suit cardSuit : Suit.values()) {
            for (Rank cardRank : Rank.values()) {
                this.cards.add( new Card( cardSuit, cardRank ) );
            }
        }
    }

    private void savingCurrentDeckToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream( "t.tmp" );

        try (ObjectOutputStream oos = new ObjectOutputStream( fos )) {
            oos.writeObject( actualDeck );
        } catch (EOFException ex) {
            System.out.println( "End file" );
        }

    }

    private void recoverCurrentDeckFromFile() throws IOException {
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream( "t.tmp" );
            ois = new ObjectInputStream( fis );
            actualDeck = (ArrayList<Card>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            assert ois != null;
            ois.close();
        }
    }

    private void shuffle() {
        Collections.shuffle( actualDeck );
    }

    private void removeCard(int index) {
        this.actualDeck.remove( index );
    }

    protected Card getCard(int index) {
        return this.actualDeck.get( index );
    }

    private void addCard(Card addCard) {
        this.actualDeck.add( addCard );
    }

    protected void draw(DeckOfCards comingFrom) {
        this.actualDeck.add( comingFrom.getCard( 0 ) );
        comingFrom.removeCard( 0 );
    }

    @Override
    public String toString() {
        String cardList = "";
        int i = 0;
        for (Card card : this.actualDeck) {
            cardList += "\n" + card.toString();
            i++;
        }
        return cardList;
    }

    protected int deckSize() {
        return this.actualDeck.size();
    }

    protected int cardsValue() {
        int totalValue = 0;

        for (Card card : this.actualDeck) {

            switch (card.getRank()) {
                case TWO:
                    totalValue += 2;
                    break;
                case TREE:
                    totalValue += 3;
                    break;
                case FOUR:
                    totalValue += 4;
                    break;
                case FIVE:
                    totalValue += 5;
                    break;
                case SIX:
                    totalValue += 6;
                    break;
                case SEVEN:
                    totalValue += 7;
                    break;
                case EIGHT:
                    totalValue += 8;
                    break;
                case NINE:
                    totalValue += 9;
                    break;
                case TEN:
                    totalValue += 10;
                    break;
                case JACK:
                    totalValue += 10;
                    break;
                case QUEEN:
                    totalValue += 10;
                    break;
                case KING:
                    totalValue += 10;
                    break;
                case ACE:
                    if (totalValue > 11) {
                        totalValue += 1;
                    } else {
                        totalValue += 11;
                    }
                    break;
            }
        }

        return totalValue;
    }

}


