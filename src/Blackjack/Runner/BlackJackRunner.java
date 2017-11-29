package Blackjack.Runner;

import Blackjack.Dealer;
import Blackjack.Gambler;

public class BlackJackRunner {
    public static void main(String[] args) {

        //1. Gambler first moves
        Gambler gambler = new Gambler();
        gambler.moves();

        //2. Dealer first moves
        Dealer dealer = new Dealer();
        dealer.firstMove();

        //3. Gambler decision
        gambler.decision();

    }
}
