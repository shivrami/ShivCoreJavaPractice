package com.corejava.singleinheritance;

import java.util.Scanner;

public class One 
{
	private int a;
	
	public void getOneData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a = ");
		a = sc.nextInt();
	}
	
	public void displayOneData()
	{
		System.out.println("a = "+a);
	}
}
