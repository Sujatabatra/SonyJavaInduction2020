package com.sujata.model.dao;

import java.util.List;

import com.sujata.model.bean.Book;

public interface BookDao  {
	
	public List<Book> getAllBooks();
	
	public Book searchBook(int id);
	
	public boolean addBook(Book book);

}
