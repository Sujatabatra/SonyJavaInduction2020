package com.sujata.demo;

public class VegNonVegBothRestaurant implements Hotel {

	
	public Menus getMenu() {
	
		return new VegAndNonVegMenu();
	}

}
