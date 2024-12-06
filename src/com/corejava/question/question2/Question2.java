package com.corejava.question.question2;

// Declare an abstract class Vehicle with an abstract method named numWheels(). Provide subclasses Car and Truck that each implement this method. Create instances of these subclasses and demonstrate the use of this method.

public class Question2 
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		Truck truck = new Truck();
		
		car.numWheels();
		truck.numWheels();
	}
}
