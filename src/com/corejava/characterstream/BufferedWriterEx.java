package com.corejava.characterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			// FileWriter fw = new FileWriter("b1.txt");			
			// BufferedWriter bw = new BufferedWriter(fw);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("b1.txt",true));
			
			for(int i=201;i<=210;i++)
			{
				bw.write("Line Number : "+i+"\n");
			}
			
			bw.close();
			
			System.out.println("Data Inserted.....");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
