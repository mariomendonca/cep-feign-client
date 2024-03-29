package com.example.learning_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    public CepService cepService;


    @GetMapping("/{cep}")
    public Cep getCep(@PathVariable String cep) {
        return cepService.getCep(cep);
    }
}
