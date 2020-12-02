package com.sujata.model.service;

import java.util.List;

import com.sujata.model.bean.Book;

public interface BookService {

public List<Book> getAllBooks();
	
	public Book searchBook(int id);
	
	public boolean addBook(Book book);
}
