package com.sujata.training;

import com.sujata.demo.Animal;
import com.sujata.demo.Iterator;
import com.sujata.demo.ZooImpl;

public class MyClient {

	public static void main(String[] args) {
		ZooImpl zoo=new ZooImpl();
		
		zoo.addAnimal(new Animal("Cat", "Domestic"));
		zoo.addAnimal(new Animal("Dog", "Domestic"));
		zoo.addAnimal(new Animal("Wolf", "Wild"));
		zoo.addAnimal(new Animal("Rabbit", "Domestic"));
		zoo.addAnimal(new Animal("Tiger", "Wild"));
		zoo.addAnimal(new Animal("Elephant", "Wild"));
		zoo.addAnimal(new Animal("Lepord", "Wild"));
		zoo.addAnimal(new Animal("Cow", "Domestic"));
		
		Iterator wildIterator=zoo.createIterator("Wild");
		while(!wildIterator.isLastAnimal()){
			System.out.println("Wild Animal : "+wildIterator.nextAnimal().getAnimalName());
		}
		
		Iterator domesticIterator=zoo.createIterator("Domestic");
		while(!domesticIterator.isLastAnimal()){
			System.out.println("Domestic Animal : "+domesticIterator.nextAnimal().getAnimalName());
		}
		

	}

}
