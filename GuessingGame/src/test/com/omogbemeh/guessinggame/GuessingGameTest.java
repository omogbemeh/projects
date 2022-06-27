package com.omogbemeh.guessinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        String message = game.guess(3);
        assertEquals("You won!", message);
    }

    @Test
    public void testGuessWithNegativeNum() {
        String message = game.guess(-2);
        assertEquals("Number not in range.", message);
    }

    @Test
    public void testAnswerRandomNess() {
        int[] possibleGuesses = new int[10];

        for (int i = 0; i < 100; i++) {
            int randNum = game.getRandomNUmber();
            possibleGuesses[randNum - 1] = 1;
        }

        int sum = 0;
        for (int guess : possibleGuesses) sum += guess;

        assertEquals(10, sum);
    }
}
