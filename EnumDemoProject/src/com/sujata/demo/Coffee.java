package com.sujata.demo;

public enum Coffee {

	REGULAR(5, "Mocha",100), LARGE(10, "Latte",120), OVERWHELMING(18, "Americano",130);

	private int size;
	private String flavour;
	private int price;
	
	public int getSize() {
		return size;
	}

	
	public int getPrice() {
		return price;
	}


	public String getFlavour() {
		return flavour;
	}
	Coffee(int size, String flavour,int price) {
		this.size = size;
		this.flavour=flavour;
		this.price=price;
	}

	

}
