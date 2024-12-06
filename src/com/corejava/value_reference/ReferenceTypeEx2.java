package com.corejava.value_reference;

public class ReferenceTypeEx2 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();		
		c1.getData();
		
		Circle c2 = c1;
		c2.getData();
		
		c1.displayData();
	}
}
