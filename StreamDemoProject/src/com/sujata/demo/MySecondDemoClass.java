package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MySecondDemoClass {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(101, "Book1 ", "Author X", 890, 1500));
		books.add(new Book(102, "Book2 ", "Author Y", 600, 1800));
		books.add(new Book(103, "Book3 ", "Author X", 1300, 500));
		books.add(new Book(104, "Book4 ", "Author Z", 760, 1200));
		books.add(new Book(105, "Book5 ", "Author Y", 2300, 1000));

		books.stream()
			.filter(book -> book.getPrice() > 1000)
			.map(Book::getBookName)
//			.map(book -> book.getBookName())
			.forEach(System.out::println);
		
		System.out.println("====================");

		List<Book> newList = books.stream()
				.filter(book -> book.getAuthorName().equals("Author X")) //intermediate
				.collect(Collectors.toList()); //terminal operation
		
		System.out.println(newList);
		
		System.out.println("============================");
		long count=books.stream()
				.filter(book->book.getNoOfPages()>1000)
				.count();
		System.out.println("Total Books with no of pages greater then 1000 :"+count);
		System.out.println("==============");
		
	}

}
