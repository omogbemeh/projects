package com.omogbemeh.guessinggame;

import java.util.Random;

public class GuessingGame {
    public String guess(int guess) {
        if (guess < 1 || guess > 10) return "Number not in range.";
        return guess >= 1 && guess <= 10 ? "You won!" : "You lost";
    }

    public int getRandomNUmber() {
        Random rand = new Random();
        int randNum = rand.nextInt(10) + 1;
        return randNum;
    }
}
