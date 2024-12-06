package com.corejava.question.question10;

public class Horse extends Mammal implements Vehicle 
{
	@Override
	public void drive() 
	{
		System.out.println("Drive - Horse");
	}
}
