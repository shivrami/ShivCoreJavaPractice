package com.corejava.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx 
{
	public static void main(String[] args) 
	{
		Set<String> set = new TreeSet<String>();
		
		set.add("Mahesh");
		set.add("Bharat");
		set.add("Amit");
		set.add("Bharat");
		set.add("Chintan");		
		
		System.out.println(set);
		
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(50);
		set2.add(25);
		set2.add(1);
		set2.add(25);
		set2.add(5);
		
		System.out.println(set2);
		
		
	}
}
