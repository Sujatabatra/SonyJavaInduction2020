package com.sujata.demo;

public class Truck extends Vehicle {

	public Truck(String vehicleNo) {
		super(vehicleNo);
		// TODO Auto-generated constructor stub
	}
	
	public void engine(){
		System.out.println("Truck engine is running with Truct No  "+getVehicleNo());
	}

}
