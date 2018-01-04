package Blackjack.Runner;

import Blackjack.Dealer;
import Blackjack.Gambler;
import Blackjack.Game;



public class BlackJackRunner {
    public static void main(String[] args) {

        //1. Create instance of Gambler
        Game gambler = new Gambler();

        //2. Gambler's first move
        gambler.firstMove();

        //3. Create instance of Dealer
        Dealer dealer = new Dealer();

        //4. Dealer's first move
        dealer.firstMove();

        //5. Gambler's decisionChoiceToHitOrStay to hit or stay
        gambler.decisionChoiceToHitOrStay();

        //6. Dealer's decisionChoiceToHitOrStay to hit or stay
        dealer.decisionChoiceToHitOrStay();

        //7. Checking who's win
        dealer.whoWonComparison();

    }
}
