package com.sujata.demo;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

	private static Map<String, Color> colorMap=new HashMap<>();
	static{
		colorMap.put("blue", new BlueColor());
		colorMap.put("red", new RedColor());
		colorMap.put("yellow", new YellowColor());
	}
	
	public static Color getColor(String colorName) throws CloneNotSupportedException{
		return (Color)(colorMap.get(colorName).clone());
	}
}
