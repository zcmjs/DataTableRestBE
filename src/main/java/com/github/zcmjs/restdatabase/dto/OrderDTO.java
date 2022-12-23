package com.github.zcmjs.restdatabase.dto;

import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;
import java.time.Instant;

@Data
public class OrderDTO {
    @Id
    private Long id;

    private BigInteger numberRange;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String country;
    private String textx;

    private String postalZip;

    private String region;

    private Instant date;
}
