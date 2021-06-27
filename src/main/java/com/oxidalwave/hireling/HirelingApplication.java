package com.oxidalwave.hireling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class HirelingApplication {
	public static void main(final String[] args) {
		SpringApplication.run(HirelingApplication.class, args);
	}
}
