package com.lamdbasys.stockquotesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class StockQuotesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockQuotesApiApplication.class, args);
	}

}
