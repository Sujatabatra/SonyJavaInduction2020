package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		//declaring the Object(variable)
		Complex complex1=new Complex();
		//initialisation of object(variable)
		complex1.inputComplexNumber(8, 4);
		System.out.print("First Complex No : ");
		complex1.displayComplex();
		
		Complex complex2=new Complex();
		complex2.inputComplexNumber(7, -9);
		System.out.print("Second Complex No : ");
		complex2.displayComplex();

		Complex complex3=complex1.addComplexNumbers(complex2);
		System.out.print("Sum : ");
		complex3.displayComplex();

	
		Complex complex4=new Complex();
		complex4.sumComplexNumbers(complex1, complex2);
		complex4.displayComplex();
	}

}
