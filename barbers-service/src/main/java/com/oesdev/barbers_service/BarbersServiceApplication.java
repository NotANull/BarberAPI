package com.oesdev.barbers_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BarbersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbersServiceApplication.class, args);
	}

}
