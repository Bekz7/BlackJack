package Blackjack;

import static Blackjack.StatusRoundManager.StatusRound.*;

public class StatusRoundManager {

    private String keyboardInput = STAY.name();

    enum StatusRound {
        HIT, STAY, INCORRECT_STATE
    }

    protected void setKeyboardInput(String keyboardInput) {

        if ( "hit".equalsIgnoreCase( keyboardInput)) {
            this.keyboardInput = HIT.name();

        } else if ("Stay".equalsIgnoreCase( keyboardInput)) {
            this.keyboardInput = STAY.name();

        } else this.keyboardInput = INCORRECT_STATE.name();
    }

    protected String getKeyboardInput() {
        return keyboardInput;
    }


    protected boolean isHitting() {
        return getKeyboardInput().equalsIgnoreCase( HIT.name() );
    }

    protected boolean isStaying() {
        return getKeyboardInput().equalsIgnoreCase( STAY.name() );
    }

    protected boolean isIncorrectInput() {
        return getKeyboardInput().equals(INCORRECT_STATE.name() );
    }

}