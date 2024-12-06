package com.corejava.question.question7;

public class Model2 extends Auto implements AntiLockBrakes,CruiseControl 
{
	@Override
	public void cruiseControl() 
	{
		System.out.println("Model2 - Cruise Control");
	}

	@Override
	public void antiLockBrakes() 
	{		
		System.out.println("Model2 - Antilock Brakes");
	}	
}
