package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Emoji;

public class Player {
    private String name;

    protected int hand;
    protected int numberOfAceInHand = 0;

    private boolean hasStood = false;
    public boolean hasAceInHand = false;

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
    }

    public void updateHand(Card card) {
        if (card.getSuit() == "Ace") this.numberOfAceInHand++;
        if (this.numberOfAceInHand >= 1 && this.hand > 21) {
            this.hand += card.getRank();
            this.hand -= (10 * this.numberOfAceInHand);
        } else if (this.numberOfAceInHand >= 1 && this.hand < 21) {
            this.hand += card.getRank();
            this.hand += 10;
        } else this.hand += card.getRank();
        this.printHandInfo(card);
    }

    public void printHandInfo(Card card) {
        System.out.printf("%s %s draws a %s :: Hand: %d%n", Emoji.CRYSTAL_BALL_EMOJI, name, card.toString(), hand);
    }
}
