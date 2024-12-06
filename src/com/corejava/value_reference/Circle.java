package com.corejava.value_reference;

import java.util.Scanner;

public class Circle 
{
	private int x;
	private int y;
	private int radius;
	
	public void getData() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of x = ");
		x = sc.nextInt();
		
		System.out.println("Enter value of y = ");
		y = sc.nextInt();
		
		System.out.println("Enter value of radius = ");
		radius = sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("x = "+x+"\ty = "+y+"\tradius = "+radius+"\n");
	}
}
