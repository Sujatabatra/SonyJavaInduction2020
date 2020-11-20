package com.sujata.demo;

public class Driver {

	private Audi audi;
	private String name;
	
	

	public Driver(String name) {
		super();
		this.name = name;
	}

	public void setAudi(Audi audi) {
		this.audi = audi;
	}
	
	public void drive(){
		System.out.print(name+" is driving ");
		audi.engine();
	}
}
