package com.bway.eclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(EclinicApplication.class, args);
		System.err.println("SpringBoot is running...");
	}

}
