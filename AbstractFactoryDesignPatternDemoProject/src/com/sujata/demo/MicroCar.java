package com.sujata.demo;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO,location);
	}
	
	@Override
	public void construct() {
		System.out.println("Connecting to Micro Car....");

	}

}
