package com.corejava.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx 
{
	public static void main(String[] args) 
	{
		Map<String, String> m = new TreeMap<String, String>();
		
		m.put("India", "Delhi");
		m.put("Sri Lanka", "Columbo");
		m.put("Australia", "Canbara");
		m.put("Bangladesh", "Dhaka");
		
		System.out.println(m);
	}
}
