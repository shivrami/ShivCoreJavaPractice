package com.corejava.publicmember;

import java.util.Scanner;

public class MultipleObjects 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of x = ");
		c1.x = sc.nextInt();
		
		System.out.println("Enter value of y = ");
		c1.y = sc.nextInt();
		
		System.out.println("Enter value of radius = ");
		c1.radius = sc.nextInt();
		
		System.out.println("Enter value of x = ");
		c2.x = sc.nextInt();
		
		System.out.println("Enter value of y = ");
		c2.y = sc.nextInt();
		
		System.out.println("Enter value of radius = ");
		c2.radius = sc.nextInt();
		
		System.out.println("x = "+c1.x+"\ty = "+c1.y+"\tradius = "+c1.radius);
		System.out.println("x = "+c2.x+"\ty = "+c2.y+"\tradius = "+c2.radius);
	}
}
