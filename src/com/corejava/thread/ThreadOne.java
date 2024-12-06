package com.corejava.thread;

public class ThreadOne extends Thread 
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+ " ------- "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
