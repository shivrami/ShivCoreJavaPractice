package com.corejava.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("byte1.txt");
			
			int no;
			
			while( (no=fis.read()) != -1)
			{
				System.out.println(no);
			}
			
			fis.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
