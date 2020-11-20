package com.sujata.demo;

public class CarRental {

	public static void main(String[] args) {
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		Driver tonu=new Driver("Tonu");

		Audi car=new Audi("RED", "A8");
		
		monu.setAudi(car);
		
		monu.drive();
		
		
		ModifiedDriver suresh=new ModifiedDriver("Suresh");
		ModifiedDriver ramesh=new ModifiedDriver("Ramesh");
		
		BMW car1=new BMW("Silver", "Q6");
		ModifiedAudi audi=new ModifiedAudi("BLUE", "A7");
		suresh.setCar(audi);
		
		ramesh.setCar(car1);
		
		suresh.drive();
		ramesh.drive();
		
	}

}
