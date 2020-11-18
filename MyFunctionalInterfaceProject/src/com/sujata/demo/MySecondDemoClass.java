package com.sujata.demo;

import java.util.function.Consumer;

interface Greet{
	void wish(String name);
}

public class MySecondDemoClass {

	public static void main(String[] args) {
		Greet greet1=new Greet() {
			@Override
			public void wish(String name) {
				System.out.println("Welcome "+name);
				
			}
		};
		
		greet1.wish("Netra");

		System.out.println("============================");
		
		
//		Greet greet2=(String name)-> {
//				System.out.println("Welcome from java 8 Lambda's "+name);
//				
//			};
		
//		Greet greet2=(name)-> {
//			System.out.println("Welcome from java 8 Lambda's "+name);
//			
//		};
		
//		Greet greet2=name-> {
//			System.out.println("Welcome from java 8 Lambda's "+name);
//			
//		};
		
			Greet greet2=name-> System.out.println("Welcome from java 8 Lambda's "+name);
			
			greet2.wish("Naveena");
			
			
			Consumer<String> greet3=name->System.out.println("Welcome to Functional Interface "+name);
			greet3.accept("Shreya");
	}

}
