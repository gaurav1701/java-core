package com.learning.core.day1;

public class Book
{
	private String bookTitle;
	private double bookPrice;
	
	
	public Book(String title, double price)
	{
		this.bookTitle = title;
		this.bookPrice = price;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public void setBookTitle(String title)
	{
		this.bookTitle = title;
	}
	
	public double getBookPrice()
	{
		return bookPrice;
	}
	
	public void setBookPrice(double price)
	{
		this.bookPrice = price;
	}
	
}
