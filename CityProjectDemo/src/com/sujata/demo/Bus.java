package com.sujata.demo;

public class Bus extends Vehicle {

	public Bus(String vehicleNo) {
		super(vehicleNo);
		// TODO Auto-generated constructor stub
	}
	
	public void engine(){
		System.out.println("Bus engine is running with Bus No  "+getVehicleNo());
	}

}
