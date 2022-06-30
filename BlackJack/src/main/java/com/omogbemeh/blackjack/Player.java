package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Emoji;

public class Player {
    private String name;
    private int hand;

    public Player(String name) {
        this.name = name;
        this.hand = 0;
    }
    public Player() {}
    public static void main(String[] args) {
        Player player = new Player("Praise");
        player.drawCard();
    }
    public String getName() {
        return name;
    }

    public int getHand() {
        return hand;
    }



    public void drawCard() {
        Card card = Card.getRandomCard();
        this.updateHand(card);
        System.out.printf("%s %s draws a %s :: Hand: %d%n", Emoji.CRYSTAL_BALL_EMOJI, name, card.toString(), hand);
    }

    public void updateHand(Card card) {
        this.hand += card.getRank();
    }
}
