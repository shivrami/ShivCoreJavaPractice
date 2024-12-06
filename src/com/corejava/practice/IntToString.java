package com.corejava.practice;

public class IntToString 
{
	public static void main(String[] args) 
	{
		int no = 500;
		
		String s1 = String.valueOf(no);
		System.out.println(s1);
		
		Integer obj2 = new Integer(no);
		String s2 = obj2.toString();
		System.out.println(s2);
		
		String s3 = obj2.toBinaryString(5);
		System.out.println(s3);
		
		s3 = obj2.toBinaryString(no);
		System.out.println("Binary : "+s3);
		
		s3 = obj2.toOctalString(no);
		System.out.println("Octal : "+s3);
		
		s3 = obj2.toHexString(no);
		System.out.println("Hex : "+s3);
	}
}
