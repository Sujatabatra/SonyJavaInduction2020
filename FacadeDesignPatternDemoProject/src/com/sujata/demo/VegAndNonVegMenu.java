package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class VegAndNonVegMenu implements Menus {

	@Override
	public List<String> getMenu() {		
		return Arrays.asList("Dal","Chicken Korma","Alu Fry","Streamed Fish");
	}

}
