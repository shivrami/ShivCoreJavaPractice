package com.corejava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionEx {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of no = ");
			int no = sc.nextInt();
			
			System.out.println("No = "+no);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter numeric value");
			System.out.println(e.getMessage());
		}
	}

}
