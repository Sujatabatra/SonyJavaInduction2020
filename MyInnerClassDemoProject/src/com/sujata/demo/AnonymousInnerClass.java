package com.sujata.demo;

interface Shape{
	
	void area();
}

class PopCorn{
	public void pop(){
		System.out.println("PopCorn is Popping!!");
	}
}
class ButterPopCorn extends PopCorn{
	public void pop(){
		System.out.println("Butterly PopCorn is Popping!!");
	}
}
public class AnonymousInnerClass {

	public static void main(String args[]){

		//Anonymous class : class without name is known as anonymous class
		PopCorn caramelPopCorn=new PopCorn(){
			public void pop(){
				System.out.println("Caramel PopCorn is Popping");
			}
		};
		
		caramelPopCorn.pop();
		
		Shape rectangle=new Shape() {			
			
			@Override
			public void area() {
				System.out.println("Hi I am Rectangle Area");
			}
		};
		
		rectangle.area();
	}
}
