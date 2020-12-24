package com.sujata.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.sujata.presentation.EmployeeUserInterface;

@SpringBootApplication(scanBasePackages="com.sujata")
@EntityScan(basePackages="com.sujata.bean")
public class FirstSpringboothibernateProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeUserInterface empUi;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringboothibernateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true){
			empUi.shomenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			empUi.performMenu(choice);
		}
	}

}
