package com.sujata.demo;

public class MyEnumDemoClass {

	public static void main(String[] args) {
		Coffee coffee;
		coffee=Coffee.LARGE;
		System.out.println("We are happy to serve you "+coffee.getSize()+" ounces of "+coffee.getFlavour()+" kindly pay Rs. "+coffee.getPrice());

	}

}
