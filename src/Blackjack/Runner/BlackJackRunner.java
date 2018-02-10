package Blackjack.Runner;

import Blackjack.*;

import java.io.IOException;

public class BlackJackRunner {
    public static void main(String[] args) throws IOException {

       // 1. Creating players
        Player dealer = new Dealer();
        Player gambler = new Gambler();

        // 2. Creating game and adding players
        Game game = new Game();
        game.addPlayer( (Gambler) gambler );
        game.addPlayer( (Dealer) dealer );

        // 3. Preparing table for play
        game.preparingTable();

        //4. Moves players
        game.playersMoves();

        // 5. Players decision
        game.playersDecisions();

        // 6. Checking who's won the game
        game.whoWonTheGame();


    }
}
