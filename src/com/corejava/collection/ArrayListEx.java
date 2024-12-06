package com.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mahesh Gurjar");
		al.add("Bharat Gurjar");
		al.add(0, "Param Gurjar");
		
		// al.remove(2);
		// al.remove("Param Gurjar");
		// al.clear();
		
		al.addFirst("Hiren Patel");
		al.addLast("Biren Patel");
		
		al.set(0, "Lalit");
		
		// al.removeFirst();
		// al.removeLast();
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Mahesh Gurjar"));
		System.out.println("0th index Element = "+al.get(0));
		System.out.println("Last index Element = "+al.get(al.size()-1));
		System.out.println("0th index Element = "+al.getFirst());
		System.out.println("Last index Element = "+al.getLast());
	
		Object obj[] = al.toArray();
		
		System.out.println("------------------------------------");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+",");
		}
		
		System.out.println("\n------------------------------------");
		
		Iterator<String> ite = al.iterator();
		
		while(ite.hasNext())
		{
			String s = ite.next();
			System.out.print(s+",");
		}
	}

}
