package com.corejava.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		System.out.println(c.getTimeInMillis());
		
		Date dt = c.getTime();
		System.out.println(dt);			
	}
}
