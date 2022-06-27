package com.omogbemeh.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.ParseException;

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

    @Test
    public void canCalcAnnuity() throws ParseException {
        String annuity = calc.calcAnnuity("$22,000", ".06", "1", "7");
        Assertions.assertEquals("$184,664.43", annuity);
    }

    @Test
    public void canCalcAnnuity2() throws ParseException {
        String annuity = calc.calcAnnuity("$1,200", ".08", "4", "10");
        Assertions.assertEquals("$72,482.38", annuity);
    }
}
