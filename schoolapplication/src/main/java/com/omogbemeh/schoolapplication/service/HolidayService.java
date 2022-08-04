package com.omogbemeh.schoolapplication.service;

import com.omogbemeh.schoolapplication.models.Holiday;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HolidayService {
    public List<Holiday> getHolidays() {
        ArrayList<Holiday> holidays = new ArrayList<>();
        holidays.add(new Holiday("Jan 1", "New year's", Holiday.Type.FESTIVAL));
        holidays.add(new Holiday("Dec 25", "Christmas Day", Holiday.Type.FESTIVAL));
        holidays.add(new Holiday("July 1", "Canada's day", Holiday.Type.FEDERAL));
        holidays.add(new Holiday("Dec 23", "My birthday", Holiday.Type.FEDERAL));
        return holidays;
    }
}
