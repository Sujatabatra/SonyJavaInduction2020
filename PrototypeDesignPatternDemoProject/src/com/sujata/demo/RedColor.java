package com.sujata.demo;

public class RedColor extends Color {

	public RedColor(){
		this.colorName="Red";
	}
	@Override
	public void addColor() {
		System.out.println(colorName+" color is added");

	}

}
