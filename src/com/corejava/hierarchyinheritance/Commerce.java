package com.corejava.hierarchyinheritance;

import java.util.Scanner;

public class Commerce extends Student 
{
	private int acc;
	private int stat;
	
	public void getData()
	{
		super.getData();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of acc = ");
		acc = sc.nextInt();
		
		System.out.println("Enter value of stat = ");
		stat = sc.nextInt();
	}
	
	public void displayData()
	{
		super.displayData();
		
		System.out.println("Acc = "+acc);
		System.out.println("Stat = "+stat+"\n");
	}
}
