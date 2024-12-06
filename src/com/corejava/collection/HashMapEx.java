package com.corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> h = new HashMap<String, String>();
		
		h.put("India", "Delhi");
		h.put("Australia", "Canbara");
		h.put("Bangladesh", "Dhaka");
		h.put("Sri Lanka", "Columbo");
		// h.put("India", "ZZZZ");
		
		// h.remove("Bangladesh");
		// h.remove("Bangladesh", "ZZZZZ");
		
		// h.clear();
		
		// h.replace("USA", "ZZZZZ");
		// h.replace("India", "Delhi", "ABCD");
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		System.out.println(h.get("India"));
		System.out.println(h.get("USA"));
		
		System.out.println("----------------------------------");
		
		for(int i=0;i<=h.size()-1;i++)
		{
			System.out.print(h.get(i)+",");
		}
		
		System.out.println("\n----------------------------------");
		
		Set<String> kSet = h.keySet();
		Iterator<String> kSetIte = kSet.iterator(); 
		
		while(kSetIte.hasNext())
		{
			String key = kSetIte.next();
			String value =  h.get(key);
			
			System.out.println(key+" ------ "+value);
		}
		
		System.out.println("\n----------------------------------");
		
		System.out.println(h.containsKey("India"));
		System.out.println(h.containsValue("ABCD"));
		
		System.out.println("\n----------------------------------");
		
		Set<Entry<String, String>> entrySet = h.entrySet();			
	}
}
