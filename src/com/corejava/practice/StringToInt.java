package com.corejava.practice;

public class StringToInt 
{
	public static void main(String[] args) 
	{		
		
		System.out.println("Min : "+Integer.MIN_VALUE);
		System.out.println("Max : "+Integer.MAX_VALUE);
		System.out.println("Size : "+Integer.SIZE);
		
		String s1 = "100";
		System.out.println(s1);		
		
		int no1 = Integer.parseInt(s1);
		System.out.println(no1);
		
		Integer obj2 = Integer.valueOf(s1);
		int no2 = obj2.intValue();	
		System.out.println(no2);
		
		int no3 = Integer.valueOf(s1).intValue(); // Method Chain
		System.out.println(no3);
		
		Integer obj4 = new Integer(s1);
		int no4 = obj4.intValue();
		System.out.println(no4);
	}
}
