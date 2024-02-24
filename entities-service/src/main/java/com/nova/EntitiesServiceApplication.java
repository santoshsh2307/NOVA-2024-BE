package com.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.nova.entityservice.entity")
@EnableJpaRepositories(basePackages = "com.nova.entityservice.repository")
public class EntitiesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntitiesServiceApplication.class, args);
	}

}
