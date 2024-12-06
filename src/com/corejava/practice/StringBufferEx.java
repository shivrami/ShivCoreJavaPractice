package com.corejava.practice;

public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Mahesh Gurjar");
		
		System.out.println("sb = "+sb);
		
		System.out.println("length = "+sb.length());
		System.out.println("character at - 4 = "+sb.charAt(4));
		
		sb.append(", Param Gurjar");
		System.out.println("sb = "+sb);
				
		sb.insert(3, "ZZZZZ");
		System.out.println("sb = "+sb);
		
		sb.deleteCharAt(1);
		System.out.println("delete char at - 1 = "+sb);
		
		sb.delete(2, 7);
		System.out.println("delete - 2, 7 = "+sb);
		
		sb.reverse();
		System.out.println("reverse = "+sb);				
	}
}
