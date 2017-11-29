package Blackjack;

public class Gambler extends Player {


    public void moves() {
        System.out.println("You get: " + getCard1() + " and " + getCard1());
        System.out.println("You total is: " + (getCard1() + getCard1()));
    }

}

