package com.corejava.mutableimmutable;

public class MutableImmutableEx 
{
	public static void main(String[] args) 
	{
		String s1 = "Mahesh Gurjar";		
		
		// s1.toLowerCase();
		// s1.toUpperCase();
		
		s1.concat(", Param Gurjar");		
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("Param Gurjar");
		sb.append(", Param, Param, Param");
		System.out.println(sb);
		
	}
}
