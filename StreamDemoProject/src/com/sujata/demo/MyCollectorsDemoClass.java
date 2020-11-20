package com.sujata.demo;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyCollectorsDemoClass {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(101, "Book1 ", "Author X", 890, 1500));
		books.add(new Book(102, "Book2 ", "Author Y", 600, 1800));
		books.add(new Book(103, "Book3 ", "Author X", 1300, 500));
		books.add(new Book(104, "Book4 ", "Author Z", 760, 1200));
		books.add(new Book(105, "Book5 ", "Author X", 2300, 1000));

		long count=books.stream()
		.filter(book->book.getAuthorName().equalsIgnoreCase("author x"))
		.collect(Collectors.counting());
		
		System.out.println("Total No of Books Written by author X : "+count);

		long count1=books.stream()
				.filter(book->book.getAuthorName().equalsIgnoreCase("author x"))
				.count();
		
		System.out.println("Total No of Books Written by author X : "+count1);
		
		
		IntSummaryStatistics summary=books.stream()
				.filter(book->book.getAuthorName().equalsIgnoreCase("Author X"))
				.collect(Collectors.summarizingInt(book->book.getPrice()));
		System.out.println(summary);
	}

}
