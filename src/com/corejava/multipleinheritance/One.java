package com.corejava.multipleinheritance;

public abstract class One 
{
	public void m1()
	{
		System.out.println("One - m1");		
	}
	
	public final void m2()
	{
		System.out.println("One - m2");
	}
	
	public abstract void m3();
}
