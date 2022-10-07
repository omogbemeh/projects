package com.omogbemeh.people.formatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


@Component
public class SalaryFormatter implements Formatter<BigDecimal> {
    @Override
    public String print(BigDecimal object, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(object);
    }

    @Override
    public BigDecimal parse(String text, Locale locale) throws ParseException {
        return null;
    }
}
