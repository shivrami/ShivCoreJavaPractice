package com.corejava.singleinheritance;

import java.util.Scanner;

public class Second extends First
{
	private int b;
	
	public void getData()
	{
		super.getData();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of b = ");
		b = sc.nextInt();
	}
	
	public void displayData()
	{
		super.displayData();
		
		System.out.println("b = "+b);
	}
}
