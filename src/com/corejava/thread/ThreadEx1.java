package com.corejava.thread;

public class ThreadEx1 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Thread Name : "+Thread.currentThread().getName());
			
			System.out.println("One");
			System.out.println("Two");
			
			Thread.sleep(5000);
			
			System.out.println("Three");
			System.out.println("Four");
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
