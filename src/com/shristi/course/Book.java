package com.identify.product.FamilyKart.practise.onlinebook.model;

import java.time.LocalDate;

public class Book {
	
	private String title;
	private Integer bookId;

	private double price;
	private String author;
	private String category;
	private LocalDate datePublished;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}



	public Book(Integer bookId,String title, String author, String category,double price, LocalDate datePublished) {
		this.title = title;
		this.bookId = bookId;
		this.price = price;
		this.author = author;
		this.category = category;
		this.datePublished = datePublished;
	}

	public Book() {
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", bookId=" + bookId +
				", price=" + price +
				", author='" + author + '\'' +
				", category='" + category + '\'' +
				", datePublished=" + datePublished +
				'}';
	}

	//default and para constructor
	  //default constructor, parameterized constructor, getter/setter, toString
	//implement Comparable to sort books by title

}
