package com.learning.core.day1;

public class D01P01 {
	
	public static Book createBook(String title, double price)
	{
		return new Book(title,price);
	}
	
	public static void showBook(Book book)
	{
		System.out.println("Book Title: " +book.getBookTitle() +"and Price: " +book.getBookPrice());
	}

	public static void main(String[] args) 
	{
		String title = "Java Programming";
		double price = 350.00;
		
		Book javaBook = createBook(title,price);
		
		showBook(javaBook);
		
	}

}
