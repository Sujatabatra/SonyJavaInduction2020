package com.sujata.demo;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Shape shape=new Shape();
		
		System.out.println("Enter side of sqaure : ");
		int side=scanner.nextInt();
		System.out.println("Area of square : "+shape.area(side));
		
		System.out.println("Enter radius of circle : ");
		double radius=scanner.nextDouble();
		System.out.println("Area of Circle : "+shape.area(radius));
		
		System.out.println("Enter Length of Rectangle : ");
		int len=scanner.nextInt();
		System.out.println("Enter breadth of Recatngle : ");
		int bre=scanner.nextInt();
		System.out.println("Area of Rectangle : "+shape.area(len,bre));
		

	}

}
