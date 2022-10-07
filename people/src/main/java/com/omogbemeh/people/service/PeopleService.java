package com.omogbemeh.people.service;

import com.omogbemeh.people.enums.Gender;
import com.omogbemeh.people.model.Person;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {

    public static List<Person> generateFiveUsers() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1l, "Praise", "Omogbemeh", LocalDate.of(1998, Month.DECEMBER, 23), Gender.BOY, new BigDecimal("170000")));
        personList.add(new Person(2l, "Faith", "Omogbemeh", LocalDate.of(2001, Month.JANUARY, 17), Gender.GIRL, new BigDecimal("180000")));
        personList.add(new Person(3l, "Divine", "Omogbemeh", LocalDate.of(2003, Month.MARCH, 23), Gender.GIRL, new BigDecimal("190000")));
        personList.add(new Person(4l, "Baridilo", "Kponi", LocalDate.of(1996, Month.NOVEMBER, 19), Gender.BOY, new BigDecimal("200000")));
        personList.add(new Person(5l, "Nelson", "Oham", LocalDate.of(1997, Month.DECEMBER, 8), Gender.BOY, new BigDecimal("210000")));
        return personList;
    }

    public static String formatDate(LocalDate date) {
        int year = date.getYear();
        Month month = date.getMonth();
        int dayOfMonth = date.getDayOfMonth();
        return String.format("%d, %s, %d", year, month.toString(), dayOfMonth);
    }

    public static String formatMoney(BigDecimal bigDecimal) {
        NumberFormat ci = NumberFormat.getCurrencyInstance();
        return ci.format(bigDecimal.longValue());
    }
}
