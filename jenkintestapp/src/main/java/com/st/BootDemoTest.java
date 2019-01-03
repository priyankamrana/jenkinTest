package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootDemoTest {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDemoTest.class);
		System.out.println(ctx);
	}

}
