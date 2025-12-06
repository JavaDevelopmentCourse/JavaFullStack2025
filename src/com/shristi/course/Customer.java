package com.identify.product.FamilyKart.practise.onlinebook.client;

import com.identify.product.FamilyKart.practise.onlinebook.exception.BookNotFoundException;
import com.identify.product.FamilyKart.practise.onlinebook.model.Book;
import com.identify.product.FamilyKart.practise.onlinebook.service.BookServiceImpl;
import com.identify.product.FamilyKart.practise.onlinebook.service.IBookService;

public class Customer {

	public static void main(String[] args) throws BookNotFoundException {

		IBookService bookService = new BookServiceImpl();
		Book byId = bookService.getById(101);
		System.out.println(byId);

		bookService.getAll().forEach(System.out::println);

		bookService.getByAuthorContains("Jane Smith").forEach(System.out::println);

		bookService.getByCategory("Web Development").forEach(System.out::println);

		System.out.println("Count of books by author 'John Doe': " + bookService.getCountOfBooksByAuthor("John Doe"));

		bookService.getByPriceLessThan(15.00).forEach(System.out::println);

		bookService.getByDatePublished(2023).forEach(System.out::println);

		bookService.getByAuthorContainsAndCategory("Jane Smith", "Programming").forEach(System.out::println);

		System.out.println("Total price of books in 'Fiction' category: " + bookService.getTotalPrice("Programming"));





		//interface ref = new Implemenattion class;
	    // Use Scanner call the methods iterate and print the result
		
		
		// no user, student,customer
		//product,restaurant, movie,
	}
}
