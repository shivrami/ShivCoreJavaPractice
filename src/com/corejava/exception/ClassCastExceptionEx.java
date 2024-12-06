package com.corejava.exception;

public class ClassCastExceptionEx 
{
	public static void main(String[] args) 
	{
		try
		{
			Object obj = new Integer(10);
			
			Float fObj = (Float)obj;
			
			System.out.println("Success");
		}
		catch(ClassCastException e)
		{
			System.out.println("Wrong Class Casting");
			System.out.println("Error : "+e.getMessage());
		}
	}
}
