package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Emoji;

public class House extends Player {
    private int hand;
    private String name;
    private int drawCount = 0;
    private boolean isFirstCard = true;

    public House(String name) {
        super(name);
    }

    public House() {
        name = "House";
    }

    @Override
    public void drawCard() {
        Card card = Card.getRandomCard();
        hand += card.getRank();
        if (drawCount == 0) {
            System.out.printf("%s %s draws a %s%n", Emoji.CASINO_EMOJI, name, card.toString());
            drawCount++;
        }
    }
}
