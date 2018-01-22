package Blackjack.Runner;

import Blackjack.Dealer;
import Blackjack.Gambler;
import Blackjack.Game;
import Blackjack.Player;

public class BlackJackRunner {
    public static void main(String[] args) {

        Player gambler = new Gambler();
        Player dealer = new Dealer();

        Game game = new Game();

        game.addPlayer( gambler );
        game.addPlayer( dealer );
        gambler.firstMove();
        dealer.firstMove();
        gambler.decisionChoiceToHitOrStay();
        dealer.decisionChoiceToHitOrStay();

        game.whoWonTheGame();

    }
}
