package com.corejava.thread;

public class Customer extends Thread 
{
	private Bank bank;
	
	public Customer(Bank bank)
	{
		this.bank = bank;
	}
	
	public void run()
	{
		deposit();
	}
	
	public void deposit()
	{
		for(int i=1;i<=1000;i++)
		{
			bank.addBalance(10);
		}
	}
}