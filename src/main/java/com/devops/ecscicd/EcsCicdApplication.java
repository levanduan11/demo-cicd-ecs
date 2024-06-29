package com.devops.ecscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcsCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsCicdApplication.class, args);
	}

	@GetMapping
	String home() {
		return "Deployed to ECS successfully";
	}

}
