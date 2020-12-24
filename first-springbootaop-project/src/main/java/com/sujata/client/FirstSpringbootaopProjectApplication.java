package com.sujata.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sujata.component.*;



@SpringBootApplication(scanBasePackages="com.sujata")
@EnableAspectJAutoProxy
public class FirstSpringbootaopProjectApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("Manas")
	private Performer performer1;

	@Autowired
	@Qualifier("Ganesh")
	private Performer performer2;
	
	@Autowired
	@Qualifier("Manju")
	private Performer performer3;
	
	@Autowired
	@Qualifier("Rithies")
	private Performer performer4;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootaopProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		performer1.perform();
		System.out.println("===========================");
		
		performer2.perform();
		System.out.println("===========================");
		
		performer3.perform();
		System.out.println("===========================");
		
		performer4.perform();
	}
	
	@Bean("Rithies")
	public Dancer getDancer(){
		Dancer d=new Dancer();
		d.setStyle("Free Style");
		return d;
	}

}
