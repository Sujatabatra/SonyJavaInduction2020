package com.sujata.client;

/*
 * super keyword usage
 * 1. super is used to call base class constructor from derived class
 * 2. super is used to call base class methods from dervied class, 
 * if base class and derived class have methods with same name and same arguments and scope should be same or boader (overriding)
 * 3. super is used to call base class accessible instance variable from derived class, if base  class and dervied class have accessible instance variables with same name.
 */
class Base{
	int i=10;
	void show(){
		System.out.println("Hi I am show method of base class");
	}
}

class Derived extends Base{
	int i=20;
	public int sum(){
		return super.i+i;
	}
	void show(){
		System.out.println("Hi I am show method of derived class");
	}
	void display(){
		super.show();
		show();
	}
}
public class SuperDemoMain {

	public static void main(String[] args) {
		Derived derived=new Derived();
		derived.display();
		System.out.println(derived.sum());

	}

}
