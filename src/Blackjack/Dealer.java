package Blackjack;


public class Dealer implements Player {

    private static int dealerPoints;

    static int getDealerPoints() {
        return dealerPoints;
    }

    @Override
    public void firstMove() {
        System.out.println( "The dealer has: " + Game.drawnCard() + " showing, and hidden, too." );
        dealerPoints = Game.getDrawledCard();
        dealerPoints += Game.drawnCard();
    }

    @Override
    public void decisionChoiceToHitOrStay() {
        if (lessThanSeventeenPoints()) {
            hittingNextCard();
            decisionChoiceToHitOrStay();
        } else if (greaterOrEqualThanSeventeenPoints()) {
            stayDecision();
        }
    }

    @Override
    public void hittingNextCard() {
        System.out.println( "\n Dealer choose to HIT" );
        System.out.println( "He drew a " + Game.drawnCard() );
        dealerPoints += Game.getDrawledCard();
        System.out.println( "His total is " + dealerPoints );

    }

    private void stayDecision() {
        System.out.println( "Dealer choose to stays.\n" );
        System.out.println( "His total is " + dealerPoints );
    }

    private boolean lessThanSeventeenPoints() {
        return dealerPoints < 17;
    }

    private boolean greaterOrEqualThanSeventeenPoints() {
        return dealerPoints >= 17;
    }
}