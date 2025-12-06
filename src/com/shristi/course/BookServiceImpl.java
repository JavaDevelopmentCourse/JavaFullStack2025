package com.identify.product.FamilyKart.practise.onlinebook.service;

import com.identify.product.FamilyKart.practise.onlinebook.exception.BookNotFoundException;
import com.identify.product.FamilyKart.practise.onlinebook.model.Book;
import com.identify.product.FamilyKart.practise.onlinebook.util.BookUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookServiceImpl implements IBookService{

List<Book> books= BookUtil.showBooks();
	@Override
	public List<Book> getAll() throws BookNotFoundException {

		List<Book> bookList = books;
		if(!bookList.isEmpty())
			return bookList;
		else
			 throw new BookNotFoundException("No books available");

    }

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> list = books.stream().filter(book -> book.getAuthor().contains(author)).toList();

		if(!list.isEmpty())
			return list;
		else
			 throw new BookNotFoundException("No books found for author containing: " + author);
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> categoryList = books.stream().filter(book -> book.getCategory().equalsIgnoreCase(category)).toList();
        if (!categoryList.isEmpty())
			return categoryList;
		else
			throw new BookNotFoundException("No books found in category: " + category);

	}

	@Override
	public int getCountOfBooksByAuthor(String author) throws BookNotFoundException {
		List<Book> countOfBooksByAuthor = books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).toList();
if (!countOfBooksByAuthor.isEmpty())
			return countOfBooksByAuthor.size();

		else
			throw new BookNotFoundException("No books found for author: " + author);
	}

	@Override
	public List<String> getByPriceLessThan(double price) throws BookNotFoundException {

		List<String> getBooksLessthan = books.stream().filter(book -> book.getPrice() < price).map(Book::getTitle).toList();
return getBooksLessthan;

	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {

		List<Book> dataPublished = books.stream().filter(book -> book.getDatePublished().getYear() == year).collect(Collectors.toList());
		if (!dataPublished.isEmpty())
			return dataPublished;
		else
			throw new BookNotFoundException("No books found published in year: " + year);
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> getAuthorAndCategory = books.stream().filter(book ->
		{
			if (book.getAuthor().contains(author) && book.getCategory().contains(category))
				return true;
			else
				return false;
		}).collect(Collectors.toList());

		if (!getAuthorAndCategory.isEmpty())
			return getAuthorAndCategory;
		else
			throw new BookNotFoundException("No books found for author containing: " + author + " and category: " + category);


	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		Optional<Book> getBookById = books.stream().filter(book -> book.getBookId() == bookId).findFirst();
		if (getBookById.isPresent())
			return getBookById.get();
		else
			throw new BookNotFoundException("No book found with ID: " + bookId);

	}

	@Override
	public double getTotalPrice(String category) {
		double totalPriceByCategory = books.stream().filter(book -> book.getCategory().equalsIgnoreCase(category)).mapToDouble(Book::getPrice).sum();

			return totalPriceByCategory;

	}
}
