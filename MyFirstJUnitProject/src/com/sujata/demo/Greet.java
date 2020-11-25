package com.sujata.demo;

public class Greet {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null && name.length()>=6 && name.length()<=15)
			this.name = name;
		
	}
	
	
}
