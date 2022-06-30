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
//            Scanner sc = new Scanner(System.in);
//            String userInput = sc.nextLine();
            if ("h".equals(inp)) {
                gameBegins();
                continue;
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
        System.out.printf("%s Hello %s %s %s, these are the rules:%n", dice, crystalBallEmoji, player.getName(), crystalBallEmoji);
    }

    public void printInstructions() {
        System.out.printf("%s >> \"h\" to get a new card%n", dice);
        System.out.printf("%s >> \"s\" to stand%n", dice);
    }

    public String getCard() {
        System.out.printf("%s Enter an input: ", dice);
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().strip();
        return userInput;
    }

    public String gameBegins() {
//        System.out.printf("%s ============================== %s%n", dice, dice);
        player.drawCard();
        house.drawCard();
        System.out.printf("%s ============================== %s%n", dice, dice);
        String userInput = getCard();
        return userInput;
    }

}
