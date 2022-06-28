package com.omogbemeh.guessinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;
    private int answer;

    public String generateAnAmountOfWrongGuesses(int num) {
        int guessCount = num;
        String finalStr = "";
        int wrongGuess = game.getAnswer() >= 10 ? game.getAnswer() - 1 : game.getAnswer() + 1;
        for (int i = 0; i < guessCount; i++) {
            finalStr = game.guess(wrongGuess);
        }
        return  finalStr;
    }

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
//        game.guess(4);
        int answer = game.getAnswer();
        String message = game.guess(answer);
        String expected = String.format("You got it in 1 try!");
        assertEquals(expected, message);
    }

    @Test
    public void testGuessWithNegativeNum() {
        String message = game.guess(-2);
        assertEquals("Number not in range.", message);
    }

    @Test
    public void testAnswerRandomNess() {
        int[] possibleGuesses = new int[10];

        for (int i = 0; i < 60; i++) {
            GuessingGame localGame = new GuessingGame();
            int randNum = localGame.getRandomNumber();
            possibleGuesses[randNum - 1] = 1;
        }

        int sum = 0;
        for (int guess : possibleGuesses) sum += guess;

        assertEquals(10, sum);
    }

    @Test
    public void testMoreThan3WrongGuesses() {
        int guessLimit = game.getGuessLimit();
        int guessCount = 0;
        String message = generateAnAmountOfWrongGuesses(4);
        assertEquals("You are out of guesses", message);
    }
}
