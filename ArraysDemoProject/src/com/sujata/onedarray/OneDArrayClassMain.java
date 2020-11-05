package com.sujata.onedarray;

import java.util.Scanner;

public class OneDArrayClassMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total no of elements in an array : ");
		int total=scanner.nextInt();
		OneDArrayClass oneDArrayClass=new OneDArrayClass(total);
		
		for(int index=0;index<oneDArrayClass.getTotalElements();index++){
			System.out.println("Enter element : ");
			int element=scanner.nextInt();
			oneDArrayClass.input(element,index);
		}
		
		
		for(int index=0;index<oneDArrayClass.getTotalElements();index++){
			System.out.println(oneDArrayClass.getElementByLocation(index));
		}
		

	}

}
