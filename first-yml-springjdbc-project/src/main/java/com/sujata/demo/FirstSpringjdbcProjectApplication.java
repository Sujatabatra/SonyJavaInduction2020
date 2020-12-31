package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sujata.presentation.EmployeeUserInterface;

@SpringBootApplication(scanBasePackages="com.sujata")
public class FirstSpringjdbcProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeUserInterface employeeUserInterface;
	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(FirstSpringjdbcProjectApplication.class);
//	    app.setBannerMode(Mode.OFF);
//		app.run(args);
		SpringApplication.run(FirstSpringjdbcProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true){
			employeeUserInterface.shomenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
		}
		
	}

}
