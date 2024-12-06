package com.corejava.practice;

public class WideningConversion 
{
	public static void main(String[] args) 
	{
		byte b1 = 1;		
		short s1 = b1;
		int i1 =  b1;
		long l1 = b1;
		float f1 = b1;
		double d1 = b1;
				
		short s2 = 1;
		int i2 = s2;
		long l2 = s2;
		float f2 = s2;
		double d2 = s2;		
	}
}
