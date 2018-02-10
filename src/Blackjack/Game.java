package Blackjack;


import java.io.IOException;

public class Game {

    private Gambler gambler = new Gambler();
    private Dealer dealer = new Dealer();
    static DeckOfCards playingDeck = new DeckOfCards();

    public void preparingTable() throws IOException {
        playingDeck.currentDeck();
    }

    public void addPlayer(Dealer player) {
        this.dealer = player;
    }

    public void addPlayer(Gambler player) {
        this.gambler = player;
    }

    public void playersMoves() {
        gambler.move();
        dealer.move();
    }

    public void playersDecisions() {
        gambler.decisionChoiceToHitOrStay();
        dealer.decisionChoiceToHitOrStay();
    }

    public void whoWonTheGame() {
        condition();
        dealerWinCondition();
        playerWinCondition();
        drawCondition();
    }

    private void condition() {
        if (isDealerHasExceedTwentyOne()) {
            dealerLose();
        } else if (isGamblerHasExceedTwentyOne()) {
            playerLose();
        }
    }

    private boolean isDealerHasExceedTwentyOne() {
        return Dealer.getDealerCards().cardsValue() > 21;
    }

    private void dealerLose() {
        gameResults();
        System.out.println( "Dealer lose, you win!" );
        System.exit( 0 );

    }

    private boolean isGamblerHasExceedTwentyOne() {
        return gambler.getGamblerCards().cardsValue() > 21;
    }

    private void playerLose() {
        gameResults();
        System.out.println( "You lose, dealers win ;(" );
        System.exit( 0 );
    }

    private void dealerWinCondition() {
        if (isDealerHasBetterCards()) {
            playerLose();
        }
    }

    private boolean isDealerHasBetterCards() {
        return Dealer.getDealerCards().cardsValue() > gambler.getGamblerCards().cardsValue();
    }

    private void playerWinCondition() {
        if (isDealerHasWorseCards()) {
            dealerLose();
        }
    }

    private boolean isDealerHasWorseCards() {
        return Dealer.getDealerCards().cardsValue() < gambler.getGamblerCards().cardsValue();
    }

    private void drawCondition() {
        if (isPlayersHasEqualsCards()) {
            draw();
        }
    }

    private boolean isPlayersHasEqualsCards() {
        return Dealer.getDealerCards().cardsValue() == gambler.getGamblerCards().cardsValue();
    }

    private void draw() {
        gameResults();
        System.out.println( "Draw" );
        System.exit( 0 );
    }

    private void gameResults() {
        System.out.println();
        System.out.println( "Your total: " + gambler.getGamblerCards().cardsValue() );
        System.out.println( "Dealer's total: " + Dealer.getDealerCards().cardsValue() );
    }

}
