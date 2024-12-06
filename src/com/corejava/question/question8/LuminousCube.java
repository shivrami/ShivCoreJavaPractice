package com.corejava.question.question8;

public class LuminousCube extends Cube implements LuminousObject {

	@Override
	public void lightOn() 
	{
		System.out.println("LuminousCube - Light On");
	}

	@Override
	public void lightOff() 
	{
		System.out.println("LuminousCube - Light Off");
	}

}
