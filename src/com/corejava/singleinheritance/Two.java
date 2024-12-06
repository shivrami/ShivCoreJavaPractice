package com.corejava.singleinheritance;

import java.util.Scanner;

public class Two extends One
{
	private int b;
	
	public void getTwoData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of b = ");
		b = sc.nextInt();
	}
	
	public void displayTwoData()
	{
		System.out.println("b = "+b);
	}
}
