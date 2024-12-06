package com.corejava.collection;

import java.util.Enumeration;
import java.util.Vector;

import com.corejava.publicmember.Circle;

public class VectorEx2 
{
	public static void main(String[] args) 
	{
		// Vector<Integer> v1 = new Vector<Integer>();
		// Vector<Circle> v2 = new Vector<Circle>();
		
		Vector<String> v = new Vector<String>();
		
		v.add("Mahesh Gurjar");
		v.add("Bharat Gurjar");
		
		v.addElement("Krunal Gurjar");	
		
		Enumeration<String > e = v.elements();
		
		while(e.hasMoreElements())
		{
			String s = e.nextElement();
			System.out.println(s);
		}		
	}
}
