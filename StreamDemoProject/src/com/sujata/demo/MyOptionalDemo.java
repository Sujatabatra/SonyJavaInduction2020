package com.sujata.demo;

import java.util.Optional;

public class MyOptionalDemo {

	public static void main(String[] args) {
		Library library=new Library();
		
//		Book book=library.traditionalSearchBookById(1000);
//		System.out.println(book.getBookName());
		
		Optional<Book> book=library.searchBookByID(1000);
		
		if(book.isPresent())
			System.out.println(book.get());
		else
			System.out.println("No book found");

		System.out.println("====================");
		
		
		book.ifPresent(b->System.out.println(b.getBookName()));
	}

}
