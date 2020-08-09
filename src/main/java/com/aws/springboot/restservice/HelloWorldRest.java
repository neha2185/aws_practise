package com.aws.springboot.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class HelloWorldRest {
	@GetMapping(value = "v1/data")
	public String helloWorld() {
		System.out.println("Inside helloWorld Get method");
		return "Hello World AWS";
	}
	
	@GetMapping(value = "streams/addition/{val1}/{val2}")
	public int sum(@PathVariable int val1,  @PathVariable int val2) {
		System.out.println("Inside addition");
		return val1 + val2;
	}
}
