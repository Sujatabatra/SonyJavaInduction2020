package com.sujata.sortings;

import java.util.TreeSet;

public class BookTreeSet {

	public static void main(String[] args) {
		TreeSet<Book> books=new TreeSet<>();
		books.add(new Book(101, "AAAAA", "Author D", 780, 1200));
		books.add(new Book(101, "BBBBB", "Author X", 520, 1800));
		books.add(new Book(101, "CCCCC", "Author H", 890, 1750));
		books.add(new Book(101, "DDDDD", "Author M", 1780, 1900));
		books.add(new Book(101, "AAAAA", "Author D", 780, 1200));
		
		for(Book book:books){
			System.out.println(book);
		}

	}

}
