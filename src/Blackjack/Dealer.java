package Blackjack;

public class Dealer extends Player {


    public void firstMove() {
        System.out.print("The dealer has: " + getCard1() + " showing, and hidden, too.");
        card2 = card1;
        firstMoveDealer = getCard1() + card2;
    }
}
