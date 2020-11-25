package com.sujata.client;

import com.sujata.demo.VegMenu;
import com.sujata.training.HotelKeeper;

public class MyClient {

	public static void main(String[] args) {
		HotelKeeper hotelKeeper=new HotelKeeper();
		
		VegMenu vegMenu=hotelKeeper.getVegMenu();
		System.out.println(vegMenu.getMenu());
		
		

	}

}
