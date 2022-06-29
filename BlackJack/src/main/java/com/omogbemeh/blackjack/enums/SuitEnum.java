package com.omogbemeh.blackjack.enums;

public enum SuitEnum {
    CLUBS("\u2663"),
    DIAMONDS("\u2666"),
    HEARTS("\u2665"),
    SPADES("\u2660");

    public String value;
    final public int length = 4;

    SuitEnum(String value) {
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
