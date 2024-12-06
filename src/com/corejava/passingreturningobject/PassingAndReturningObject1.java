package com.corejava.passingreturningobject;

public class PassingAndReturningObject1 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		c3.getData();
		c1.getData();
		
		c2 = c3.addition(c1); // Caller object is c3
		
		c3.displayData();
		c1.displayData();
		c2.displayData();
	}
}
