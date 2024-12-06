package com.corejava.thread;

public class MultiThreadEx1 
{
	public static void main(String[] args) 
	{
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();
	}
}