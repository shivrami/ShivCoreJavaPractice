package com.corejava.exception;

import java.util.Scanner;

public class ArithmeticExceptionEx 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of no1 = ");
			int no1 = sc.nextInt();
			
			System.out.println("Enter value of no2 = ");
			int no2 = sc.nextInt();
			
			int div = no1/no2;
			
			System.out.println("Div = "+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			// System.out.println("Please enter non-zero value for no2");
		}
	}
}
