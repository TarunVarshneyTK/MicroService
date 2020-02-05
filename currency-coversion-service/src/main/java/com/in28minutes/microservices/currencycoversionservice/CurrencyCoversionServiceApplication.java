package com.in28minutes.microservices.currencycoversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyCoversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCoversionServiceApplication.class, args);
	}

}
