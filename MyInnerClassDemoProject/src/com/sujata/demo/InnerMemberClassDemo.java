package com.sujata.demo;
//Class inside a class : inner member class
class Outer
{
	int val;
	void show(){
		int x=10;
		System.out.println("Hi I am show method of Outer class");
//		display();
	}
	
	class Inner{
		void display(){
			System.out.println("Hi I am display method of Inner class");
			show();
		}
//		void show(){
//			System.out.println("Hi I am show method of Inner class");
//		}
	}
	
}
public class InnerMemberClassDemo {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.show();
		
		Outer.Inner inner=outer.new Inner();
		inner.display();
//		inner.show();

	}

}
