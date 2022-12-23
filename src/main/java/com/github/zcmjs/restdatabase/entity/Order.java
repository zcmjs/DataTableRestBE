package com.github.zcmjs.restdatabase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    private Long id;

    private BigInteger numberRange;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String country;
    @Column(name = "postal_zip")
    private String postalZip;

    private String region;
    private String textx;

    private String currency;

    private Instant date;
}