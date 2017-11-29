package Blackjack;

public class Gambler extends Player {


    public void moves() {
        System.out.print("You get: " + getCard1());
        card2 = card1;
        System.out.println(" and " + getCard1());
        System.out.println("You total is: " + (card1+card2));
        firstMoveGambler = card1 + card2;
    }

    public void decision() {
        System.out.printf("Would you like hit or stay? ");
        desicion = in.nextLine();
        if (desicion == "hit"){

        }


    }
}

