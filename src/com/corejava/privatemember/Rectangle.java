package com.corejava.privatemember;

import java.util.Scanner;

public class Rectangle 
{
	private int l;
	private int b;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of l = ");
		l = sc.nextInt();
		
		System.out.println("Enter value of b = ");
		b = sc.nextInt();
	}
	
	public void displayData()
	{
		System.out.println("l = "+l+"\tb = "+b);
	}
}
