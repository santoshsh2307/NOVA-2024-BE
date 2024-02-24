package com.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.nova.entityservice.entity")
public class OwnerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnerServiceApplication.class, args);
	}

}
