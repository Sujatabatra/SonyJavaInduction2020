package com.sujata.onedarray;

import java.util.Scanner;
//import java.lang; (default import)

public class MyFirstDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		/* Arrays:
		 * 1. collection of homogeneous types of elements
		 * 2. Contigous memory allocation area
		 * 2. It is Dynamic memory allocation
		 */
		int arr[];
		System.out.println("Enter total no of elements in an array : ");
		int total=scanner.nextInt();
		arr=new int[total];
		
		for(int index=0;index<total;index++){
			System.out.println("Enter element : ");
			arr[index]=scanner.nextInt();
		}
		
		System.out.println("Values Entered : ");
		for(int index=0;index<total;index++){
			System.out.println(arr[index]);
		}

		System.out.println("Travesal using for..each");
		for(int element:arr){
			System.out.println(element);	
		}
	}

}
