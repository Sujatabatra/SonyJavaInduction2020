package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeeUserInterface;
import com.sujata.presentation.EmployeeUserInterfaceImpl;

public class MyClient {

	public static void main(String[] args) {
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("spring-config.xml");
		EmployeeUserInterface ui=(EmployeeUserInterface)springContainer.getBean("employeeUi");
		Scanner scanner=new Scanner(System.in);
		while(true){
			ui.shomenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			ui.performMenu(choice);
		}

	}

}
