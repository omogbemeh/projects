package com.omogbemeh.blackjack.enums;

import java.util.Random;

public enum Suit {
    CLUBS('\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665'),
    SPADES('\u2660');

    private static final Random RAND = new Random();
    public char value;
    private static Suit[] values = values();
    final static public int LENGTH = values().length;

    Suit(char symbol) {
        this.value = symbol;
    }

    public int getLength() {
        return LENGTH;
    }

    public static Suit getRandomSuit() {
        int randNum = RAND.nextInt(Suit.LENGTH);
        return values[randNum];
    }

    @Override
    public String toString() {
        return Character.toString(this.value);
    }
}
