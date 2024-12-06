package com.corejava.thread;

public class ThreadEx2 
{
	public static void main(String[] args) 
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
