package com.corejava.practice;

public class NarrowingConversion 
{
	public static void main(String[] args) 
	{
		short s1 = 1;		
		byte b1=(byte)s1;
		
		int i2 = 1;
		short s2 = (short)i2;
		byte b2 = (byte)i2;				
	}
}
