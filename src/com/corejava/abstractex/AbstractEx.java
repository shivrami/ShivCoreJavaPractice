package com.corejava.abstractex;

public class AbstractEx 
{
	public static void main(String[] args) 
	{
		Two t=new Two();
		
		t.m1();
		t.m2();
			
		System.out.println("-----------------------------");		
		
		One o = new Two();		
		
		o.m1();
		o.m2();
	}
}
