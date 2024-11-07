package com.example.daegil_umc_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DaegilUmc7Application {

	public static void main(String[] args) {
		SpringApplication.run(DaegilUmc7Application.class, args);
	}

}
