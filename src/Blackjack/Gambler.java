package Blackjack;

public class Gambler extends Player {

    public static void main(String[] args) {
        movesGambler();
    }

    public void decision() {
        do {
            decisionIn(in);
        }
        while (decision.equals("hit") && moveGambler < 21);
    }


}


