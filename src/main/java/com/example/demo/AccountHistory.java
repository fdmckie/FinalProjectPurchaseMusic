package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class AccountHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    //from Account table
    @NotEmpty
    private long accountId;

    //from Album table
    @NotEmpty
    private long albumId;

    @NotEmpty
    private long albumQuantity;


}
