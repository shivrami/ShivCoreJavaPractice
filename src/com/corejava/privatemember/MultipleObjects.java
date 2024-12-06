package com.corejava.privatemember;

public class MultipleObjects 
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.getData(); // r1 is caller/current object
		r2.getData(); // r2 is caller/current object
		
		r1.displayData();
		r2.displayData();
	}
}
