package com.corejava.staticex;

import java.util.Scanner;

public class Student 
{	
	private int rollno;
	private String name;
	private static String SCHOOL;
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rollno = ");
		rollno = sc.nextInt();
		
		System.out.println("Enter Name = ");
		sc=new Scanner(System.in);
		name = sc.nextLine();
	}
	
	public void displayData()
	{
		System.out.println("Rollno = "+rollno);
		System.out.println("Name   = "+name+"\n");
	}
	
	public static void setSchoolName(String school)
	{
		Student.SCHOOL = school;
	}
	
	public static void displaySchoolName()
	{
		System.out.println("School Name = "+Student.SCHOOL+"\n");
	}
}
