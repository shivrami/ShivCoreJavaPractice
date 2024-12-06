package com.corejava.question.question10;

// The Vehicle interface declares a drive() method. The abstract Mammal class is the superclass of the Bear, Elephant, Horse and Lion classes. The Vehicle interface is implemented by the Elephant and Horse classes. However the Bear and Lion classes do not implement this interface. The main() method creates and initializes an array of four Mammal objects. A loop then iterates through the elements in that array. If the object implements the Vehicle interface, the drive() method is invoked.

public class Question10 
{
	public static void main(String[] args) 
	{
		Mammal m[] = new Mammal[5];
		
		m[0]=new Bear();
		m[1]=new Elephant();
		m[2]=new Lion();
		m[3]=new Horse();
		m[4]=new Elephant();
		
		for(int i=0;i<=m.length-1;i++)
		{
			if(m[i] instanceof Vehicle)
			{
				Vehicle v = (Vehicle)m[i]; 
				v.drive();
			}
		}
	}
}
