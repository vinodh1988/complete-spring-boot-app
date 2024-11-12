package com.fullapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.entities"})
public class CompleteSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompleteSpringBootApplication.class, args);
	}

}
