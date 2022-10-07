package com.omogbemeh.people.model;

import com.omogbemeh.people.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Gender gender;
    private BigDecimal salary;
}
