package com.corejava.characterstream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterConsoleEx 
{
	public static void main(String[] args) 
	{		
		try
		{
			// OutputStreamWriter osw = new OutputStreamWriter(System.out);
			// BufferedWriter bw = new BufferedWriter(osw);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for(int i=1;i<=10;i++)
			{
				bw.write("MG : "+i+"\n");
			}
			
			bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
