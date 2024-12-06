package com.corejava.instanceofex;

public class InstanceOfEx 
{	
	public static void main(String[] args) 
	{
		One o;
		
		// o=new Two();
		o=new Three();
		
		if(o instanceof Three)
		{
			System.out.println("Three Class Instance");
		}
		else if(o instanceof Two)
		{
			System.out.println("Two Class Instance");
		}
	}
}
