package com.corejava.value_reference;

public class ReferenceTypeEx3 
{
	public static void main(String[] args) 
	{
		int []a = {11,22,33,44,55};
		
		ReferenceTypeEx3.Change(a);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("----------------------------");
		
		Circle c1 = new Circle();
		c1.getData();
		
		ReferenceTypeEx3.Change(c1);
		c1.displayData();
	}
	
	private static void Change(int []b)
	{		
		b[1] = 1000;
		
		b = new int[5];
		b[1] = 5000;
	}
	
	private static void Change(Circle c)
	{
		// c = new Circle();
		c.getData();
	}
}
