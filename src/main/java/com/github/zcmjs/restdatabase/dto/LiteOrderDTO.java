package com.github.zcmjs.restdatabase.dto;

import jakarta.persistence.Id;
import lombok.Data;

import java.time.Instant;

@Data
public class LiteOrderDTO {
    @Id
    private Long id;

    private String name;

    private String email;

    private String phone;

    private Instant date;
}
