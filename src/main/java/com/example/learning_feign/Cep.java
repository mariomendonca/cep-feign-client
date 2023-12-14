package com.example.learning_feign;

import lombok.Data;

@Data
public class Cep {
    private String zipCode;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String service;
}
