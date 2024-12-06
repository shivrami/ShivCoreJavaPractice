package com.corejava.exception;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		try
		{
			String str = "Mahesh";
			
			int no = Integer.parseInt(str);
			
			System.out.println("No = "+no);
		}
		catch(NumberFormatException e)
		{
			System.out.println("String content is not numeric");
			System.out.println(e.getMessage());
		}
	}

}
