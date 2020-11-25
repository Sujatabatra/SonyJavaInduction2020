package com.sujata.training;

import com.sujata.demo.NonVegMenu;
import com.sujata.demo.NonVegRestaurant;
import com.sujata.demo.VegAndNonVegMenu;
import com.sujata.demo.VegMenu;
import com.sujata.demo.VegNonVegBothRestaurant;
import com.sujata.demo.VegRestaurant;

//Facade
public class HotelKeeper {

	public VegMenu getVegMenu(){
		VegRestaurant v=new VegRestaurant();
		VegMenu vegMenu=(VegMenu)v.getMenu();
		return vegMenu;
	}
	
	public NonVegMenu getNonVegMenu(){
		NonVegRestaurant v=new NonVegRestaurant();
		NonVegMenu nonVegMenu=(NonVegMenu)v.getMenu();
		return nonVegMenu;
	}
	
	public VegAndNonVegMenu getVegNonMenu(){
		VegNonVegBothRestaurant v=new VegNonVegBothRestaurant();
		VegAndNonVegMenu vegNonVegMenu=(VegAndNonVegMenu)v.getMenu();
		return vegNonVegMenu;
	}
}
