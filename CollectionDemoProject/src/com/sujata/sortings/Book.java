package com.sujata.sortings;

public class Book implements Comparable<Book> {

	private int boodId;
	private String bookName;
	private String authorName;
	private int price;
	private int noOfPages;
	
	public Book(){
		
	}

	public Book(int boodId, String bookName, String authorName, int price, int noOfPages) {
		super();
		this.boodId = boodId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	
	public int getBoodId() {
		return boodId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getPrice() {
		return price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	@Override
	public String toString() {
		return "Book [boodId=" + boodId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ ", noOfPages=" + noOfPages + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + boodId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + noOfPages;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (boodId != other.boodId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (noOfPages != other.noOfPages)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public int compareTo(Book book) {
		if(this.getNoOfPages()>book.getNoOfPages())
			return 1;
		else if(this.getNoOfPages()<book.getNoOfPages())
			return -1;
		return 0;
	}
	
	
}
