package com.omogbemeh.calculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

public class Calculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public String calcAnnuity(String capital, String rate, String interest, String time) throws ParseException {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String parsedCapital = nf.parse(capital).toString();
        BigDecimal R = new BigDecimal(parsedCapital);
        BigDecimal r = new BigDecimal(rate);
        BigDecimal n = new BigDecimal(interest);
        BigDecimal t = new BigDecimal(time);
        BigDecimal rOverN = r.divide(n);
        BigDecimal nt = n.multiply(t);
        BigDecimal onePlusROverNToPowNT = BigDecimal.ONE.add(rOverN);
        BigDecimal onePlusROverNToPowNT2 = onePlusROverNToPowNT.pow(nt.intValue());
        BigDecimal onePlusROverNToPowNTMinusOne = onePlusROverNToPowNT2.subtract(BigDecimal.ONE);
        BigDecimal onePlusROverNToPowNTMinusOneDividedByROverN = onePlusROverNToPowNTMinusOne.divide(rOverN);
        BigDecimal finalAnswer = R.multiply(onePlusROverNToPowNTMinusOneDividedByROverN);
        String finalCurr = nf.format(finalAnswer);
        return finalCurr;
    }
}
