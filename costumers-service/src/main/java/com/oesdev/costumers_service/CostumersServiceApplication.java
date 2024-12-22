package com.oesdev.costumers_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CostumersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumersServiceApplication.class, args);
	}

}
