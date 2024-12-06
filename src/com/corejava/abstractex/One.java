package com.corejava.abstractex;

public abstract class One 
{
	public void m1()
	{
		System.out.println("One - m1");
	}
	
	public abstract void m2();
	
	public final void m3()
	{
		System.out.println("One - m3");
	}
}