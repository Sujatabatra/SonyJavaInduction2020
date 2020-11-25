package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class NonVegMenu implements Menus {

	@Override
	public List<String> getMenu() {
		return Arrays.asList("Chicken Curry","Mutton Dry","Fish Fry");
	}

}
