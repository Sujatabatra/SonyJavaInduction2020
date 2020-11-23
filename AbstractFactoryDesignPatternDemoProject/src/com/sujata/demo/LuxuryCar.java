package com.sujata.demo;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY,location);
	}
	
	@Override
	public void construct() {
		System.out.println("Connecting to Luxury Car....");

	}

}
