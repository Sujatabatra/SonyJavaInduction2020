package com.sujata.sortings;

import java.util.TreeSet;



public class MyBookTreeSet {

	public static void main(String[] args) {
		TreeSet<MyBook> books=new TreeSet<>(new SortByPrice());
		books.add(new MyBook(101, "AAAAA", "Author D", 780, 1200));
		books.add(new MyBook(101, "BBBBB", "Author X", 520, 1800));
		books.add(new MyBook(101, "CCCCC", "Author H", 890, 1750));
		books.add(new MyBook(101, "DDDDD", "Author M", 1780, 1900));
		books.add(new MyBook(101, "AAAAA", "Author D", 780, 1200));
		
		for(MyBook book:books){
			System.out.println(book);
		}

		System.out.println("======================================");
		
		TreeSet<MyBook> books1=new TreeSet<>(new SortByAuthorName());
		books1.add(new MyBook(101, "AAAAA", "Author D", 780, 1200));
		books1.add(new MyBook(101, "BBBBB", "Author X", 520, 1800));
		books1.add(new MyBook(101, "CCCCC", "Author H", 890, 1750));
		books1.add(new MyBook(101, "DDDDD", "Author M", 1780, 1900));
		books1.add(new MyBook(101, "AAAAA", "Author D", 780, 1200));
		
		for(MyBook book:books1){
			System.out.println(book);
		}
	}

}
