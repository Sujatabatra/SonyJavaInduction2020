package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.training.Greet;

//@SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication(scanBasePackages="com.sujata.training")
public class FirstSpringcoreProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("goodEvening")
	private Greet g;
	
	public static void main(String[] args) {
//		ApplicationContext context=SpringApplication.run(FirstSpringcoreProjectApplication.class, args);
		SpringApplication.run(FirstSpringcoreProjectApplication.class, args);
//		Greet g1=(Greet)context.getBean("goodMorning");
//		g1.wish("Sujata");
	
	}

	@Override
	public void run(String... args) throws Exception {
		g.wish("Sujata");
		
	}

}
