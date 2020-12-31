package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Actuator is Spring Boot's built in
 * Monitoring and Management Mechanism
 * 
 */
@SpringBootApplication(scanBasePackages="com.sujata")
public class ActuatorDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorDemoProjectApplication.class, args);
	}

}
