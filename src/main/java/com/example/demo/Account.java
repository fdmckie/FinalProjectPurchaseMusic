package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;

    @NotEmpty
    private String accountNumber;

    @NotEmpty
    private double accountAmount;

    //from User Table
    @NotEmpty
    private String userName;




}
