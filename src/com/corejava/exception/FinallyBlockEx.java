package com.corejava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockEx 
{
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("Before Div");
			
			div();				
		} 
		catch (InputMismatchException e) 
		{			
			System.out.println("Error : "+e.getMessage());
			// e.printStackTrace();
		} 
		catch (ArithmeticException e) 
		{	
			System.out.println("Error : "+e.getMessage());
			// e.printStackTrace();
		} 
		catch (Exception e) 
		{		
			System.out.println("Error : "+e.getMessage());
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("After Div");
		}		
	}
	
	private static void div() throws InputMismatchException,ArithmeticException,Exception
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of no1 = ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter value of no2 = ");
		int no2 = sc.nextInt();
		
		int div = no1/no2;
		
		System.out.println("Div = "+div);
	}
}
