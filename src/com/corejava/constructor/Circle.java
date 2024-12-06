package com.corejava.constructor;

public class Circle 
{
	private int x;
	private int y;
	private int radius;
	
	public Circle()
	{
		System.out.println("Default Constructor Called.....");
		
		x=10;
		y=10;
		radius=10;
	}
	
	public void displayData()
	{
		System.out.println("x = "+x+"\ty = "+y+"\tradius = "+radius+"\n");
	}
}
