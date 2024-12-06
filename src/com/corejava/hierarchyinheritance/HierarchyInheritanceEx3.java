package com.corejava.hierarchyinheritance;

public class HierarchyInheritanceEx3 
{
	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle();
		
		rectangle.getData();
		rectangle.displayData();
		rectangle.calcArea();
		
		Triangle triangle = new  Triangle();
		
		triangle.getData();
		triangle.displayData();
		triangle.calcArea();
	}
}
