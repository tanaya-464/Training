package com.example.hello_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEurekaClientApplication.class, args);
	}

}
