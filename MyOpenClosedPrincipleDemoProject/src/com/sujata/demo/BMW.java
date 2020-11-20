package com.sujata.demo;

public class BMW implements Car {

	private String color,model;

	public BMW(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	
	public void engine(){
		System.out.println("BMW "+model+" "+color+" color goes BOOOOOOM!!");
	}
}
