package com.dockerhello.demo_kuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoKuberApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoKuberApplication.class, args);
	}

}
