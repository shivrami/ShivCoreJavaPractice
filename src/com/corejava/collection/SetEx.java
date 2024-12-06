package com.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx 
{
	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		
		set.add("Amit");
		set.add("Mahesh");
		set.add("Bharat");
		set.add("Krunal");
		set.add("Ketan");
		set.add("Mahesh");
		set.add("bharat");
		
		System.out.println(set);
		
		Iterator<String> ite = set.iterator();
		
		while(ite.hasNext())
		{
			String str = ite.next();
			System.out.println(str);
		}		
	}
}
