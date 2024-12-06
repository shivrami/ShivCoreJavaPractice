package com.corejava.singleinheritance;

import java.util.Scanner;

public class First 
{
	private int a;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a = ");
		a = sc.nextInt();			
	}
	
	public void displayData()
	{
		System.out.println("a = "+a);
	}
}
