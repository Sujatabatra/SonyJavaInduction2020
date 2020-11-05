package com.sujata.twodarray;

import java.util.Scanner;

public class MySecondTwoDArrayDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[][];
		System.out.println("Enter Total No of rows : ");
		int rows = scanner.nextInt();

		array = new int[rows][];

		int columnSize[] = new int[rows];

		for (int row = 0; row < rows; row++) {
			System.out.println("Enter columns for " + (row + 1) + " row : ");
			int cols = scanner.nextInt();
			columnSize[row] = cols;
			array[row] = new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.println("Enter element : ");
				array[row][col] = scanner.nextInt();
			}
		}

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columnSize[row]; col++) {
				System.out.print(array[row][col] + "   ");
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
