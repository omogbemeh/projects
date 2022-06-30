package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Emoji;

import java.util.Scanner;

public class BlackJack {
    final private String dice = Emoji.DICE_EMOJI.toString();
    final private String casinoEmoji = Emoji.CASINO_EMOJI.toString();
    final private String crystalBallEmoji = Emoji.CRYSTAL_BALL_EMOJI.toString();
    final private String waveEmoji = Emoji.WAVE.toString();

    private String playerName = "";
    private Player player = null;
    private House house;

    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        game.start();
    }

    public BlackJack() {
        house = new House();
    }

    public void start() {
        setPlayerName();
        printInstructions();
        getCard();

        while (true) {
            String inp = gameBegins();
            if ("h".equals(inp)) {
                gameBegins();
                continue;
            } else if ("s".equals(inp)) {
                calculateHand();
                return;
            } else {
                System.out.printf("%s Please enter a valid input%n", dice);
                printInstructions();
            }
        }

    }

    public void setPlayerName() {
        System.out.printf("%s Hello %s, Welcome to the Praise's BlackJack's casino %s %s !%n", dice, waveEmoji, casinoEmoji, casinoEmoji);
        System.out.printf("%s Enter your name to begin: ", dice);
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().strip();
        player = new Player(userInput);
        playerName = player.getName();
        System.out.printf("%s Hello %s %s, these are the rules:%n", dice, player.getName(), crystalBallEmoji);
    }

    public void printInstructions() {
        System.out.printf("%s >> \"h\" to get a new card%n", dice);
        System.out.printf("%s >> \"s\" to stand%n", dice);
    }

    public String getCard() {
        System.out.printf("%s Enter \"h\" to get card, and \"s\" to stand: ", dice);
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().strip();
        return userInput;
    }

    public String gameBegins() {
        player.drawCard();
        house.drawCard();
        System.out.printf("%s ============================== %s%n", dice, dice);
        String userInput = getCard();
        return userInput;
    }

    private void calculateHand() {
        house.setPlayerHasStood(true);
        if (player.getHand() > 21) {
            System.out.printf("%s Bust! Game over 😢😢%n", Emoji.CRYSTAL_BALL_EMOJI);
            return;
        }

        if (house.getHand() < 17) {
            System.out.printf("%s House currently has a hand less than 17%n", Emoji.CASINO_EMOJI);
            System.out.printf("%s House is going to keep drawing cards, till it equal or greater than 17%n", Emoji.CASINO_EMOJI);
            System.out.printf("%s ========================================= %s%n", Emoji.CASINO_EMOJI,Emoji.CASINO_EMOJI);
        }

        while (house.getHand() < 17) house.drawCard();

        if (house.getHand() > 21) {
            System.out.printf("%s You won 🎉🎉 !!", Emoji.CRYSTAL_BALL_EMOJI);
            return;
        }

        System.out.printf("You have a hand of %d%n", player.getHand());
        System.out.printf("House has a hand of %d%n", house.getHand());
        String message = house.getHand() > player.getHand() ? "The house won!" : "You won";
        System.out.println(message);
    }

}
