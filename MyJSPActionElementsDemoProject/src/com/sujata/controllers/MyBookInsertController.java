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

public class MyBookInsertController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private BookService bookService = new BookServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			HttpSession session=request.getSession();
			Book book=(Book)session.getAttribute("book");
			boolean returnStatus= bookService.addBook(book);
			String message=null;
			if(returnStatus)
				message="Book Inserted";
			else
				message="Book Not Inserted";
			session.setAttribute("message", message);
			response.sendRedirect("./output.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
