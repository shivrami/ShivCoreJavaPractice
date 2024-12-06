package com.corejava.bytestream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			DataInputStream dis = new DataInputStream(new FileInputStream("byte3.txt"));
			
			int no = dis.readInt();
			float f = dis.readFloat();
			double d = dis.readDouble();
			String str = dis.readUTF();
			
			System.out.println(no);
			System.out.println(f);
			System.out.println(d);
			System.out.println(str);
			
			dis.close();
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
