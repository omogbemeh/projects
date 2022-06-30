package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Emoji;

public class House extends Player {
    private int drawCount = 0;
    private String name;

    private boolean isFirstCard = true;
    private boolean isOverSeventeen = false;

    public House(String name) {
        super(name);
    }

    public House() {
        this.name = "House";
    }

    public int getHand() {
        return this.hand;
    }

    @Override
    public void printHandInfo(Card card) {
        switch (this.drawCount) {
            case 0:
                System.out.printf("%s %s draws a %s%n", Emoji.CASINO_EMOJI, this.name, card.toString());
                this.drawCount++;
                break;
            default:
                System.out.printf("%s %s draws another card %n", Emoji.CASINO_EMOJI, name);
        }
    }

    @Override
    public void drawCard() {
        Card card = Card.getRandomCard();
        this.updateHand(card);
    }
}
