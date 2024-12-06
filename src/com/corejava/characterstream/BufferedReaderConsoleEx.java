package com.corejava.characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConsoleEx 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			// InputStreamReader isr = new InputStreamReader(System.in);
			// BufferedReader br = new BufferedReader(isr);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter value of no = ");			
			int no = br.read(); // Input as character even we provide int value
			
			System.out.println("No = "+no);
			
			System.out.println("--------------------------");
			
			System.out.println("Enter value of no2 = ");
			br = new BufferedReader(new InputStreamReader(System.in));
			int no2 = Integer.parseInt(br.readLine());
			
			System.out.println("No2 = "+no2);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
