package com.omogbemeh.schoolapplication.models;

import lombok.Data;

@Data
public class Contact {

    private final String name;
    private final String email;
    private final String phoneNumber;
    private final String subject;
    private final String message;

}
