package com.corejava.methodoverloading;

public class MethodOverloadingEx 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		
		c1.getData();
		c1.displayData();
		
		c1.move(100);
		c1.displayData();
		
		c1.move(200, 200);
		c1.displayData();
	}
}