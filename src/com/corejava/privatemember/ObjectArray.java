package com.corejava.privatemember;

public class ObjectArray 
{
	public static void main(String[] args) 
	{
		// This is declaration of array only, not creating object
		Rectangle r[]=new Rectangle[5];
		
		for(int i=0;i<=r.length-1;i++)
		{
			r[i] = new Rectangle();
			
			r[i].getData();
		}
		
		for(int i=0;i<=r.length-1;i++)
		{
			r[i].displayData();
		}
	}
}