package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComparatorJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books = Arrays.asList(
				 new Book(1, "Modern Java Recipes", 49.99),
				 new Book(2, "Java 8 in Action", 49.99),
				 new Book(3, "Java SE8 for the Really Impatient", 39.99),
				 new Book(4, "Functional Programming in Java", 27.64),
				 new Book(5, "Making Java Groovy", 45.99),
				 new Book(6, "Gradle Recipes for Android", 23.76)
				);
		
		Map<Integer, Book> bookMap = books.stream()
				 .collect(Collectors.toMap(Book::getId, b -> b));
		
		// bookMap = books.stream()
		//		 .collect(Collectors.toMap(Book::getId, Function.identity()));

		System.out.println(bookMap);
	}

}


class Book {
	 
	private int id;
	private String name;
	private double price;
	 // ... other methods ...
	 
	public Book(int i, String string, double d) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.name = string;
		this.price = d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 
	
}
