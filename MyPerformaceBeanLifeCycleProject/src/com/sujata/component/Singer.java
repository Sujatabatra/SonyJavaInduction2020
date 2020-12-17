package com.sujata.component;

public class Singer implements Performer {

	public Singer() {
		System.out.println("Hi I am Singer Constructor");
	}
	@Override
	public void perform() {
		System.out.println("Singer is singing LALALALA!!!");

	}
	public void myInit() {
		System.out.println("6. Hi I am custom init method from Singer class");
	}
	
	public void myDestroy() {
		System.out.println("Hi I am custom destroy method from Singer class");
	}

}
