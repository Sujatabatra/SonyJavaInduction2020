package com.sujata.demo;

public class NonVegRestaurant implements Hotel {

	
	public Menus getMenu() {
		// TODO Auto-generated method stub
		return new NonVegMenu();
	}

}
