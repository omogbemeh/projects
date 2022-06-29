package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Emoji;
import com.omogbemeh.blackjack.enums.SuitEnum;

import java.util.Scanner;

public class BlackJack {
    final private String dice = Emoji.DICE_EMOJI.toString();
    final private String casinoEmoji = Emoji.CASINO_EMOJI.toString();
    final private String crystalBallEmoji = Emoji.CRYSTAL_BALL_EMOJI.toString();
    private String playerName = "";
    private Player player = null;

    public static void main(String[] args) {
        BlackJack game = new BlackJack();
//        game.start();
    }

    public void start() {
        setPlayerName();
        printInstructions(playerName);
        System.out.printf("%s Lets begin, press \"h\" to draw card...", dice);

        while (true) {
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            if ("h".equals(userInput)) break;
            System.out.printf("%s Please enter a valid input%n", dice);
            printInstructions(playerName);
        }

    }


    public void setPlayerName() {
        System.out.printf("%s Hello, Welcome to the Praise's BlackJack's casino %s %s !%n", dice, casinoEmoji, casinoEmoji);
        System.out.printf("%s Enter your name: ", dice);
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().strip();
        player = new Player(userInput);
        playerName = player.getName();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void printInstructions(String name) {
        System.out.printf("%s Hello %s %s %s, these are the keys you need to play:%n", dice, crystalBallEmoji, name, crystalBallEmoji);
        System.out.printf("%s Press \"h\" for a \"hit\"%n", dice);
        System.out.printf("%s Press \"s\" for a \"stand\"%n", dice);
    }


}
