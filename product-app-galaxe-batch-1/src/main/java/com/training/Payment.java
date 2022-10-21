package com.training;

import org.springframework.stereotype.Component;

@Component
public class Payment {

	public Payment() {
	}
	public String pay() {
		return "Payment pay method called";
	}
}
