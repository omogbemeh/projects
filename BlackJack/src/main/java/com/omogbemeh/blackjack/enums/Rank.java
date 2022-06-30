package com.omogbemeh.blackjack.enums;

import java.util.Random;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    KING(10),
    QUEEN(10),
    JACK(10);

    final static private Random RAND = new Random();

    final static public int LENGTH = values().length;

    public int value;

    Rank(int val) {
        this.value = val;
    }

    public static Rank getRandomEnum() {
        int randNum = RAND.nextInt(values().length);
        return values()[randNum];
    }

    int getLength() {
        return this.LENGTH;
    }
}
