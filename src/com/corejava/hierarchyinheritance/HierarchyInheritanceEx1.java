package com.corejava.hierarchyinheritance;

public class HierarchyInheritanceEx1 
{
	public static void main(String[] args) 
	{
		Cat cat = new Cat();
		
		cat.eat();
		cat.meaw();
		
		Dog dog = new Dog();
		
		dog.eat();
		dog.bark();
	}
}
