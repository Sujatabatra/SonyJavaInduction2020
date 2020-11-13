package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemoClass {

	public static void main(String[] args) {
		Vector<String> myList=new Vector<>();
		
		myList.add("First");
		myList.add("Second");
		myList.add("Third");
		myList.add("Fourth");
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

		System.out.println("Traversal using Enumeration");
		Enumeration<String> enumeration=myList.elements();
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
	}

}
