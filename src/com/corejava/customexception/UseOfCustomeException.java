package com.corejava.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseOfCustomeException 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter value of no = ");
			int no = sc.nextInt();
			
			if(no<0)
			{
				// throw new NegativeValueException();
				throw new NegativeValueException("Kindly Enter Positive Number");
			}
			
			System.out.println("No = "+no);
		}
		catch(NegativeValueException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
