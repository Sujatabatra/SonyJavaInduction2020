package com.sujata.demo;

import java.util.ArrayList;
import java.util.Optional;

public class Library {

	static private ArrayList<Book> books=new ArrayList<>();
	static{
		books.add(new Book(101, "Book1 ", "Author X", 890, 1500));
		books.add(new Book(102, "Book2 ", "Author Y", 600, 1800));
		books.add(new Book(103, "Book3 ", "Author X", 1300, 500));
		books.add(new Book(104, "Book4 ", "Author Z", 760, 1200));
		books.add(new Book(105, "Book5 ", "Author Y", 2300, 1000));
	}
	
	public Optional<Book> searchBookByID(int id){
		return books.stream()
		.filter(book->book.getBookId()==id)
		.findFirst();  
	}
	
	public Book traditionalSearchBookById(int id){
		for(Book book:books){
			if(book.getBookId()==id)
				return book;
		}
		return null;
	}
	
}
