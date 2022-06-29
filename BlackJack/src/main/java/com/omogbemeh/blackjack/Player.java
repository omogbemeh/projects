package com.omogbemeh.blackjack;

public class Player {
    private String name;
    private int hand;

    public String getName() {
        return name;
    }

    public int getHand() {
        return hand;
    }

    public Player(String name) {
        this.name = name;
        this.hand = 0;
    }

    public void drawCard() {
        Card card = Card.getRandomCard();
    }
}
