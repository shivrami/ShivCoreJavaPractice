package com.corejava.practice;

import java.util.Scanner;

public class Add 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vlaue of no1 = ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter value of no2 = ");
		int no2 = sc.nextInt();
		
		int ans = no1+no2;
		
		System.out.println("Addition = "+ans);
	}
}
