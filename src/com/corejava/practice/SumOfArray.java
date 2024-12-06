package com.corejava.practice;

import java.util.Scanner;

public class SumOfArray 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int total=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter value = ");
			a[i] = sc.nextInt();
			
			total=total+a[i];
		}
		
		System.out.println("Total = "+total);
	}
}
