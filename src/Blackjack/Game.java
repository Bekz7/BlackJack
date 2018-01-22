package Blackjack;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int drawledCard;
    static StatusRound hitOrStayDecision;
    Player gambler = new Gambler();
    Player dealer = new Dealer();

    static int drawnCard() {
        Random random = new Random();
        return drawledCard = 1 + random.nextInt( 10 );
    }


    public static int getDrawledCard() {
        return drawledCard;
    }

    public void condition() {
        if (dealerHasExceedTwentyOne()) {
            dealerLose();
        } else if (gamblerHasExceedTwentyOne()) {
            playerLose();
        }
    }

    private void playerLose() {
        gameResults();
        System.out.println( "You lose, dealers win ;(" );
        System.exit( 0 );
    }

    private void dealerLose() {
        gameResults();
        System.out.println( "Dealer lose, you win!" );
        System.exit( 0 );
    }

    private void draw() {
        gameResults();
        System.out.println( "Draw" );
        System.exit( 0 );
    }

    private void gameResults() {
        System.out.println( "Your total: " + Gambler.getGamblerPoints() );
        System.out.println( "Dealer's total: " + Dealer.getDealerPoints() );
    }

    public void whoWonTheGame() {
        condition();
        if (dealerHasBetterCards()) {
            playerLose();
        } else if (dealerHasWorseCards()) {
            dealerLose();
        } else if (dealerHasEqualsCards()) {
            draw();
        }
    }

    private boolean dealerHasBetterCards() {
        return Dealer.getDealerPoints() > Gambler.getGamblerPoints();
    }

    private boolean dealerHasWorseCards() {
        return Dealer.getDealerPoints() < Gambler.getGamblerPoints();
    }

    private boolean dealerHasEqualsCards() {
        return Dealer.getDealerPoints() == Gambler.getGamblerPoints();
    }

    private boolean dealerHasExceedTwentyOne() {
        return Dealer.getDealerPoints() > 21;
    }

    private boolean gamblerHasExceedTwentyOne() {
        return Gambler.getGamblerPoints() > 21;
    }

    private void decisionChoiceToHitOrStay() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Would you like HIT or STAY? " );
        String decisionInput = in.nextLine();
        hitOrStayDecision.setKeyboardInput( decisionInput );
    }

    public void addPlayer(Player player) {
        gambler = player;
        dealer = player;
    }

}
