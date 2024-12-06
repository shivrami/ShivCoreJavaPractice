package com.corejava.characterstream;

import java.io.PrintWriter;

public class PrintWriterEx2 
{
	public static void main(String[] args) 
	{
		PrintWriter pw = new PrintWriter(System.out);
		
		pw.println("Hello");
		pw.println(25.50);
		pw.println(2.5f);
		
		pw.close();
	}
}
