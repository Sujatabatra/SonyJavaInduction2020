package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyPrimitiveSpecificStreamDemoClass {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(101, "Book1 ", "Author X", 890, 1500));
		books.add(new Book(102, "Book2 ", "Author Y", 600, 1800));
		books.add(new Book(103, "Book3 ", "Author X", 1300, 500));
		books.add(new Book(104, "Book4 ", "Author Z", 760, 1200));
		books.add(new Book(105, "Book5 ", "Author Y", 2300, 1000));

		
		int sumPrice=books.stream()
		.mapToInt(Book::getPrice)
		.sum();
		
		System.out.println("sum of all book price : "+sumPrice);
		
		int sumPrice1=books.stream()
				.map(Book::getPrice)
				.reduce(0, (a,b)->a+b);
		
		System.out.println("Sum of all book price : "+sumPrice1);
	
	}

}
