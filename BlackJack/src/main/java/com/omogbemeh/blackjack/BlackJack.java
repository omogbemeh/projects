package com.omogbemeh.blackjack;

public class BlackJack {
    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        game.printStartMessage();
    }

    public void printStartMessage() {
        String dice = "\uD83C\uDFB2";
        System.out.printf("%s Hello, Welcome to the Praise's BlackJack's casino \uD83C\uDFB0!%n", dice);
        System.out.printf("%s Press \"h\" for a \"hit\"%n", dice);
        System.out.printf("%s Press \"s\" for a \"stand\"%n", dice);
    }
}
