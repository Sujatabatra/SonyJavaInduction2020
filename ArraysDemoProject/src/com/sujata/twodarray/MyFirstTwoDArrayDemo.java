package com.sujata.twodarray;

import java.util.Scanner;

public class MyFirstTwoDArrayDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int array[][];
		System.out.println("Enter Total No of rows : ");
		int rows=scanner.nextInt();
		System.out.println("Enter Total No of cols : ");
		int cols=scanner.nextInt();
		
		array=new int[rows][cols];
		
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				System.out.println("Enter element : ");
				array[row][col]=scanner.nextInt();
			}
		}
		
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				System.out.print(array[row][col]+"   ");
			}
			System.out.println(" ");
		}

		System.out.println("==================");
		for(int arr[]:array){
			for(int element:arr){
				System.out.print(element+" ");
			}
			System.out.println(" ");
			
		}
	}

}
