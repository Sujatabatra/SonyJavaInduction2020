package com.sujata.demo;

public class AutoMobileFactory implements Factory {

	@Override
	public Vehicle getVehicle(int noOfWheels) {
		switch(noOfWheels){
		case 2:
			return new TwoWheeler();
			
		case 4:
			return new FourWheeler();	
		}
		return null;
	}

}
