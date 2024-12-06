package com.corejava.thread;

public class ThreadSecond implements Runnable
{
	@Override
	public void run() {
		try
		{
			for(int i=101;i<=110;i++)
			{
				System.out.println(Thread.currentThread().getName()+" ----- "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
