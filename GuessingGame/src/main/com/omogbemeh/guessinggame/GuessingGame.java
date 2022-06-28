package com.omogbemeh.guessinggame;

import java.util.Random;

public class GuessingGame {
    private int guessLimit = 3;
    private int answer = new Random().nextInt(10) + 1;;

    public static void main(String[] args) {
        GuessingGame test = new GuessingGame();
        test.guess(2);
        test.guess(2);
        System.out.println(test.guess(1));
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
        System.out.println(getAnswer());
        if (guess <= 0 || guess >= 11) return "Number not in range.";
        if (guess == answer && guessLimit == 3) return gotItInOneTry();
        if (guess == answer && guessLimit >= 1) return gotItInMultipleTries(guessLimit);
        if (guess != answer && guessLimit <= 0) return "You are out of guesses";
        if (guess != answer) {
            setGuessLimit();
        };
        return "You Lost!";
    }

    public String gotItInOneTry() {
        return "You got it in 1 try!";
    }

    public String gotItInMultipleTries(int tryCount) {
        String template = String.format("You got it in %d tries", tryCount);
        return template;
    }

    public int getRandomNumber() {
        return answer;
    }
}
