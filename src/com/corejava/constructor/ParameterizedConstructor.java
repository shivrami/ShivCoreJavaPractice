package com.corejava.constructor;

public class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{		
		Rectangle r1 = new Rectangle(10, 10);
		Rectangle r2 = new Rectangle(20, 20);
		
		r1.displayData();
		r2.displayData();
	}
}
