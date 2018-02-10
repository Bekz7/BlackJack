package Blackjack;

import java.util.Scanner;

public class Gambler implements Player {

    private StatusRoundManager hitOrStayDecision = new StatusRoundManager();
    private static DeckOfCards gamblerCards = new DeckOfCards();

    protected DeckOfCards getGamblerCards() {
        return gamblerCards;
    }


    @Override
    public void move() {
        gamblerCards.draw( Game.playingDeck );
        gamblerCards.draw( Game.playingDeck );
        System.out.println( "You get: " + gamblerCards.toString() );
        System.out.println( "You total value is: " + gamblerCards.cardsValue() + "\n" );
    }

    @Override
    public void decisionChoiceToHitOrStay() {
        Scanner in = new Scanner( System.in );
        String decisionInput;

        System.out.print( "Would you like HIT or STAY? " );
        decisionInput = in.nextLine();
        hitOrStayDecision.setKeyboardInput( decisionInput );

        doingNextMove();
        stoppedDoingNextMove();
        incorrectInput();
    }

    private void doingNextMove() {
        if (hitOrStayDecision.isHitting()) {
            hittingNextCard();
            decisionChoiceToHitOrStay();
        }
    }

    @Override
    public void hittingNextCard() {
        System.out.println();
        System.out.println( "You chose to HIT" );
        gamblerCards.draw( Game.playingDeck );
        System.out.println( "You drew: " + gamblerCards.getCard( gamblerCards.deckSize() - 1 ) );
        System.out.println( "You totally have points: " + gamblerCards.cardsValue() + "\n" );
    }

    private void stoppedDoingNextMove() {
        if (hitOrStayDecision.isStaying()) {
            System.out.println( hitOrStayDecision.getKeyboardInput() );
            return;
        }
    }

    private void incorrectInput() {
        if (hitOrStayDecision.isIncorrectInput()) {
            System.out.println( hitOrStayDecision.getKeyboardInput() );
            System.exit( 0 );
        }
    }


}

