package com.corejava.util;

import java.util.Random;

public class RandomEx 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		System.out.println(r.nextGaussian());
		System.out.println(r.nextBoolean());
		
		byte b[]=new byte[5];		
		r.nextBytes(b);
		
		for(int i=0;i<=b.length-1;i++) 
		{
			System.out.print(b[i]+",");
		}
		
		System.out.println();				
	}
}
