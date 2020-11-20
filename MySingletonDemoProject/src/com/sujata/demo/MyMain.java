package com.sujata.demo;

public class MyMain {

	public static void main(String[] args) {
		
		//Eager Object Creation
		JustInTimeInitializationSingletonClass ob=JustInTimeInitializationSingletonClass.getInstance();
		System.out.println(ob);

		JustInTimeInitializationSingletonClass ob1=JustInTimeInitializationSingletonClass.getInstance();
		System.out.println(ob1);
		
		//Lazy Object Creation
		InitializationOnFirstUseSingletonClass obj=InitializationOnFirstUseSingletonClass.getInstance(); // first call
		System.out.println(obj);
		
		InitializationOnFirstUseSingletonClass obj1=InitializationOnFirstUseSingletonClass.getInstance(); // first call
		System.out.println(obj1);

		obj.show();
	}

}
