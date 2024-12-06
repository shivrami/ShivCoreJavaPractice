package com.corejava.passingobject;

public class PassingObject2 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.getData();
		b2.getData();
		
		b3.addition(b2, b1);
		
		b1.displayData();
		b2.displayData();
		b3.displayData();
	}
}
