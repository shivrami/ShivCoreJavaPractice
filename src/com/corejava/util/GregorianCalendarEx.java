package com.corejava.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarEx 
{
	public static void main(String[] args) 
	{
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.isLeapYear(2025));
		
		System.out.println(gc.get(Calendar.DATE));
	}
}
