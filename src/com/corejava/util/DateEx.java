package com.corejava.util;

import java.util.Date;

public class DateEx 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		
		System.out.println(d1);
		System.out.println(d1.toString());
		
		System.out.println(d1.getDate());
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth() + 1);
		System.out.println(d1.getYear() + 1900);
		
		String dt = d1.getDate()+ "/" + (d1.getMonth()+1) + "/" + (d1.getYear()+1900);		
		System.out.println(dt);
		
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		
		System.out.println(d1.getTime());
		
		Date d2 = new Date(2024-1900, 8, 29);
		
		System.out.println(d2);
		
		if(d1.before(d2))
		{
			System.out.println("d2 is greater date");
		}
		else
		{
			System.out.println("d1 is greater date");
		}				
	}
}
