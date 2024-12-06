package com.corejava.characterstream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterEx1 
{
	public static void main(String[] args) 
	{
		try 
		{
			// PrintWriter pw = new PrintWriter(new FileWriter("p1.txt", true));
			
			PrintWriter pw = new PrintWriter("p1.txt");
			
			pw.println("Hello");
			pw.println(100);
			pw.println(2.5f);
			pw.println(25.50);
			
			pw.close();
			
			System.out.println("File Created.....");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
