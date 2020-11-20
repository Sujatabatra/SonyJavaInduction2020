package com.sujata.demo;

public class ModifiedDriver {

	private Car car;
	private String name;
	
	

	public ModifiedDriver(String name) {
		super();
		this.name = name;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public void drive(){
		System.out.print(name+" is driving ");
		car.engine();
	}
}
