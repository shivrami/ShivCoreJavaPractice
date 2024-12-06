package com.corejava.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 
{
	public static void main(String[] args) 
	{		
		Vector v = new Vector();
		
		v.add(10);
		v.add(2.5f);
		v.add(25.50);
		v.add("Mahesh Gurjar");
		v.add("Bharat Gurjar");
		v.add(1, 25000);
		v.insertElementAt(50000, 1);
		
		v.addElement(1000);
		v.addElement(2000);		
		
		v.addFirst(5000);
		v.addLast(7000);
		v.add(2);
		
		System.out.println(v);		
		System.out.println("Vector Size = "+v.size());
		
		System.out.println("First Element = "+v.get(0));
		System.out.println("Fourth Element = "+v.get(3));	
		System.out.println("Fourth Element = "+v.elementAt(3));
		System.out.println("Last Element = "+v.get(v.size()-1));
		System.out.println("First Element = "+v.firstElement());
		System.out.println("Last Element = "+v.lastElement());
		
		System.out.println("----------------------------");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("----------------------------");
		
		// v.remove(0); // remove 0th index element
		// v.remove(2); // remove 2nd index Element
		// v.remove(v.size()-1); // remove Last Element
		// v.remove(new Integer(2)); // remove Value - 2
		
		// v.removeElement(2); // remove Value - 2
		// v.removeElementAt(2); // Remove 2nd Element
		
		// v.removeAllElements(); // Remove All		
		// v.clear(); // Remove All
		
		// v.removeFirst(); // Remove First element
		// v.removeLast(); // Remove Last element
		
		// v.set(0, 5); // Update Element
		// v.setElementAt(25, 0); // Update Element
		
		System.out.println(v);
		
		System.out.println("Contains 25000? = "+v.contains(25000));
		System.out.println("Contains 250? = "+v.contains(250));
			
		System.out.println("----------------------------");
		
		Enumeration e = v.elements(); 
		
		while( e.hasMoreElements() )
		{
			Object obj =  e.nextElement();
			System.out.print(obj+",");
		}
		
		System.out.println("\n----------------------------");
		
		Iterator ite = v.iterator();
		
		while( ite.hasNext() )
		{
			Object obj = ite.next();
			System.out.print(obj+",");
		}
		
	}
}
