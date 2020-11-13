package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.misc.Person;

public class PersonHashSetDemoClass {

	public static void main(String[] args) {
		//HashSet is Unordered unique collection of elements , auto growable and auto shrinkable in size 
		Set<Person> elements=new HashSet<>();
		
		elements.add(new Person(101,"AAA"));
		elements.add(new Person(102,"BBB"));
		elements.add(new Person(103,"CCC"));
		elements.add(new Person(104,"DDD"));
		elements.add(new Person(101,"AAA"));
		
		System.out.println("size of my element collection : "+elements.size());
		System.out.println(elements);
		
		System.out.println("Traversal using enhanced for loop");
		for(Person element:elements){
			System.out.println(element);
		}
		elements.add(new Person(105,"EEE"));
		elements.add(new Person(106,"FFF"));
		
		System.out.println("size of my element collection : "+elements.size());
		System.out.println(elements);
		
		elements.remove(new Person(102, "BBB"));
		
		
		System.out.println("size of my element collection : "+elements.size());
		System.out.println(elements);
		
		System.out.println("Traversal using Iterator");
		Iterator<Person> iterator=elements.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		

	}

}
