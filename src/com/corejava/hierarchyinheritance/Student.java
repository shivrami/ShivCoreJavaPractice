package com.corejava.hierarchyinheritance;

import java.util.Scanner;

public class Student 
{
	private int rollno;
	private String name;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rollno = ");
		rollno=sc.nextInt();
		
		System.out.println("Enter Name = ");
		sc=new Scanner(System.in);
		name=sc.nextLine();
	}
	
	public void displayData()
	{
		System.out.println("Rollno = "+rollno);
		System.out.println("Name = "+name+"\n");
	}
}
