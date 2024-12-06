package com.corejava.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEx 
{
	public static void main(String[] args) 
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("India", "Delhi");
		ht.put("Australia", "Canbara");
		ht.put("Bangladesh", "Dhaka");
		ht.put("Sri Lanka", "Columbo");
		
		System.out.println(ht.contains("Delhi"));
		
		System.out.println("-------------------------------------");
		
		Enumeration<String> elements = ht.elements();
		
		while(elements.hasMoreElements())
		{
			String str = elements.nextElement();
			System.out.print(str+",");
		}
		
		System.out.println("\n-------------------------------------");
		
		Enumeration<String> keys = ht.keys();
		
		while(keys.hasMoreElements())
		{
			String k = keys.nextElement();
			String v = ht.get(k);
			
			System.out.println(k+" ----- "+v);
		}
		
		System.out.println("-------------------------------------");				
	}
}
