package com.sujata.training;

import java.util.Scanner;

import com.sujata.demo.AutoMobileFactory;
import com.sujata.demo.Vehicle;

public class MyClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of wheels of a vehicle which you want  : ");
		int noOfWheels=scanner.nextInt();
		
		AutoMobileFactory factory=new AutoMobileFactory();
		
		Vehicle vehicle1=factory.getVehicle(noOfWheels);
		
		vehicle1.printVehicle();
	}

}
