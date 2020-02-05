package com.in28minutes.microservices.currencycoversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

//@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
//Remove URl if Configure Ribbon and put URLS to property file
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServerProxy {
    @GetMapping("/curreny-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean covertCurrency(@PathVariable String from, @PathVariable String to);
}
