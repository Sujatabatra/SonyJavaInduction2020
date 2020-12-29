package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.sujata.resource")
public class FirstSpringrestapiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringrestapiProjectApplication.class, args);
	}

}
