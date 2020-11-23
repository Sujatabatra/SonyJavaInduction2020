package com.sujata.demo;

public class Paneer extends ToppingDecorator {

	private Pizza pizza;
	
	public Paneer(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public int getCost() {
		return pizza.getCost()+70;
	}

}
