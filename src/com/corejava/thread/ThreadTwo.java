package com.corejava.thread;

public class ThreadTwo extends Thread 
{
	public void run()
	{
		try
		{
			for(int i=1001;i<=1010;i++)
			{
				System.out.println(Thread.currentThread().getName()+ " -------- "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
