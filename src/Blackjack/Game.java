package Blackjack;

import java.util.Scanner;

public interface Game {

    int drawCard();

    void condition();

    void firstMove();

    void decisionChoiceToHitOrStay();

    void hittingNextCard();

}
