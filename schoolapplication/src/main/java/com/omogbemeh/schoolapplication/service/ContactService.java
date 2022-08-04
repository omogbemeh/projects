package com.omogbemeh.schoolapplication.service;

import com.omogbemeh.schoolapplication.models.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private Logger log = LoggerFactory.getLogger(ContactService.class);

    public void saveContactInfo(Contact contact) {
        log.info(contact.toString());
    }
}
