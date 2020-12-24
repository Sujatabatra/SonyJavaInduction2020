package com.sujata.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondSpringbootlombokProjectApplication implements CommandLineRunner{

	@Autowired
	private DemoStudent demoStud;
	
	public static void main(String[] args) {
		SpringApplication.run(SecondSpringbootlombokProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s=demoStud.getStudent(101, "AAAA");
		System.out.println(s);
		
	}

}
