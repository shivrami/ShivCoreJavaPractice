package com.corejava.hierarchyinheritance;

import java.util.Scanner;

public class Shape 
{
	protected int l;
	protected int b;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of l = ");
		l=sc.nextInt();
		
		System.out.println("Enter value of b = ");
		b=sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("l = "+l+"\tb = "+b+"\n");
	}
}
