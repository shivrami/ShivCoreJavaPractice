package com.corejava.constructor;

public class Rectangle 
{
	private int l;
	private int b;
	
	public Rectangle(int l,int b)
	{
		System.out.println("Parameterized Constructor Called.....\n");
		
		this.l=l;
		this.b=b;
	}
	
	public void displayData()
	{
		System.out.println("l = "+l+"\tb = "+b+"\n");
	}
}
