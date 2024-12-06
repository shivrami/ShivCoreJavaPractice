package com.corejava.question.question5;

// The abstract Airplane class has three subclasses named B747, B757 and B767. Each airplane type can transport a different number of passengers. Each airplane object has a unique serial number. Write an application that declares this class hierarchy. Instantiate several types of airplanes and display them. Override toString() method of Object to return a string with the type, serial number, and capacity.

public class Question5 
{
	public static void main(String[] args) 
	{
		B747 b747 = new B747();
		
		b747.setPassengerCapacity(40);
		b747.setSerialNumber("B111");
		
		B757 b757 = new B757(50, "B222");
		B767 b767 = new B767(100,"B333");
		
		System.out.println(b747);
		System.out.println(b757);
		System.out.println(b767);
	}
}
