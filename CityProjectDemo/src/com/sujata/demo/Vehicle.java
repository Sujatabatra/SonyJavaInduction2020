package com.sujata.demo;

public class Vehicle {

	private String vehicleNo;

	public Vehicle(String vehicleNo) {
		super();
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}
	
	public void engine(){
		System.out.println("Vehicle engine is running");
	}
}
