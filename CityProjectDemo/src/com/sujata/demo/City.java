package com.sujata.demo;

public class City {

	//Hetrogenous Collection of elements
	private Vehicle vehicles[];
	private int totalNoOfVehicle;
	
	public City(int totalNoOfVehicle) {
		super();
		this.totalNoOfVehicle = totalNoOfVehicle;
		vehicles=new Vehicle[totalNoOfVehicle];
	}
	
	public void setVehicle(Vehicle vehicle,int index) {
		this.vehicles[index] = vehicle;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}
	
	public void run(){
		for(Vehicle vehicle:vehicles){
			vehicle.engine();
		}
	}
	
}
