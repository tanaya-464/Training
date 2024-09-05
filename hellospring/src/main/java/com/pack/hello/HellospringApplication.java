package com.pack.hello;

import com.pack.hello.configuration.AccountConfig;
import com.pack.hello.dao.AccountDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountDao accountDao =context.getBean("accountDao", AccountDao.class);
		accountDao.addAccount();
//		SpringApplication.run(HellospringApplication.class, args);
//		System.out.println("Hello");
	}

}
