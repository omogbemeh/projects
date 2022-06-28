package com.omogbemeh.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private int guessLimit = 3;
    private int answer = new Random().nextInt(10) + 1;;
    private boolean guessedRight = false;

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        System.out.println("- Can you guess the right number between 1 and 10 inclusive? you have 3 tries to get it.");
        System.out.println("- Enter \"q\" at any time to leave the game.");
        while (game.guessLimit >= 1 && game.guessedRight == false) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            String userInput = sc.nextLine();
            if ("q".equals(userInput)) return;
            String message = game.guess(Integer.parseInt(userInput));
            System.out.println(message);
        }
    }

//    private int answer = 1;

    public int getAnswer() {
        return answer;
    }
    public void setGuessLimit() {
        this.guessLimit--;
    }

    public int getGuessLimit() {
        return guessLimit;
    }

    public String guess(int guess) {
        if (guess <= 0 || guess >= 11) return "Number not in range.";
        if (guess == answer && guessLimit == 3) {
            guessedRight = true;
            return gotItInOneTry();
        }
        if (guess == answer && guessLimit >= 1) {
            guessedRight = true;
            return gotItInMultipleTries(guessLimit);
        };
        if (guess != answer && guessLimit <= 0) return "You are out of guesses";
        if (guess > answer && guessLimit >= 2) {
            setGuessLimit();
            return "Too high, guess lower";
        }
        if (guess < answer && guessLimit >= 2) {
            setGuessLimit();
            return "Too Low, guess higher";
        }
        setGuessLimit();
        return "You Lost!";
    }

    public String gotItInOneTry() {
        return "You got it in 1 try!";
    }

    public String gotItInMultipleTries(int tryCount) {
        String template = String.format("You got it in %d tries", 4 - tryCount);
        return template;
    }

    public int getRandomNumber() {
        return answer;
    }
}
