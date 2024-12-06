package com.corejava.constructor;

public class ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		Sphere s1 = new Sphere();
		Sphere s2 = new Sphere(20);
		Sphere s3 = new Sphere(30, 30);
		Sphere s4 = new Sphere(40, 40, 40);
		Sphere s5 = new Sphere(50,50,50,50);
		
		s1.displayData();
		s2.displayData();
		s3.displayData();
		s4.displayData();
		s5.displayData();
	}
}