package com.corejava.passreturnvalue;

import java.util.Scanner;

public class Book 
{
	private String title;
	private String author;
	private int price;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Title = ");
		title = sc.nextLine();
		
		System.out.println("Enter Author = ");
		author = sc.nextLine();
		
		System.out.println("Enter Price = ");
		price = sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("Title = "+title);
		System.out.println("Author = "+author);
		System.out.println("Price = "+price+"\n");
	}
	
	public float getDiscountedPrice(float per)
	{
		float dp = price - ((price*per)/100);
		return dp;
	}
}
