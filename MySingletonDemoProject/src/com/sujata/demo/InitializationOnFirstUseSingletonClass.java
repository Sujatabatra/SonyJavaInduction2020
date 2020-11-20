package com.sujata.demo;

public class InitializationOnFirstUseSingletonClass {

	
	
	private static InitializationOnFirstUseSingletonClass obj;
	
	//we won't e able to create object using default constructor outside the class
	private InitializationOnFirstUseSingletonClass(){
		
	}
	
	static public InitializationOnFirstUseSingletonClass getInstance(){
		if(obj==null){
			obj=new InitializationOnFirstUseSingletonClass();
		}
		return obj;
	}
	
	public void show(){
		System.out.println("Hi I am show method!");
	}

	
}
