package com.sujata.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.component.Performer;



@SpringBootApplication(scanBasePackages="com.sujata")
public class FirstSpringbootloggingProjectApplication implements CommandLineRunner {
	
	Logger logger=LoggerFactory.getLogger(FirstSpringbootloggingProjectApplication.class);
	
	@Autowired
	@Qualifier("Manas")
	private Performer performer1;

	@Autowired
	@Qualifier("Ganesh")
	private Performer performer2;

	@Autowired
	@Qualifier("Manju")
	private Performer performer3;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootloggingProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Performer 1 Performing");
		performer1.perform();
		System.out.println("===========================");

		logger.info("Performer 2 Performing");
		performer2.perform();
		System.out.println("===========================");

		logger.info("Performer 3 Performing");
		performer3.perform();
		System.out.println("===========================");


	}
}
