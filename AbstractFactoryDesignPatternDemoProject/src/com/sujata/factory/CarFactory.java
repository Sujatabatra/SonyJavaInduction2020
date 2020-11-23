package com.sujata.factory;

import com.sujata.demo.Car;
import com.sujata.demo.CarType;
import com.sujata.demo.Location;

public class CarFactory {

	private static Location location;

	public static Location getLocation() {
		return location;
	}

	public static void setLocation(Location location) {
		CarFactory.location = location;
	}

	public static Car buildCar(CarType model){
		Car car=null;
		
		switch(location){
		case USA:
			car=USACarFactory.buildCar(model);
			break;
		case INDIA:
			car=IndiaCarFactory.buildCar(model);
			break;
		case DEFAULT:
			car=DefaultCarFactory.buildCar(model);
			break;
		default:
			break;
		}
		return car;
	}
}
