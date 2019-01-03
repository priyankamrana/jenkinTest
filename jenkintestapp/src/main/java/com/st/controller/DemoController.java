package com.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value="/hello")
	public String process() {
		System.out.println("hello ");
		return "Hello World Spring Boot";
	}
}
