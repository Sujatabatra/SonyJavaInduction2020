package com.sujata.demo;

import java.util.Scanner;
// robust code 
public class MySecondDemo {

	public static void main(String[] args)throws ArithmeticException,NegativeArraySizeException,ArrayIndexOutOfBoundsException,Exception {
		Scanner scanner=new Scanner(System.in);
		int location=0;
//		try{
			System.out.println("Enter First No : ");
			int number1=scanner.nextInt();
			System.out.println("Enter Second No : ");
			int number2=scanner.nextInt();
			int result=number1/number2;
			System.out.println("Result : "+result);
			
			int array[];
			System.out.println("Enter total no of values in an array : ");
			int total=scanner.nextInt();
					array=new int[total];
			for(int index=0;index<total;index++){
				System.out.println("Enter Element in an array : ");
				array[index]=scanner.nextInt();
			}
			System.out.println("Enter the location in an array whose value you want to see : ");
			location=scanner.nextInt();
			System.out.println("Element at location "+location+" "+array[location]);
			
//		}
//		//Unchecked Exception
//		//if ArithmeticException I am the handler
//		catch(ArithmeticException exception){ 
//			System.out.println("Infinity!");
//		}
////		//if any other exception I am the handler(Error) As generic handler will appear at the end otherwise the handler below it becomes unreachable and compiler will guve an error
////				catch(Exception exception){
////					System.out.println("Something went wrong , please try again!!");
////				}
//		//if ArrayIndexOutOfBoundsException I am the handler
//		catch(ArrayIndexOutOfBoundsException exception){
//			System.out.println("Location "+location+" does not exist in an array");
//		}
//		//if NegativeArraySizeException I am the handler
//		catch(NegativeArraySizeException exception){
//			System.out.println("Array Size canot be negative, please try again!!");
//		}
//		//if any other exception I am the handler
//		catch(Exception exception){
//			System.out.println("Something went wrong , please try again!!");
//		}
//		finally{
//			System.out.println("Hi I am Finally Block!!!");
//		}
		System.out.println("Good Bye!!");
	}

}
