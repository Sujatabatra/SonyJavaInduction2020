package com.sujata.misc;

public class PersonMainToStringDemoClass {

	public static void main(String[] args) {
		int x=10;
		System.out.println("x : "+x);
		
		Person p=new Person(101, "AAAAA");
		
		/*
		 * Implicit call to toString internally happens when we try to print Object with println()
		 * toString() from Object class
		 */
//		System.out.println("p : "+p.toString());
		System.out.println("p : "+p); 
		
		
		

	}

}
