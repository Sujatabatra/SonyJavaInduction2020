package com.sujata.demo;
/*
 * Abstract class means certain functionality is concrete and certain is contact so till the time contract fulfilment is not there we won't be able to make use of that class
 * 
 *  1. if a class have even one abstract method its mandatory for us to mark class as abstract
2. we cannot instantiate abstract class
3. its the responsibility of child class to give the defination of abstract methods
4. if child class failed in giving the defination of all abstract methods of parent , then child class will also become abstract, means we won't be able to create object of child as well 
5. In an abstract class we can have zero or more abstract methods
*/
abstract public class Car {

	private String color,model;

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}
	//contract : with child class
	abstract public void engine();
}
