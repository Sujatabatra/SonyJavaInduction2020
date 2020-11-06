package com.sujata.training;

import com.sujata.demo.Audi;
import com.sujata.demo.BMW;
import com.sujata.demo.Driver;
import com.sujata.demo.Toyota;

public class TravelAgency {

	public static void main(String args[]){
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		Driver sure=new Driver("Suresh");
		Driver ramesh=new Driver("Ramesh");
		
		Audi audi=new Audi("Red", "A8");
		BMW bmw=new BMW("Silver", "Q6");
		Toyota toyota=new Toyota("Innova", "LXI");
		
		monu.setCar(bmw);
		monu.drive();
	}
}
