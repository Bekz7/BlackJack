package Blackjack.Runner;

import Blackjack.Dealer;
import Blackjack.Gambler;
import Blackjack.Player;

public class BlackJackRunner {
    public static void main(String[] args) {
        Player player = new Player();

        //1. Gambler first move
        Player.movesGambler();

        //2. Dealer first move
        player.firstMoveDealer();

        //3. Gambler decision to hit or stay
        Gambler gambler = new Gambler();
        gambler.decision();

        //4. Dealer next moves
        player.moveDealer();

        //5. Comparison players
        player.comparison();

    }
}
