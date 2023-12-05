package com.example.learning_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    @Autowired
    public CepClient cepClient;

    public Cep getCep(String zip) {

        Cep cep = cepClient.getCep(zip);
        cep.setZipCode(zip);
        return cep;
    }
}
