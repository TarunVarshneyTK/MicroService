package com.in28minutes.microservices.currencycoversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
public interface CurrencyExchangeServerProxy {
    @GetMapping("/curreny-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean covertCurrency(@PathVariable String from, @PathVariable String to);
}
