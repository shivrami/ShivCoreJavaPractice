package com.corejava.customexception;

// public class NegativeValueException extends RuntimeException  -- Unchecked Type Exception 

public class NegativeValueException extends Exception // Checked Type Exception
{
	public NegativeValueException()
	{
		super("Negative Value Not Allow");
	}
	
	public NegativeValueException(String message)
	{
		super(message);
	}
}