package Blackjack.Runner;

import Blackjack.Gambler;
import Blackjack.Player;

public class BlackJackRunner {
    public static void main(String[] args) {

        //1. Gambler first move
        Player.movesGambler();

        //2. Dealer first move
        Player.firstMoveDealer();

        //3. Gambler decision to hit or stay
        Gambler gambler = new Gambler();
        gambler.decision();

        //4. Dealer next moves
        Player.moveDealer();

        //5. Comparison players
        Player.comparison();

    }
}
