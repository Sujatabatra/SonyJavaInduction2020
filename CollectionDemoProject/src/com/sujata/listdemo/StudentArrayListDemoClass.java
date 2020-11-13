package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentArrayListDemoClass {

	public static void main(String[] args) {
		List<Student> myList=new ArrayList<>();
		
		myList.add(new Student(101, "Amit"));
		myList.add(new Student(102, "Bharti"));
		myList.add(new Student(103, "Charu"));
		myList.add(new Student(104, "Disha"));
		
		System.out.println("size of myList : "+myList.size());
		
		System.out.println("Travesal using traditional for loop");
		for(int index=0;index<myList.size();index++){
			System.out.println(myList.get(index));
		}
		
		System.out.println("Traversal using enhanced for loop");
		for(Student element:myList){
			System.out.println(element);
		}
		System.out.println("Traversal using iterator");
		Iterator<Student> iterator=myList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Traversal using List Iterator");
		//BiDirectional Iterator
		ListIterator<Student> listIterator=myList.listIterator();
		while(listIterator.hasNext()){
			listIterator.next();
		}
		
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}

	}

}
