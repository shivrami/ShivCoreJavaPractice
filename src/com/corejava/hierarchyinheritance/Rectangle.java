package com.corejava.hierarchyinheritance;

public class Rectangle extends Shape 
{
	public void calcArea()
	{
		int area = l * b;
		System.out.println("Area of Rectangle = "+area+"\n");
	}
}
