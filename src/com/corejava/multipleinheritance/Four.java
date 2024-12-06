package com.corejava.multipleinheritance;

public class Four extends One implements Two,Three
{
	@Override
	public void th1() {
		System.out.println("Four - th1");		
	}

	@Override
	public void t1() {
		System.out.println("Four - t1");
	}

	@Override
	public void m3() {		
		System.out.println("Four - m3");
	}
}
