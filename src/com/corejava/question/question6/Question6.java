package com.corejava.question.question6;

// The abstract Monster class has three concrete subclasses named Vampire, Werewolf, and Zombie. Create six different monsters of various types, and store them in a one-dimension array. Create a loop that displays the type of each monster.

public class Question6 
{
	public static void main(String[] args) 
	{
		Monster m[]=new Monster[6];
		
		m[0]=new Vampire();
		m[1]=new Warewolf();
		m[2]=new Vampire();
		m[3]=new Zombie();
		m[4]=new Vampire();
		m[5]=new Zombie();
		
		for(int i=0;i<=m.length-1;i++)
		{
			System.out.println(m[i]);
		}
	}
}
