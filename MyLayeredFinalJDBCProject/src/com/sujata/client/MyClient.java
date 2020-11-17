package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.EmployeeUserInterface;
import com.sujata.presentation.EmployeeUserInterfaceImpl;

public class MyClient {

	public static void main(String[] args) {
		EmployeeUserInterface ui=new EmployeeUserInterfaceImpl();
		Scanner scanner=new Scanner(System.in);
		while(true){
			ui.shomenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			ui.performMenu(choice);
		}

	}

}
