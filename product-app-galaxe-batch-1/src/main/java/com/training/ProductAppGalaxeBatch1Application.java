package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductAppGalaxeBatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppGalaxeBatch1Application.class, args);
	}

	@GetMapping("/welcome")
	public String display() {
		return "Welcome to My Home";
	}
}
