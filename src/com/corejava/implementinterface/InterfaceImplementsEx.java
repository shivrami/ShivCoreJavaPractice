package com.corejava.implementinterface;

public class InterfaceImplementsEx 
{
	public static void main(String[] args) 
	{
		OneImpl oi = new OneImpl();
		oi.m1();
		
		One o = new OneImpl();
		o.m1();
		
		System.out.println("----------------------------");
		
		TwoImpl ti = new TwoImpl();
		ti.m2();
		
		Two t = new TwoImpl();
		t.m2();
	}
}
