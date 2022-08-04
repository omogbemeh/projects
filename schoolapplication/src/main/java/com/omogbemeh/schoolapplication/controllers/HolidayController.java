package com.omogbemeh.schoolapplication.controllers;

import com.omogbemeh.schoolapplication.models.Holiday;
import com.omogbemeh.schoolapplication.service.HolidayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidayController {
    public final HolidayService hs;

    private final Logger log = LoggerFactory.getLogger(HolidayService.class);

    @Autowired
    public HolidayController() {
        hs = new HolidayService();
    }

    @GetMapping("/holidays")
    public String displayHolidays(Model model) {
        List<Holiday> holidays = hs.getHolidays();
        List<Holiday> fedHolidays = holidays
                                            .stream()
                                            .filter(h -> h.getType().toString().equals(Holiday.Type.FEDERAL.toString()))
                                            .collect(Collectors.toList());

        List<Holiday> festHolidays = holidays
                                            .stream()
                                            .filter(h -> h.getType().toString().equals(Holiday.Type.FESTIVAL.toString()))
                                            .collect(Collectors.toList());

        model.addAttribute("fedHolidays", fedHolidays);
        model.addAttribute("festHolidays", festHolidays);

        return "holiday.html";
    }

    @GetMapping("/filterHoliday")
    public String filterHoliday() {
        return "holiday.html";
    }
}
