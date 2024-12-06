package com.corejava.multilevelinheritance;

import java.util.Scanner;

import com.corejava.singleinheritance.Second;

public class Third extends Second 
{
	private int c;
	
	public void getData()
	{
		super.getData();
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter value of c = ");
		c=sc.nextInt();
	}
	
	public void displayData()
	{
		super.displayData();
	
		System.out.println("c = "+c);
	}
}
