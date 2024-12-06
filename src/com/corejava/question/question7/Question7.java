package com.corejava.question.question7;

// Write an application that illustrates ho to declare interfaces and implement them in various classes. Interfaces AntiLockBrakes, CruiseControl, and PowerSteering declare optional functionality for an automobile. In this simple example, each interface declares one method that has the same name as its interface. The abstract Auto class is extended by the Model, Model2, and Model3 classes. Power steering is available for Model1 objects. Antilock brakes and cruise control are available for Model2 objects. Cruise control is available for Model3 objects. Instantiate each of these classes and exercise in methods.

public class Question7 
{
	public static void main(String[] args) 
	{
		Model1 model1 = new Model1();
		model1.powerSteering();
		
		Model2 model2 = new Model2();
		model2.antiLockBrakes();
		model2.cruiseControl();
		
		Model3 model3 = new Model3();
		model3.cruiseControl();
	}
}
