package com.infy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("hello  priyanka...");
		return "welcome to github and git agvanced technology.....";
		
	}
}
