package com.pack.hello.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.pack.hello")
@EnableAspectJAutoProxy
public class AccountConfig {
}
