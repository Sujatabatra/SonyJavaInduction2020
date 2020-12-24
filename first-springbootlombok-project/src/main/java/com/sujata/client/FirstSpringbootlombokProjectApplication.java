package com.sujata.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.presentation.EmployeeUserInterface;

@SpringBootApplication(scanBasePackages="com.sujata")
public class FirstSpringbootlombokProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeUserInterface employeeUserInterface;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootlombokProjectApplication.class, args);
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
