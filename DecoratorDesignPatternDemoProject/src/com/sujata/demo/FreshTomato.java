package com.sujata.demo;

public class FreshTomato extends ToppingDecorator {

	private Pizza pizza;
	
	public FreshTomato(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public int getCost() {
		return pizza.getCost()+40;
	}

}
