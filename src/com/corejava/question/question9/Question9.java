package com.corejava.question.question9;

// The abstract class Fish declares one abstract method named display(). It also has two abstract subclasses named FreshWaterFish and SaltWaterFish. Trout is subclass of FreshWaterFish. Tuna and Flounder are subclasses of SaltWaterFish. The main method creates an array of type Fish. Different types of fish are instantiated and assigned to the elements of this array. A loop then iterates through these elements. Notice that the instanceof operator is used to identify if a fish is of type SaltWaterFish. the net effect is that the display() method is called only for saltwater fish.

public class Question9 
{
	public static void main(String[] args) 
	{
		Fish fish[] = new Fish[5];
		
		fish[0]=new Tuna();
		fish[1]=new Trout();
		fish[2]=new Flounder();
		fish[3]=new Tuna();
		fish[4]=new Trout();
		
//		for(int i=0;i<=fish.length-1;i++)
//		{
//			fish[i].display();
//		}
		
		for(int i=0;i<=fish.length-1;i++)
		{
			if(fish[i] instanceof SaltWaterFish)
			{
				fish[i].display();
			}
		}
	} 
	
}
