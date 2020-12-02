package com.sujata.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.model.bean.Book;
import com.sujata.model.service.BookService;
import com.sujata.model.service.BookServiceImpl;

public class BookSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BookService bookService=new BookServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		String id=request.getParameter("bId");
		Book book=bookService.searchBook(Integer.parseInt(id));
		session.setAttribute("book", book);

		response.sendRedirect("./viewBook.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}
