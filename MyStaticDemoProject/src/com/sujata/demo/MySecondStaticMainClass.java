package com.sujata.demo;

class MySecondStaticDemo{
	private int x;
//	static private int y;
	private static int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		MySecondStaticDemo.y = y;
	}
	
	//from non static methods we can call static as well as non static members of the class
	public void show(){
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	//from static methods we can call only static members of the class
	static public void display(){
//		System.out.println("x : "+x); 
		System.out.println("y : "+y);
	}	
	
}
public class MySecondStaticMainClass {

	private void someFunction(){
		int x=10;
		System.out.println("Hi I am some function from main class!!");
	}
	
	static private void oneMoreSomeFunction(){
		System.out.println("Hi I am one more some function from main class!!");
	}
	
	public static void main(String args[]){
		//local variables can't be static
//		static int v=10;
		MySecondStaticDemo.setY(10);
		System.out.println(MySecondStaticDemo.getY());
//		someFunction(); //cannot call non static members from static method
		
		//1. Create the object
		MySecondStaticMainClass ob=new MySecondStaticMainClass();
		ob.someFunction();
		//2. we can access static method directly as my main is static 
		oneMoreSomeFunction();
		
	}
}
