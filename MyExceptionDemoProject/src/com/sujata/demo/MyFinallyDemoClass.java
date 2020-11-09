package com.sujata.demo;

import java.util.Scanner;

public class MyFinallyDemoClass {

	static void divide(int number1,int number2){
		try{
			int result=number1/number2;
			System.out.println("Result : "+result);
			System.out.println("End of Try Block!!!");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Infinity");
		}
		finally{
			System.out.println("Hi I am finally block!!");
		}
		System.out.println("Good bye from divide method!!");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try{
		System.out.println("Enter first no : ");
		int number1=scanner.nextInt();
		System.out.println("Enter second no : ");
		int number2=scanner.nextInt();
		
		divide(number1, number2);
		}
		catch(ArithmeticException exception){
			System.out.println("Infinity!!");
		}
		finally{
			System.out.println("Hi i am finally block");
		}
		System.out.println("Good Bye from Main");

	}

}
