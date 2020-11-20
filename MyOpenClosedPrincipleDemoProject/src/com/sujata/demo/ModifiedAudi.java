package com.sujata.demo;

public class ModifiedAudi implements Car {

	private String color,model;

	public ModifiedAudi(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	
	public void engine(){
		System.out.println("Audi "+model+" "+color+" color goes ZOOOOOOM!!");
	}
}
