package com.corejava.value_reference;

public class ValueTypeEx1 
{
	public static void main(String[] args) 
	{
		int a=10;		
		int b=a;
		
		b=500;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
