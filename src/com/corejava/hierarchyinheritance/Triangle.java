package com.corejava.hierarchyinheritance;

public class Triangle extends Shape 
{
	public void calcArea()
	{
		float area = 0.5f * l * b;
		System.out.println("Area of Triangle = "+area+"\n");		
	}
}
