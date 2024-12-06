package com.corejava.passingobject;

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
	
	public void addition(Circle c1,Circle c2)
	{
		x = c1.x + c2.x;
		y = c1.y + c2.y;
		radius = c1.radius + c2.radius;
	}
}
