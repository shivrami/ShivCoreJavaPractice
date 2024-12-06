package com.corejava.value_reference;

public class ReferenceTypeEx1 
{
	public static void main(String[] args) 
	{
		int []a = {11,22,33,44,55};
		
		int []b = a;		
		b[1] = 1000;
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
