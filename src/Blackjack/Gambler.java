package Blackjack;

import java.util.Random;
import java.util.Scanner;

public class Gambler implements Game {

    private int card;
    static int moveGambler;
    private Random random = new Random();
    static String hitOrStayDecision;
    private Scanner in = new Scanner( System.in );

    @Override
    public int drawCard() {
        return card = 1 + random.nextInt( 10 );
    }

    @Override
    public void condition() {
        if (moveGambler > 21) {
            System.out.println( "You lose, dealers win ;(" );
            System.exit( 0 );
        }
    }

    @Override
    public void firstMove() {
        System.out.print( "You get: " + drawCard() );
        moveGambler = card;
        System.out.println( " and " + drawCard() );
        moveGambler += card;
        System.out.println( "You total is: " + moveGambler + "\n" );
    }

    @Override
    public void decisionChoiceToHitOrStay() {
        System.out.print( "Would you like hit or stay? " );
        hitOrStayDecision = in.nextLine();
        if (hitOrStayDecision.equals( "hit" )) {
            hittingCardUntil();
        }
    }

    private void hittingCardUntil() {
        do {
            hittingNextCard();
        }
        while (hitOrStayDecision.equals( "hit" ));
    }

    @Override
    public void hittingNextCard() {
        System.out.println( "You drew " + drawCard() );
        moveGambler += card;
        System.out.println( "You totally have: " + moveGambler + "\n" );
        condition();
    }
}

