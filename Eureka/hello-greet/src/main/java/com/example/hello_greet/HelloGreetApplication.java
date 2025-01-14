package com.example.hello_greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloGreetApplication {

	@RequestMapping("/greeting")
	public String greet(){
		return "Hello from Eureka client";
	}

	public static void main(String[] args) {

		SpringApplication.run(HelloGreetApplication.class, args);
		System.out.println("API Gateway");
	}

}
