package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.targus.Bag;

@SpringBootApplication
@RestController
public class ProductAppGalaxeBatch1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppGalaxeBatch1Application.class, args);
	}

	@Autowired(required = false)
	Payment payment ;
	
	@Autowired(required = false)
	Bag bag;
	
	@GetMapping
	public String home2() {
		return "MOHAMMAD TUFAIL AHMED";
	}
	
	@GetMapping("/welcome")
	public String home() {
		return "Welcome to My Home ### ";
	}
	
	@GetMapping("/payment")
	public String payment() {
		return "Welcome to My Payments ### "+payment.pay()+ "Order details are :"+bag.getDetails();
	}
}
