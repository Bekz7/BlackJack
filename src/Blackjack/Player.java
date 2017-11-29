package Blackjack;

import java.util.Random;

public class Player {

    Random random = new Random(1);
    private int card1;
    int card2 = 1 + random.nextInt(10);

    public int getCard1() {
        return card1= 1 + random.nextInt(10);
    }

    public int getCard2() {
        return card2;
    }

}
