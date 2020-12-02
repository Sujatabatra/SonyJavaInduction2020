package com.sujata.model.service;

import java.util.List;

import com.sujata.model.bean.Book;
import com.sujata.model.dao.BookDao;
import com.sujata.model.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {

	private BookDao bookDao=new BookDaoImpl();
	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book searchBook(int id) {
		return bookDao.searchBook(id);
	}

	@Override
	public boolean addBook(Book book) {
		return bookDao.addBook(book);
		
	}

}
