package com.corejava.privatemember;

public class SingleObject 
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		
		r1.getData(); // r1 is caller/current object
		r1.displayData(); // r1 is caller/current object
	}
}
