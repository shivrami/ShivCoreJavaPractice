package com.corejava.exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionEx 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<=a.length-1;i++)
			{
				System.out.println("Enter value = ");
				a[i] = sc.nextInt();
			}
			
			System.out.println("----------------------");
			
			System.out.println("First Element = "+a[0]);
			System.out.println("Tenth Element = "+a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of Boundry, Kindly Solve It");
			System.out.println("Error : "+e.getMessage());
		}
	}
}
