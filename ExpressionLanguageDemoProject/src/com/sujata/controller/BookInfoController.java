package com.sujata.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.bean.Author;
import com.sujata.bean.BookInfoBean;

public class BookInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		ServletContext context=getServletContext();
		
		String ul[] = { "basic", "intermediate" };
		BookInfoBean bookInfoBean1 = new BookInfoBean("Java Complete", 1000, 50, true, ul, 1200,
				new Author(121, "Author ABC"), "A12345");
		
		BookInfoBean bookInfoBean2 = new BookInfoBean("Learn Java in 21 Days", 1500, 60, true, ul, 1000,
				new Author(151, "Author XYZ"), "A8907");
		
		session.setAttribute("book", bookInfoBean2);
		
		context.setAttribute("book", bookInfoBean1);
		
		response.sendRedirect("./display.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
