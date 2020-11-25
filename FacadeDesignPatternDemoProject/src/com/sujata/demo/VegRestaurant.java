package com.sujata.demo;

public class VegRestaurant implements Hotel {
	public Menus getMenu() {
		VegMenu vegMenu=new VegMenu();
		return vegMenu;
	}

}
