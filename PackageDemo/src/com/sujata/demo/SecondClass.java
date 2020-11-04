package com.sujata.demo;

public class SecondClass {
	
	public void show(){
		System.out.println("Hi i am show method from SecondClass");
		MyFirstClass myFirstClass=new MyFirstClass();
		myFirstClass.show();
		myFirstClass.dummy();
//		myFirstClass.display(); - private method so visibility is not in different class irrecpective of package
	}

}
