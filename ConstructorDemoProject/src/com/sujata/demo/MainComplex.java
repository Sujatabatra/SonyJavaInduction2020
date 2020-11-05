package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		//declaring the Object(variable)
		Complex complex1=new Complex(4);
		//initialisation of object(variable)
		complex1.inputComplexNumber(8, 4);
		System.out.print("First Complex No : ");
		complex1.displayComplex();
		
		//while declaring , inisitize objects as well
		Complex complex2=new Complex(7,-9);
		System.out.print("Second Complex No : ");
		complex2.displayComplex();


	}

}
