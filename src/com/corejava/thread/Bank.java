package com.corejava.thread;

public class Bank 
{
	private double balance = 0;
	
	public double getBalance()
	{
		return balance;
	}
	
	public synchronized void addBalance(double amount)
	{
		balance = balance + amount;
	}
}
