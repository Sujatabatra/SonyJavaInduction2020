package com.sujata.demo;

import java.util.Scanner;
//Resuable module
class MyDivide {
	private int number1, number2;

	public MyDivide(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	void divide(int number1, int number2)throws ArithmeticException {
//		try {
			int result = number1 / number2;
			System.out.println("Result : " + result);
			System.out.println("End of Try Block!!!");
//		} catch (ArithmeticException exception) {
//			System.out.println("Infinity");
//		}

	}

}

//client
public class MyThrowsDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1=0;
		int number2=0;
		try {
			
			System.out.println("Enter first no : ");
			number1 = scanner.nextInt();
			System.out.println("Enter second no : ");
			number2 = scanner.nextInt();
			
			MyDivide myDivide=new MyDivide(number1, number2);
			myDivide.divide(number1, number2);
			
		} catch (ArithmeticException exception) {
			System.out.println("Division By Zero is not Defined!!, please enter no two again : ");
			number2=scanner.nextInt();
				try{
					MyDivide myDivide=new MyDivide(number1, number2);
					myDivide.divide(number1, number2);
				}
				catch(ArithmeticException exception2){
					System.out.println("Sorry value in undefined! as u are trying to divide no by zero!");
				}
				
			
		} catch (Exception exception) {
			System.out.println("Some problem occur , please try after sometime!!");
		}
		System.out.println("Good Bye from Main");

	}

}
