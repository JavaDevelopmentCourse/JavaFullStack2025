package com.identify.product.FamilyKart.practise.onlinebook.service;

import com.identify.product.FamilyKart.practise.onlinebook.exception.BookNotFoundException;
import com.identify.product.FamilyKart.practise.onlinebook.model.Book;

import java.util.List;



public interface IBookService {
	List<Book> getAll() throws BookNotFoundException;
	List<Book> getByAuthorContains(String author)throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;

	// get total count of books by author
	int getCountOfBooksByAuthor(String author)throws BookNotFoundException;

	//return only the sorted booktitles
	List<String> getByPriceLessThan(double price) throws BookNotFoundException;

	List<Book> getByDatePublished(int year) throws BookNotFoundException;

	List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;

	Book getById(int bookId) throws BookNotFoundException;

	//get sum of price of all books by category
	double getTotalPrice(String category);

}
