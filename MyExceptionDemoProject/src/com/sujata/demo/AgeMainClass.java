package com.sujata.demo;

import java.util.Scanner;

public class AgeMainClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Age for voting : ");
		int age=scanner.nextInt();
		
		NumberInput numberInput=new NumberInput();
		try {
			numberInput.setNumber(age);
		} catch (AgeCheckedException e) {
			System.out.println("Person is not eligible for voting!!!");
		}
		
		try{
		numberInput.oneMoreSetNumber(age); //throwing uncehcked exception
		}
		catch(AgeUncheckedException exception){
			System.out.println(exception);
		}
		
		System.out.println("Age : "+numberInput.getNumber());
		

	}

}
