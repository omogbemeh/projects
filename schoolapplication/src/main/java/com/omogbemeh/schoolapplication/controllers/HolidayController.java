package com.omogbemeh.schoolapplication.controllers;

import com.omogbemeh.schoolapplication.models.Holiday;
import com.omogbemeh.schoolapplication.service.HolidayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidayController {
    public final HolidayService hs;

    private final Logger log = LoggerFactory.getLogger(HolidayService.class);
    private List<Holiday> holidays;
    private List<Holiday> fedHolidays;
    private List<Holiday> festHolidays;

    @Autowired
    public HolidayController() {
        hs = new HolidayService();
    }

    @GetMapping("/holidays")
    public String displayHolidays(@RequestParam(required = false) String holiday,
                                  Model model) {
        holidays = hs.getHolidays();
        fedHolidays = holidays
                                            .stream()
                                            .filter(h -> h.getType().toString().equals(Holiday.Type.FEDERAL.toString()))
                                            .collect(Collectors.toList());

        festHolidays = holidays
                                            .stream()
                                            .filter(h -> h.getType().toString().equals(Holiday.Type.FESTIVAL.toString()))
                                            .collect(Collectors.toList());

        model.addAttribute("madeSelection", false);
        model.addAttribute("fedHolidays", fedHolidays);
        model.addAttribute("festHolidays", festHolidays);

        if (holiday != null) {
            if (holiday.equals("fedHoliday")) {
                model.addAttribute("madeSelection", true);
                model.addAttribute("displayFedHolidays", true);
            } else if (holiday.equals("festHoliday")) {
                model.addAttribute("madeSelection", true);
                model.addAttribute("displayFestHolidays", true);
            }
        }

        return "holiday.html";
    }

}
