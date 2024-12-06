package com.corejava.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("byte2.txt"));
			
			int no;
			
			while( (no=bis.read()) != -1 )
			{
				System.out.println(no);
			}
			
			bis.close();
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
