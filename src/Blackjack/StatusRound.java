package Blackjack;

public enum StatusRound {
    HIT, STAY, INCORRECT_STATE;

    private StatusRound keyboardInput;

    void setKeyboardInput(String keyboardInput) {
        if ("HIT".equalsIgnoreCase( keyboardInput )) {
            this.keyboardInput = HIT;
        } else if ("STAY".equalsIgnoreCase( keyboardInput )) {
            this.keyboardInput = STAY;
        } else {
            this.keyboardInput = INCORRECT_STATE;
        }
    }

    public StatusRound getKeyboardInput() {
        return keyboardInput;
    }
}