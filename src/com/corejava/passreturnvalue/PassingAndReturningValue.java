package com.corejava.passreturnvalue;

public class PassingAndReturningValue 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		
		b1.getData();
		b1.displayData();
		
		float dp = b1.getDiscountedPrice(5.0f);
		System.out.println("5% DP = "+dp);
		
		dp = b1.getDiscountedPrice(7.5f);
		System.out.println("7.5% DP = "+dp);
		
		dp = b1.getDiscountedPrice(25);
		System.out.println("25% DP = "+dp);
	}
}
