package com.corejava.passingobject;

public class PassingObject1 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		c3.getData();
		c1.getData();
		
		c2.addition(c3,c1); // Caller object is c2
		
		c3.displayData();
		c1.displayData();
		c2.displayData();
	}
}
