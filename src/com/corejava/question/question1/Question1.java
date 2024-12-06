package com.corejava.question.question1;

//Write a program that illustrates method overriding. Class Bond is extended by ConvertibleBond. Each of these classes defines a display() method that outputs the string "Bond" or "ConvertibleBond" respectively. Declare  an array to hold six Bond objects. Initialize the elements of the array with a mix of Bond and ConvertibleBond objects. Execute a program loop to invoke the display() method of each object.

public class Question1 
{
	public static void main(String[] args) 
	{
		Bond b[]=new Bond[6];
		
		b[0]=new Bond();
		b[1]=new Bond();
		b[2]=new ConvertibleBond();
		b[3]=new Bond();
		b[4]=new ConvertibleBond();
		b[5]=new ConvertibleBond();
		
		for(int i=0;i<=b.length-1;i++)
		{
			b[i].display();
		}
	}
}
