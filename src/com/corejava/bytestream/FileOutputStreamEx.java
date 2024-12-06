package com.corejava.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			
			FileOutputStream fos = new FileOutputStream("byte1.txt", true);
			
			System.out.println("Enter value of no = ");
			int no = sc.nextInt();
			
			fos.write(no);
			
			fos.close();
			
			System.out.println("File Created....");
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
