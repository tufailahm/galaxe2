package com.training.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@GetMapping("/message") // localhost:9090/employee/message - Hi Tufail
	public String getEmployeeMessage() {
		return "Hi Tufail";
	}

	@GetMapping("/message/{empName}") // localhost:9090/employee/message/neha
	// localhost:9090/employee/message/tarun
	public String getEmployeeMessage2(@PathVariable("empName") String eName) {
		return "Hi " + eName;
	}

	@GetMapping("/message/{num1}/and/{num2}") // localhost:9090/employee/message/12/and/14
	// localhost:9090/employee/message/tarun
	public String getEmployeeMessage3(@PathVariable("num1") Integer num1,@PathVariable("num2") Integer num2) {
		return "Sum of the two numbers are :"+(num1+num2);
	}
	
	// localhost:9090/employee/message/Tufail/Bangalore			- Tufail - You are based out of Bangalore
	//localhost:9090/employee/message/Nikhil/Hyd			- Nikhil - You are based out of Hyd
	
	
	@PostMapping("/message") // localhost:9090/employee/message 
	public String getEmployeeMessage4(@RequestBody Employee employee) {
		return "Hi "+employee.getEmployeeName()+ " your record saved successfully. Here are your records :"+employee;
	}
	
	@PutMapping("/message") // localhost:9090/employee/message - Hi Tufail
	public String getEmployeeMessage5() {
		return "Hi Galaxe - PUT";
	}
	
	
	@DeleteMapping("/message") // localhost:9090/employee/message - Hi Tufail
	public String getEmployeeMessage6() {
		return "Hi Galaxe - DELETE";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}