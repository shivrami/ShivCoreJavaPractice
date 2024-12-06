package com.corejava.thread;

public class MultiThreadEx2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Main Thread - Start");
			
			ThreadFirst first=new ThreadFirst();
			ThreadSecond second=new ThreadSecond();
			
			Thread t1 = new Thread(first,"First Thread");
			Thread t2 = new Thread(second,"Second Thread");
			
			t1.start();
			t2.start();
			
			t1.join();	
			t2.join();
			
			System.out.println("Main Thread - End");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
