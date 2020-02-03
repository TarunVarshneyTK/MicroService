package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    Environment environment;
    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @RequestMapping("/curreny-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
    {

        ExchangeValue exchangeValue= exchangeValueRepository.findByFromAndTo(from,to);
                //new ExchangeValue(1000,from,to, BigDecimal.valueOf(65));
        exchangeValue.setPort(Integer.parseInt( environment.getProperty("local.server.port")));
        return exchangeValue;
    }

}
