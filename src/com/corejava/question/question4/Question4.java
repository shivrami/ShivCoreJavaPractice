package com.corejava.question.question4;

// The abstract Fruit class ha four subclasses named Apple, Banana, Orange, and Strawberry. Write an application that demonstrates how to establish this class hierarchy. Declare on instance variable of type String that indicates the colour of a fruit. Create and display instances of these objects. Override the toString() method of Object to return a string with name of the fruit and its colour.

public class Question4 {

	public static void main(String[] args) 
	{
		Apple apple = new Apple("Red");
		Banana banana = new Banana("Yellow");
		Orange orange = new Orange("Orange");
		Strawberry strawberry = new Strawberry("Pink");
		
		System.out.println("Apple - "+apple.toString());
		System.out.println("Banana - "+banana.toString());
		System.out.println("Orange - "+orange.toString());
		System.out.println("Strawberry - "+strawberry);
	}

}
