package com.sujata.demo;

public class MyVarArgsMain {

	public static void main(String[] args) {
		
		MyVarArgsDemo myVarArgsDemo=new MyVarArgsDemo();
		
		System.out.println("Sum of two integers : "+myVarArgsDemo.sum(10,20));
		System.out.println("Sum of five integers : "+myVarArgsDemo.sum(1,2,3,4,5));
		System.out.println("Sum of three integers : "+myVarArgsDemo.sum(11,22,33));
		System.out.println("Sum of four integers : "+myVarArgsDemo.sum(15,56,89,90));
		
		System.out.println("Addition of multiple values : "+myVarArgsDemo.operation("add", 10,20,30));
		System.out.println("Multiplication of multiple values : "+myVarArgsDemo.operation("product", 1,2,5));

	}

}
