package com.identify.product.FamilyKart.practise.onlinebook.util;

import com.identify.product.FamilyKart.practise.onlinebook.model.Book;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;



public class BookUtil {

	// this is for providing book data as we dont have db
	
	
	 public static List<Book> showBooks(){
		 return Arrays.asList(
				 new Book(
						 101, "Java Programming", "John Doe", "Programming", 29.99, LocalDate.of(2023, 10, 5)
				 ),

				 new Book(
						 102, "Python Basics", "Jane Smith", "Programming", 24.99, LocalDate.of(2024, 11, 6)
				 ),
				 new Book(
						 103, "Web Development with JavaScript", "Mike Johnson", "Web Development", 34.99, LocalDate.of(2025, 12, 7)
				 ),
				 new Book(
						 104, "Data Science Fundamentals", "Emily Davis", "Data Science", 39.99, LocalDate.of(2026, 9, 4)
				 ),
				 new Book(
						 105, "Machine Learning 101", "David Wilson", "Data Science", 44.99, LocalDate.of(2027, 8, 3)


				 ),
				 new Book(
						 106, "Advanced Java Programming", "John Doe", "Programming", 29.99, LocalDate.of(2023, 10, 5)
				 ));
				 
		 
	 }
}
