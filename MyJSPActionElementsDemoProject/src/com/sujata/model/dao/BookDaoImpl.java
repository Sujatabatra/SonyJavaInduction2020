package com.sujata.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sujata.model.bean.Book;

public class BookDaoImpl implements BookDao {
	private static Map<Integer,Book> books=new HashMap<>();
	static{
		books.put(101, new Book(101, "AAAA", "Author X", 230, 1100));
		books.put(102, new Book(102, "BBBB", "Author Y", 360, 1000));
		books.put(103, new Book(103, "CCCC", "Author X", 290, 800));
		books.put(104, new Book(104, "DDDD", "Author Z", 780, 1600));
		books.put(105, new Book(105, "EEEE", "Author M", 520, 2300));
	}
	
	public List<Book> getAllBooks(){
		return (List<Book>)books.values();
	}
	
	public Book searchBook(int id){
		return books.get(id);
	}
	
	public boolean addBook(Book book){
		books.put(book.getBookId(), book);
		return true;
	}

}
