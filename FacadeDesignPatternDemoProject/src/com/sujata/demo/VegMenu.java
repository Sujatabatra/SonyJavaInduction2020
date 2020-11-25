package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class VegMenu implements Menus {

	@Override
	public List<String> getMenu() {
		
		return Arrays.asList("Paneer","Mix Veg","Veg Curry");
	}

}
