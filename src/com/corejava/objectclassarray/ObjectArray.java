package com.corejava.objectclassarray;

public class ObjectArray 
{
	public static void main(String[] args) 
	{
		Object o[]=new Object[5];
		
		o[0]=new Integer(10);
		o[1]=new Byte("1");
		o[2]=new Short("5");
		o[3]=new Float(2.5f);
		o[4]=new Double(25.25);
		
		for(int i=0;i<=o.length-1;i++)
		{
			System.out.println(o[i]);
		}
	}
}
