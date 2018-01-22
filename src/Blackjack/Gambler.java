package Blackjack;

import java.util.Scanner;

public class Gambler implements Player {

    private static int gamblerPoints;
    static StatusRound hitOrStayDecision;

    public static int getGamblerPoints() {
        return gamblerPoints;
    }

    @Override
    public void firstMove() {
        System.out.print( "You get: " + Game.drawnCard() );
        gamblerPoints = Game.getDrawledCard();
        System.out.println( " and " + Game.drawnCard() );
        gamblerPoints += Game.getDrawledCard();
        System.out.println( "You total is: " + gamblerPoints + "\n" );
    }

    @Override
    public void decisionChoiceToHitOrStay() {
        Scanner in = new Scanner( System.in );
        String decisionInput;

        System.out.print( "Would you like HIT or STAY? " );
        decisionInput = in.nextLine();
        hitOrStayDecision.setKeyboardInput( decisionInput );

        if (hitChoosing()) {
            hittingNextCard();
            decisionChoiceToHitOrStay();
        } else if (stayChoosing()) {
            return;
        }
    }

    @Override
    public void hittingNextCard() {
        System.out.println( "You chose to HIT" );
        System.out.println( "You drew " + Game.drawnCard() );
        gamblerPoints += Game.getDrawledCard();
        System.out.println( "You totally have: " + gamblerPoints + "\n" );
    }

    boolean hitChoosing() {

        if ("hit".equals( hitOrStayDecision.getKeyboardInput() )) return true;
        else return false;
    }

    private boolean stayChoosing() {
        return "stay".equals( hitOrStayDecision.getKeyboardInput() );
    }
}