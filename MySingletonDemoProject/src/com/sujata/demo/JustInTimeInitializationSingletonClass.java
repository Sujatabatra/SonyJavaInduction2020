package com.sujata.demo;

public class JustInTimeInitializationSingletonClass {

	
	private static JustInTimeInitializationSingletonClass obj=new JustInTimeInitializationSingletonClass();
	
	//we won't e able to create object using default constructor outside the class
	private JustInTimeInitializationSingletonClass(){
		
	}
	
	static public JustInTimeInitializationSingletonClass getInstance(){
		return obj;
	}
	
}
