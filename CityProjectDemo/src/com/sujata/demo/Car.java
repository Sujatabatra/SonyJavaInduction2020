package com.sujata.demo;

public class Car extends Vehicle {

	public Car(String vehicleNo) {
		super(vehicleNo);
		// TODO Auto-generated constructor stub
	}
	
	public void engine(){
		System.out.println("Car engine is running with Car No  "+getVehicleNo());
	}

}
