package com.sujata.demo;

public class ThickBookPredicateModified implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getNoOfPages()>1500;
	}

}
