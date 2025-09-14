package com.pminternship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PmInternshipSchemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmInternshipSchemeApplication.class, args);
		System.out.println("PmIntership is Running Successfully...");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
