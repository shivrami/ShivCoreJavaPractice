package com.corejava.passingreturningobject;

import java.util.Scanner;

public class Time 
{
	private int hh;
	private int mm;
	private int ss;
	
	public void getTime()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of hh = ");
		hh = sc.nextInt();
		
		System.out.println("Enter value of mm = ");
		mm = sc.nextInt();
		
		System.out.println("Enter value of ss = ");
		ss = sc.nextInt();
	}
	
	public void displayTime()
	{
		System.out.println(hh+" : "+mm+" : "+ss+"\n");
	}
	
	public Time addTime(Time t)
	{
		Time temp = new Time();
		
		temp.hh = hh + t.hh;
		temp.mm = mm + t.mm;
		temp.ss = ss + t.ss;
		
		if(temp.ss >= 60)
		{
			temp.mm = temp.mm + temp.ss/60;
			temp.ss = temp.ss%60;
		}
		
		if(temp.mm >= 60)
		{
			temp.hh = temp.hh + temp.mm/60;
			temp.mm = temp.mm%60;
		}
		
		return temp;
	}
}
