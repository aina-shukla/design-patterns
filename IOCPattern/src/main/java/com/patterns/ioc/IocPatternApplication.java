package com.patterns.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocPatternApplication.class, args);
		System.out.println("IOC and DI");
	}

}
