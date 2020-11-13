package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemoClass {

	public static void main(String[] args) {
		//HashSet is Unordered unique collection of elements , auto growable and auto shrinkable in size 
		Set<Integer> elements=new HashSet<>();
		
		elements.add(new Integer(10));
		elements.add(20);
		elements.add(5);
		elements.add(17);
		elements.add(20);
		
		System.out.println("size of my element collection : "+elements.size());
		System.out.println(elements);
		
		System.out.println("Traversal using enhanced for loop");
		for(Integer element:elements){
			System.out.println(element);
		}
		elements.add(new Integer(89));
		elements.add(new Integer(78));
		
		System.out.println("size of my element collection : "+elements.size());
		System.out.println(elements);
		
		elements.remove(5);
		
		System.out.println("size of my element collection : "+elements.size());
		System.out.println(elements);
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=elements.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		

	}

}
