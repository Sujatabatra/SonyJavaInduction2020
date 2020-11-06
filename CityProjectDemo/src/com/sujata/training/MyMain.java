package com.sujata.training;

import java.util.Scanner;

import com.sujata.demo.Bus;
import com.sujata.demo.Car;
import com.sujata.demo.City;
import com.sujata.demo.Truck;
import com.sujata.demo.Vehicle;

public class MyMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Vehicles in City : ");
		int total = scanner.nextInt();
		City delhi = new City(total);

		for (int index = 0; index < total; index++) {
			System.out.println("Enter Vehicle bus, truck or car : ");
			String vehicle = scanner.next();

			switch (vehicle) {
			case "bus":
				Vehicle veh1 = new Bus("B001");
				delhi.setVehicle(veh1, index);
				break;
			case "truck":
				Vehicle veh2 = new Truck("T001");
				delhi.setVehicle(veh2, index);
				break;
			case "car":
				Vehicle veh3 = new Car("C001");
				delhi.setVehicle(veh3, index);
				break;
			}
		}

		delhi.run();
	}

}
