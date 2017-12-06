package Blackjack;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private static Random random = new Random();
    private static int card;
    static int moveGambler;
    private static int moveDealer;
    static String decision;
    static Scanner in = new Scanner(System.in);

    private static int randomCard() {
        return card = 1 + random.nextInt(10);
    }

    static void decisionIn(Scanner in) {
        System.out.print("Would you like hit or stay? ");
        decision = in.nextLine();
        if (decision.equals("hit")) {
            hitGambler();
            condition();
        }
        if (decision.equals("stay")) {
            hitDealer();
            condition();
        }
        else {
            System.out.println("Wrong");
            System.exit(0);
        }
    }

    public static void movesGambler() {
        System.out.print("You get: " + randomCard());
        moveGambler = card;
        System.out.println(" and " + randomCard());
        moveGambler += card;
        System.out.println("You total is: " + moveGambler + "\n");
    }

    private static void hitGambler() {
        System.out.println("You drew " + randomCard());
        moveGambler += card;
        System.out.println("You totally have: " + moveGambler + "\n");
    }

    public static void firstMoveDealer() {
        System.out.println("The dealer has: " + randomCard() + " showing, and hidden, too.");
        moveDealer = card;
        moveDealer += randomCard();
    }

    private static void hitDealer() {
        System.out.println("\n Dealer choose to hit");
        System.out.println("He drew a " + randomCard());
        moveDealer += card;
        System.out.println("His total is " + moveDealer);
        System.out.println();
    }

    public static void moveDealer() {
        if (moveDealer < 17) {
            do {
                hitDealer();
            }
            while (moveDealer < 17);
        }
        if (moveDealer > 17) {
            System.out.println("Dealer choose to stays.\n\n");
            System.out.println("His total is " + moveDealer);
        }
    }

    public static void comparison() {
        if (moveDealer > moveGambler) {
            System.out.println("Your total: " + moveGambler);
            System.out.println("You lose, dealers win");
            System.exit(0);
        }
        if (moveDealer < moveGambler) {
            System.out.println("You win");
            System.exit(0);
        }
        if (moveDealer == moveGambler){
            System.out.println("Your total: " + moveGambler);
            System.out.println("Draw");
            System.exit(0);
        }
    }

    private static void condition() {
        if (moveDealer > 21) {
            System.out.println("Dealer lose, you win!");
            System.exit(0);
        }
        if (moveGambler > 21) {
            System.out.println("You lose, dealers win ;(");
            System.exit(0);
        }

    }
}
