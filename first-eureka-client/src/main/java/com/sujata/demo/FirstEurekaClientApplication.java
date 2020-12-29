package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstEurekaClientApplication.class, args);
	}

}
