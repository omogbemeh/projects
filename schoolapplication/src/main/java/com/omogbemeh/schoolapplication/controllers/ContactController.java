package com.omogbemeh.schoolapplication.controllers;

import com.omogbemeh.schoolapplication.models.Contact;
import com.omogbemeh.schoolapplication.service.ContactService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ContactController {
    private static Logger log = LoggerFactory.getLogger(ContactController.class);
    private final ContactService cs;

    @Autowired
    public ContactController() {
        cs = new ContactService();
    }

    @RequestMapping("/contact")
    public String displayContactPage(Model model) {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView getContactInfo(Contact contact) {
        cs.saveContactInfo(contact);
        return new ModelAndView("redirect:/contact");
    }
}
