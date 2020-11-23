package com.sujata.factory;

import com.sujata.demo.Car;
import com.sujata.demo.CarType;
import com.sujata.demo.Location;
import com.sujata.demo.LuxuryCar;
import com.sujata.demo.MicroCar;
import com.sujata.demo.MiniCar;

public class DefaultCarFactory {

	static Car buildCar(CarType model){
		Car car=null;
		switch (model) {
		case MICRO:
			car=new MicroCar(Location.DEFAULT);
			break;
		case MINI:
			car=new MiniCar(Location.DEFAULT);
			break;
		case LUXURY:
			car=new LuxuryCar(Location.DEFAULT);
			break;
		default:
			break;
		}
		
		return car;
	}
}
