package com.sujata.demo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class BookSearch {

	public ArrayList<Book> searchBookByAuthorX(ArrayList<Book> books){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(book.getAuthorName().equals("Author X"))
				newList.add(book);
		}
		return newList;
	}
	
	public ArrayList<Book> searchBookByAuthor(ArrayList<Book> books,String authorName){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(book.getAuthorName().equals(authorName))
				newList.add(book);
		}
		return newList;
	}
	
	public ArrayList<Book> searchForThickBooks(ArrayList<Book> books){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(book.getNoOfPages()>1000)
				newList.add(book);
		}
		return newList;
	}
	
	//Behaviour in parameter 
	public ArrayList<Book> searchForBooks(ArrayList<Book> books,BookPredicate bookPredicate){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(bookPredicate.test(book))
				newList.add(book);
		}
		return newList;
	}
	
	
	public ArrayList<Book> searchForBookByFunctionalInterface(ArrayList<Book> books,Predicate<Book> bookPredicate){
		ArrayList<Book> newList=new ArrayList<>();
		for(Book book:books){
			if(bookPredicate.test(book))
				newList.add(book);
		}
		return newList;
	}
}
