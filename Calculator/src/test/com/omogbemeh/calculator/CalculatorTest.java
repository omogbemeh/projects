package com.omogbemeh.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1,1);
        Assertions.assertEquals(2, sum);
    }

    @Test
    public void canAddTwoNegative1() {
        int sum = calc.add(-1, -1);
        Assertions.assertEquals(-2, sum);
    }
}
