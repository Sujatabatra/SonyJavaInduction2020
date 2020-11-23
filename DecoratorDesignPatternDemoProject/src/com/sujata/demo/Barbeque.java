package com.sujata.demo;

public class Barbeque extends ToppingDecorator {

	private Pizza pizza;
	
	public Barbeque(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public int getCost() {
		return pizza.getCost()+90;
	}

}
