package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {-
		return args -> {
			ChuckQuote quote = restTemplate.getForObject(
					"https://api.chucknorris.io/jokes/random", ChuckQuote.class);
			log.info(quote.toString());
		};
	}

 */

}
