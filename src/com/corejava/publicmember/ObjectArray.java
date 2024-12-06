package com.corejava.publicmember;

import java.util.Scanner;

public class ObjectArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		// This is only declaration of object Array, not creating objects
		Circle c[] = new Circle[5];
		
//		c[0] = new Circle();
//		c[1] = new Circle();
//		c[2] = new Circle();
//		c[3] = new Circle();
//		c[4] = new Circle();
		
		for(int i=0;i<=c.length-1;i++)
		{
			c[i] = new Circle();
			
			System.out.println("Enter value of x = ");
			c[i].x = sc.nextInt();
			
			System.out.println("Enter value of y = ");
			c[i].y = sc.nextInt();
			
			System.out.println("Enter value of radius = ");
			c[i].radius = sc.nextInt();
		}
		
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println("x = "+c[i].x+"\ty = "+c[i].y+"\tradius = "+c[i].radius);
		}
	}
}
