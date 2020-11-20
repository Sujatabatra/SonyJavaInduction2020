package com.sujata.demo;

public class Audi{

	private String color,model;

	public Audi(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	
	public void engine(){
		System.out.println("Audi "+model+" "+color+" color goes ZOOOOOOM!!");
	}
}
