package Blackjack;

import java.util.Random;
import java.util.Scanner;

public class Player {

    Random random = new Random();
    int card1;
    int card2;
    int firstMoveGambler;
    int firstMoveDealer;
    String desicion;
    Scanner in = new Scanner(System.in);

    public int getCard1() {
        return card1= 1 + random.nextInt(10);
    }


}
