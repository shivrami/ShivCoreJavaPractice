package com.corejava.passingreturningobject;

public class PassingAndReturningObject2 
{
	public static void main(String[] args) 
	{
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		
		t1.getTime();
		t2.getTime();
		
		t3 = t1.addTime(t2);
		
		t1.displayTime();
		t2.displayTime();
		t3.displayTime();
	}
}
