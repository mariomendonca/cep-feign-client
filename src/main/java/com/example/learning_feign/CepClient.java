package com.example.learning_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "CepClient", url = "http://localhost:9090")
//@FeignClient(name = "CepClient", url = "https://brasilapi.com.br")
public interface CepClient {
    @GetMapping("/api/cep/v2/{cep}")
    Cep getCep(@PathVariable String cep);
}
