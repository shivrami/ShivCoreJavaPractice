package com.corejava.mutableimmutable;

public class MutableImmutableInArgument 
{
	public static void main(String[] args) 
	{
		String s1 = "Mahesh Gurjar";
		StringBuffer sb = new StringBuffer("Mahesh Gurjar");
		
		System.out.println("sb - Before Calling Change");
		System.out.println(sb);
		
		Change(sb);
		
		System.out.println("\nsb - After Calling Change");
		System.out.println(sb);
		
		System.out.println("--------------------------------------");
		
		System.out.println("\ns1 - Before Calling Change");
		System.out.println(s1);
		
		Change(s1);
		
		System.out.println("\ns1 - After Calling Change");
		System.out.println(s1);
	}
	
	private static void Change(String s2)
	{		
		s2.concat(", Devansh Gurjar");
	}
	
	private static void Change(StringBuffer sb1)
	{
		// sb1=new StringBuffer();
		sb1.append(", Param Gurjar");
	}
}
