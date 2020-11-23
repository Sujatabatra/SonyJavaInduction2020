package com.sujata.demo;

public class PizzaStore {

	public static void main(String[] args) {
		Pizza pizza1=new PeppyPaneer();
		Pizza pizza2=new FarmFresh();
		Pizza pizza3=new ChickenFiesta();
		
		System.out.println(pizza1.getDescription()+" : "+pizza1.getCost());
		System.out.println(pizza2.getDescription()+" : "+pizza2.getCost());
		System.out.println(pizza3.getDescription()+" : "+pizza3.getCost());

		FreshTomato newPizza2=new FreshTomato(pizza2);
		System.out.println(pizza1.getDescription()+" : "+pizza1.getCost());
		System.out.println(newPizza2.getDescription()+" : "+newPizza2.getCost());
		System.out.println(pizza3.getDescription()+" : "+pizza3.getCost());
	}

}
