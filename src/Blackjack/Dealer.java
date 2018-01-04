package Blackjack;


import java.util.*;

public class Dealer implements Game {

    private int card;
    private int moveDealer;
    private Random random = new Random();

    @Override
    public int drawCard() {
        return card = 1 + random.nextInt( 10 );
    }

    @Override
    public void condition() {
        if (moveDealer > 21) {
            System.out.println( "Dealer lose, you win!" );
            System.exit( 0 );
        }
    }

    public void whoWonComparison() {
        condition();
        if (moveDealer > Gambler.moveGambler) {
            System.out.println( "Your total: " + Gambler.moveGambler );
            System.out.println( "You lose, dealers win" );
            System.exit( 0 );
        }
        if (moveDealer < Gambler.moveGambler) {
            System.out.println( "You win" );
            System.exit( 0 );
        }
        if (moveDealer == Gambler.moveGambler) {
            System.out.println( "Your total: " + Gambler.moveGambler );
            System.out.println( "Draw" );
            System.exit( 0 );
        }
    }

    @Override
    public void firstMove() {
        System.out.println( "The dealer has: " + drawCard() + " showing, and hidden, too." );
        moveDealer = card;
        moveDealer += drawCard();
    }

    @Override
    public void hittingNextCard() {
        System.out.println( "\n Dealer choose to hit" );
        System.out.println( "He drew a " + drawCard() );
        moveDealer += card;
        System.out.println( "His total is " + moveDealer );
        condition();

    }

    private void dealersStrategy() {
        if (moveDealer <= 17) {
            hittingNextCard();
        }
        if (moveDealer > 17) {
            System.out.println( "Dealer choose to stays.\n" );
            System.out.println( "His total is " + moveDealer );
            condition();
        }
    }

    @Override
    public void decisionChoiceToHitOrStay() {
        if (Gambler.hitOrStayDecision.equals( "stay" )) {
            hittingNextCard();
            dealersStrategy();
            whoWonComparison();
        } else if (!"stay".equals( Gambler.hitOrStayDecision )) {
            if (!"hit".equals( Gambler.hitOrStayDecision ))
                System.out.println( "Wrong" );
            System.exit( 0 );
        }
    }

}





