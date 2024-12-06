package com.corejava.hierarchyinheritance;

import java.util.Scanner;

public class Science extends Student 
{
	private int maths;
	private int phy;
	
	public void getData()
	{
		super.getData();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maths = ");
		maths = sc.nextInt();
		
		System.out.println("Enter Phy = ");
		phy =sc.nextInt();
	}
	
	public void displayData()
	{
		super.displayData();
		
		System.out.println("Maths = "+maths);
		System.out.println("Phy = "+phy+"\n");
	}
}
