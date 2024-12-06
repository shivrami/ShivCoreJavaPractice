package com.corejava.question.question8;

// Write a program that illustrates the use of interface references. Interface LuminousObject declares lightOff() and lightOn() methods. Class SolidObject is extended by Cone and Cube. Class LuminousCone extends Cone and implements LuminousObject. Class LuminousCube extends Cube and implements LuminousObject. Instantiate the LuminousCone and LuminousCube classes. Use interface references to refer to those objects. Invoke the methods of the LuminousObject interface via the interface reference.

public class Question8 
{
	public static void main(String[] args) 
	{
		LuminousObject luminousObject = new LuminousCone();
		luminousObject.lightOn();
		luminousObject.lightOff();
		
		luminousObject = new LuminousCube();
		luminousObject.lightOn();
		luminousObject.lightOff();
	}
}
