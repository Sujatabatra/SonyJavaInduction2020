package com.sujata.component;

public class Juggler implements Performer {

	public Juggler() {
		System.out.println("Hi I am Juggler Constructor");
	}
	
	@Override
	public void perform() {
		System.out.println("Juggler is juggling 6 balls");

	}
	public void myInit() {
		System.out.println("6. Hi I am custom init method from Juggler class");
	}
	
	public void myDestroy() {
		System.out.println("Hi I am custom destroy method from Juggler class");
	}

}
