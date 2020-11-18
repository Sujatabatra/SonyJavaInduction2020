package com.sujata.demo;

class StaticOuter{
	
	public void show(){
		System.out.println("Hi I am show method of StaticOuter class");
	}
	
	static class StaticInner{
		public void display(){
			System.out.println("Hi I am display method of Static Inner nested class ");
		}
	}
}
public class StaticInnerClassDemo {

	public static void main(String[] args) {
		StaticOuter.StaticInner obj=new StaticOuter.StaticInner();
		obj.display();

	}

}
