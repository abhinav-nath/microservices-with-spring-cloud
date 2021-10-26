package com.codecafe.microservices.currencyexchangeservice.controller;

import com.codecafe.microservices.currencyexchangeservice.domain.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        return CurrencyExchange.builder()
                .id(1000L)
                .from(from)
                .to(to)
                .conversionMultiple(BigDecimal.valueOf(50))
                .environment(environment.getProperty("local.server.port"))
                .build();
    }

}