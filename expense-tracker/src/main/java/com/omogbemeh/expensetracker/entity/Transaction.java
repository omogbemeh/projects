package com.omogbemeh.expensetracker.entity;

import com.omogbemeh.expensetracker.lib.TransactionType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Transaction {

    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_sequence"
    )
    private Long transactionId;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User users;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private TransactionType transaction_type;

}
