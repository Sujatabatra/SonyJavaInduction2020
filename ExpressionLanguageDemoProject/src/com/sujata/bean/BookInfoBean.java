package com.sujata.bean;

public class BookInfoBean {

	private String title;
	private float price;
	private float discount;
	private boolean bestSeller;
	private String[] userLevels;
	private int pageCount;
	private Author author;
	private String isbn;
	
	public BookInfoBean(){
		
	}

	public BookInfoBean(String title, float price, float discount, boolean bestSeller, String[] userLevels,
			int pageCount, Author author, String isbn) {
		super();
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.bestSeller = bestSeller;
		this.userLevels = userLevels;
		this.pageCount = pageCount;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public boolean isBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(boolean bestSeller) {
		this.bestSeller = bestSeller;
	}

	public String[] getUserLevels() {
		return userLevels;
	}

	public void setUserLevels(String[] userLevels) {
		this.userLevels = userLevels;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
