package com.omogbemeh.expensetracker.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_generator",
            sequenceName = "user_id_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_generator"
    )
    private Long userId;

    @Column(
            nullable = false,
            unique = true
    )
    private String userName;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @CreatedDate
    private Date createdAt;

}
