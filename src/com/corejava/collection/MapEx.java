package com.corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx 
{
	public static void main(String[] args) 
	{
		Map<String, Book> m = new HashMap<String, Book>();
		
		Book b1 = new Book("Mahesh Gurjar", 1000, 250);
		m.put("Java", b1);
		
		m.put("C", new Book("Bala", 250, 300));
		m.put("CPP", new Book("YK", 300, 400));
		
		Set<String> keySet = m.keySet();
		Iterator<String> ite = keySet.iterator();
		
		while(ite.hasNext())
		{
			String k = ite.next();
			Book b = m.get(k);
			
			System.out.println(k);
			System.out.println("------------------------------------");
			b.displayData();
		}
		
	}
}
