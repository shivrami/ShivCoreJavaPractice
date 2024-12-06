package com.corejava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlockEx 
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
		catch(InputMismatchException e)
		{
			System.out.println("Wrong Input : "+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Kindly enter non-zero value in no2 : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
