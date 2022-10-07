package com.omogbemeh.people.controller;

import com.omogbemeh.people.model.Person;
import com.omogbemeh.people.service.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PeopleController {

    @RequestMapping("/people")
    public String displayPeoplePage(Model model) {
        List<Person> people = PeopleService.generateFiveUsers();
        model.addAttribute("people", people);
        return "people.html";
    }
}
