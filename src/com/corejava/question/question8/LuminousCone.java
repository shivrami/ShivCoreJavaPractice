package com.corejava.question.question8;

public class LuminousCone extends Cone implements LuminousObject {

	@Override
	public void lightOn() 
	{		
		System.out.println("LuminousCone - Light On");
	}

	@Override
	public void lightOff() 
	{
		System.out.println("LuminousCone - Light Off");
	}

}
