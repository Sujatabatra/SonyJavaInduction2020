package com.sujata.generics;

import com.sujata.misc.Person;

public class GenericInputMain {

	public static void main(String[] args) {
		GenericInput<Integer> genericInput1=new GenericInput<>();
		genericInput1.setValue(10);
		System.out.println("genericInput1 : "+genericInput1.getValue());
		
		GenericInput<Person> genericInput2=new GenericInput<>();
		genericInput2.setValue(new Person(101, "AAAAA"));
		System.out.println("genericInput2 : "+genericInput2.getValue());
		
		OneMoreGenericInput<Integer, String> ob1=new OneMoreGenericInput<Integer, String>(10, "XYZ");
		System.out.println("ob1: "+ ob1);

	}

}
