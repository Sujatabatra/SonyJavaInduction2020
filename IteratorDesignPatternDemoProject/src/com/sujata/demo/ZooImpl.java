package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements Zoo {

	private List<Animal> animalList;

	public ZooImpl() {
		animalList = new ArrayList<>();
	}

	@Override
	public List<Animal> getAnimals() {
		return animalList;
	}

	@Override
	public void addAnimal(Animal animal) {
		animalList.add(animal);

	}

	@Override
	public void removeAnimal(Animal animal) {
		animalList.remove(animal);

	}

	@Override
	public Iterator createIterator(String iteratorType) {
		if (iteratorType.equals("Wild")) {
			return new WildIterator(animalList);
		}
		return new DomesticIterator(animalList);

	}

}
