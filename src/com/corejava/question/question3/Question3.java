package com.corejava.question.question3;

// Write a program that creates an Integer object. Then obtain the associated Class object. Invoke the getSuperclass() method to get the Class object for the superclass of Integer. Invoke the getName() method to obtain the name of the superclass. Display that name.

public class Question3 
{
	public static void main(String[] args) 
	{
		Integer integer = new Integer(100);
		
		Class integerClass =  integer.getClass();
		
		Class integerSuperClass = integerClass.getSuperclass();
		
		System.out.println("Superclass of Integer = "+integerSuperClass.getName());
	}
}
