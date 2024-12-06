package com.corejava.characterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			// FileReader fr = new FileReader("b1.txt");
			// BufferedReader br = new BufferedReader(fr);
			
			BufferedReader br = new BufferedReader(new FileReader("b1.txt"));
			
			// Char by Char Reading
			
//			int no;
//			
//			while( ( no=br.read() ) != -1)
//			{
//				char ch = (char)no;
//				System.out.print(ch);
//			}
//			
//			br.close();
			
			
			
			// Line by Line Reading
			
			String str;
			
			while( (str = br.readLine()) != null )
			{
				System.out.println(str);
			}
			
			br.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
