package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.component.Performer;

@SpringBootApplication(scanBasePackages="com.sujata.component")
public class SecondSpringcoreProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Manju")
	Performer performer;
	
	public static void main(String[] args) {
		SpringApplication.run(SecondSpringcoreProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		performer.perform();
		
	}

}
