package com.corejava.bytestream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("byte3.txt", true));
			
			dos.writeInt(500);
			dos.writeFloat(25.50f);
			dos.writeDouble(500.25);
			dos.writeUTF("Mahesh Gurjar");
			
			dos.close();
			
			System.out.println("Data Inserted......");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
