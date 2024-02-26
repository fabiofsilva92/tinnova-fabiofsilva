package com.ex5.tinnova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TinnovaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinnovaApplication.class, args);
	}

}
