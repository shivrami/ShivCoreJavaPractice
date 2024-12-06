package com.corejava.collection;

public class Book 
{
	private String author;
	private int price;
	private int pages;
	
	public Book(String author,int price,int pages)
	{
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	
	public void displayData()
	{
		System.out.println("\tAuthor = "+author+"\tPrice = "+price+"\tPages = "+pages+"\n");
	}
}
