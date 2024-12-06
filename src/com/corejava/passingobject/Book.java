package com.corejava.passingobject;

import java.util.Scanner;

public class Book 
{
	private String title;
	private int price;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Title = ");		
		title=sc.nextLine();
		
		System.out.println("Enter Price = ");
		price=sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("Title = "+title+"\tPrice = "+price+"\n");
	}
	
	public void addition(Book b1,Book b2)
	{
		title = b1.title+","+b2.title;
		price = b1.price + b2.price;
	}
}
