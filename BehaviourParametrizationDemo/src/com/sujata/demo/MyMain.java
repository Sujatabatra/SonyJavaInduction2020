package com.sujata.demo;

import java.util.ArrayList;

public class MyMain {

	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<>();
		books.add(new Book(101, "Book1 ", "Author X", 890, 1500));
		books.add(new Book(102, "Book2 ", "Author Y", 600, 1800));
		books.add(new Book(103, "Book3 ", "Author X", 1300, 500));
		books.add(new Book(104, "Book4 ", "Author Z", 760, 1200));
		books.add(new Book(105, "Book5 ", "Author Y", 2300, 1000));

		System.out.println(books);
		System.out.println("====================");
		BookSearch bookSearch=new BookSearch();
		System.out.println(bookSearch.searchBookByAuthor(books,"Author Y"));
		System.out.println("=====================");
		System.out.println(bookSearch.searchForThickBooks(books));
		
		
		System.out.println("==============================");
		
		System.out.println(bookSearch.searchForBooks(books, new ThickBookPredicateModified()));
		
		
		ArrayList<Book> newList=bookSearch.searchForBooks(books, new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getPrice()>800;
			}
		});

		System.out.println("=================================================");
		ArrayList<Book> newList1=bookSearch.searchForBooks(books, book-> book.getPrice()>1000 );
		
		System.out.println("Expensive books:" +newList1);
	}

}
