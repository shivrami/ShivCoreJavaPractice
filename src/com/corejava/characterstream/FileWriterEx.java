package com.corejava.characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw = new FileWriter("f1.txt", true);
			
			for(int i=1;i<=10;i++)
			{
				fw.write("Line Number "+i+"\n");
			}
			
			fw.close();
			
			System.out.println("File Created.......");
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
	}
}
