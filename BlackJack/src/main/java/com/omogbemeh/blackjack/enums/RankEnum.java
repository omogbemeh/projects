package com.omogbemeh.blackjack.enums;

public enum RankEnum {
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

    public int value;
    final static public int LENGTH = 13;
    RankEnum(int val) {
        this.value = val;
    }

    int getLength() {
        return this.LENGTH;
    }


}
