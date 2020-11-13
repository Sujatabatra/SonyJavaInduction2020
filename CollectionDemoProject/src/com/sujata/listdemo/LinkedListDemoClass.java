package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		List<String> myList=new LinkedList<>();
		
		myList.add("First");
		myList.add("Second");
		myList.add("Third");
		myList.add("Fourth");
		myList.add("Third");
		
		System.out.println("size of myList : "+myList.size());
		
		System.out.println("Travesal using traditional for loop");
		for(int index=0;index<myList.size();index++){
			System.out.println(myList.get(index));
		}
		
		System.out.println("Traversal using enhanced for loop");
		for(String element:myList){
			System.out.println(element);
		}
		System.out.println("Traversal using iterator");
		Iterator<String> iterator=myList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Traversal using List Iterator");
		//BiDirectional Iterator
		ListIterator<String> listIterator=myList.listIterator();
		while(listIterator.hasNext()){
			listIterator.next();
		}
		
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}

	}

}
