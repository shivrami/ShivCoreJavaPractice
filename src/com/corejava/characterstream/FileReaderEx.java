package com.corejava.characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("f1.txt");
			
			int no;
			
			while( ( no=fr.read() ) != -1 )
			{
				// System.out.print(no);
				
				char ch = (char)no;
				System.out.print(ch);
			}
			
			fr.close();
		} 
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		} 
		catch (IOException e) 
		{		
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
