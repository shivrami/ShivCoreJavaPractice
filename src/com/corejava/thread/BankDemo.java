package com.corejava.thread;

public class BankDemo 
{	
	public static void main(String[] args) 
	{
		try
		{
			Bank bank = new Bank();
			
			Customer c[]=new Customer[5];
			
			for(int i=0;i<=c.length-1;i++)
			{
				c[i]=new Customer(bank);
				c[i].start();
			}
			
			for(int i=0;i<=c.length-1;i++)
			{
				c[i].join();
			}
			
			System.out.println("Bank Balance = "+bank.getBalance());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
