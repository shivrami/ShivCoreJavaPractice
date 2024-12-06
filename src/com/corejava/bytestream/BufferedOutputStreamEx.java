package com.corejava.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte2.txt", true));
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter value of no = ");
			int no = sc.nextInt();
			
			bos.write(no);
			
			bos.close();
			
			System.out.println("Data Inserted.....");
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
