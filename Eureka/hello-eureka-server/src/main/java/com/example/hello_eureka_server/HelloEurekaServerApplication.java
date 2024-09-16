package com.example.hello_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEurekaServerApplication.class, args);
	}

}
