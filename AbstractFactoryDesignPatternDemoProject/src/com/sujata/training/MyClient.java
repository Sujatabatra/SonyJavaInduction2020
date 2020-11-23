package com.sujata.training;

import com.sujata.demo.Car;
import com.sujata.demo.CarType;
import com.sujata.demo.Location;
import com.sujata.factory.CarFactory;

public class MyClient {

	public static void main(String[] args) {
		CarFactory.setLocation(Location.USA);
		
		Car car=CarFactory.buildCar(CarType.LUXURY);
		car.construct();
		System.out.println(car);

	}

}
