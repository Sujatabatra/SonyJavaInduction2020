package com.sujata.demo;

class Base{
	
	//is is mandatory to initialise final variable , otherise compiler will give an error
	final private int value=10;
	
	public void changeValue(int val){
//		value=val;  //error as 'value' variable is final so we won't be able to change its value
	}
	public void show(){
		System.out.println("Hi I am show method from Base class");
	}
	final public void display(){
		System.out.println("Hi I am display method from Base class");
	}
}

final class MyBase{
	public void show(){
		System.out.println("Hi I am show method from Base class");
	}
}

//final class can't be extended so its an error
//class MyDerived extends MyBase{
//	public void anyMethod(){
//		System.out.println("Hi");
//	}
//}

class Derived extends Base{
	
	public void show(){
		System.out.println("Hi I am show method from Base class");
	}
	//we won't be able to override display as display is final
//	public void display(){
//		System.out.println("Hi I am display method from Base class");
//	}
}
public class MyFirstFinalDemo {

	public static void main(String[] args) {
		int x=10;
		x=x+10;
		final int y=20;
//		y=y+10;

	}

}
