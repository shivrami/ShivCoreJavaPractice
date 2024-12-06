package com.corejava.exception;

import java.util.Scanner;

public class ThrowEx1 
{
	public static void main(String[] args) 
	{ 				
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value = ");
			int no = sc.nextInt();
			
			if(no<0)
			{
				//throw new ArithmeticException();
				throw new ArithmeticException("Please enter positive value....");
			}
			
			System.out.println("No = "+no);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
