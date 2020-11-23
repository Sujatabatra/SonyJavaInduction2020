package com.sujata.demo;

abstract public class Car {

	private CarType cartype;
	private Location location;
	
	
	public Car(CarType cartype, Location location) {
		super();
		this.cartype = cartype;
		this.location = location;
	}
	
	public CarType getCartype() {
		return cartype;
	}
	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	abstract public void construct();
	@Override
	public String toString() {
		return "Car [cartype=" + cartype + ", location=" + location + "]";
	}
	
}
