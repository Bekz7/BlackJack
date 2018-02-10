package Blackjack;


public class Dealer implements Player {

   private static DeckOfCards dealerCards = new DeckOfCards();

    static DeckOfCards getDealerCards() {
        return dealerCards;
    }



    @Override
    public void move() {
        dealerCards.draw( Game.playingDeck );
        dealerCards.draw( Game.playingDeck );
        System.out.println( "The dealer has: " + dealerCards.getCard( dealerCards.deckSize()-1 ) + " showing, and hidden, too." );
    }

    @Override
    public void decisionChoiceToHitOrStay() {
        if (isLessThanSeventeenPoints()) {
            hittingNextCard();
            decisionChoiceToHitOrStay();
        } else if (isGreaterOrEqualThanSeventeenPoints()) {
            stayDecision();
        }
    }

    @Override
    public void hittingNextCard() {
        System.out.println( "\n Dealer choose to HIT" );
        dealerCards.draw( Game.playingDeck );
        System.out.println( "He drew a " + dealerCards.getCard( dealerCards.deckSize()-1 ) );
        System.out.println( "His total value is " + dealerCards.cardsValue() );

    }

    private void stayDecision() {
        System.out.println();
        System.out.println( "Dealer choose to stays.\n" );
        System.out.println( "His total is " + dealerCards.cardsValue() );
    }

    private boolean isLessThanSeventeenPoints() {
        return dealerCards.cardsValue() < 17;
    }

    private boolean isGreaterOrEqualThanSeventeenPoints() {
        return dealerCards.cardsValue() >= 17;
    }
}